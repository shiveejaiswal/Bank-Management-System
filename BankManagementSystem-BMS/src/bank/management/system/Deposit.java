package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;

    JButton b1, b2;

    Deposit(String pin) {
        this.pin = pin;

        /*ATM SIMULATOR IMAGE*/

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setForeground(Color.white);
        label1.setBounds(460, 180, 400, 35);
        image.add(label1);


        textField = new TextField();
        textField.setBounds(460, 230, 320, 25);
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        /*DEPOSIT & BACK*/

        b1 = new JButton("DEPOSIT");
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

        try {

            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter You Want to Deposite");
                } else {
                    Con c = new Con();
                    c.statement.executeUpdate("insert into  bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "RS. "+amount+" Deposited Successfuly");
                    setVisible(false);

                }
            }else if (e.getSource() == b2) {
                setVisible(false);
               new main_Class(pin);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
}
