package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    TextField textField;

    JButton b1, b2;

    Withdrawl(String pin){

        this.pin=pin;

        /*ATM SIMULATOR IMAGE*/

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label1 = new JLabel("MAXIMUM WITHDRWAL IS RS.10,000");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setForeground(Color.white);
        label1.setBounds(460, 180, 700, 35);
        image.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.white);
        label2.setBounds(460, 220, 400, 35);
        image.add(label2);


        textField = new TextField();
        textField.setBounds(460, 260, 320, 25);
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        /*withdrwal*/

        b1 = new JButton("WITHDRAWL");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        image.add(b2);


        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            try {

                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want to withdrawl");

                } else {

                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from  bank where pin ='" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {

                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));

                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("Insert into bank values('" + pin + "','" + date + "','withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "RS. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);

                }
            } catch (Exception E) {
            }
        }else if(e.getSource()==b2){
            setVisible(false);
            new main_Class(pin);
        }
    }
    public static void main(String[] args) {
        new Withdrawl("");

    }
}

