package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;
    Login() {
        super("Bank Management System");
        /*adding bank image icon into login frame*/
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);
        /*adding card image icon into login frame*/
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image j2 = j1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel jmage = new JLabel(j3);
        jmage.setBounds(630, 350, 100, 100);
        add(jmage);
        /*frame text label add WELCOME TO ATM */
        JLabel label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label1.setBounds(150, 125, 800, 50);
        add(label1);
        /* Adding CARD NUMBER LABLE*/
        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Railway", Font.BOLD, 28));
        label2.setForeground(Color.white);
        label2.setBounds(150, 190, 375, 30);
        add(label2);
        /*ADDING CARD NUMBER TEXTFIELD*/
        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);
        /* Adding PIN NUMBER LABEL*/
        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Railway", Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(150, 250, 375, 30);
        add(label3);
        /*ADDING PIN NUMBER PASSWORDFIELD*/
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);
        /*ADDING BUTTON SIGNIN ,CLEAR,SIGNUP*/
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arail", Font.BOLD, 14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arail", Font.BOLD, 14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arail", Font.BOLD, 14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300, 350, 250, 30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image k2 = k1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon k3 = new ImageIcon(k2);
        JLabel kmage = new JLabel(k3);
        kmage.setBounds(0, 0, 850, 480);
        add(kmage);
        setLayout(null);
        setSize(850, 480);
        setLocation(250, 150);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()==button1) {
                Con c = new Con();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    setVisible(false);
                    new main_Class(pin);

                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {
                /*Signup page connection*/
                new Signup();
                setVisible(false);
            }
        } catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
        });
    }
}
