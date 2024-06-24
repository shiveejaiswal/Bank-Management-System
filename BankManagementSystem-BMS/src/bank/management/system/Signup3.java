package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6;

    JButton s,c;

    String formno;
    Signup3(String formno){

        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        /*PAGE NUMBER*/
        JLabel label1 = new JLabel("Page 3:-");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(280,40,4000,40);
        add(label1);


        /*Account Detail*/
        JLabel label2 = new JLabel("Account Details:-");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(280,70,400,40);
        add(label2);


        /*ACCOUNT Type*/
        JLabel label3 = new JLabel("Account Type:");
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        label3.setBounds(100,140,200,40);
        add(label3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,150,30);
        r1.setBackground(new Color(215,252,252));
        add(r1);


        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,180,300,30);
        r2.setBackground(new Color(220,252,252));
        add(r2);


        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,250,30);
        r3.setBackground(new Color(215,252,252));
        add(r3);


        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,220,250,30);
        r4.setBackground(new Color(215,252,252));
        add(r4);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);


        /*CARD NUMBER*/
        JLabel label4 = new JLabel("Card Number:");
        label4.setFont(new Font("Raleway",Font.BOLD,18));
        label4.setBounds(100,300,200,30);
        add(label4);

        /*YOUR 16-DIGIT CARD NUMBER*/
        JLabel label5 = new JLabel("(Your 16-Digit Card Number)");
        label5.setFont(new Font("Raleway",Font.BOLD,13));
        label5.setBounds(100,330,250,30);
        add(label5);

        JLabel label6 = new JLabel("XXX-XXX-XXXX-4841");
        label6.setFont(new Font("Raleway",Font.BOLD,13));
        label6.setBounds(330,300,250,30);
        add(label6);

        JLabel label7 = new JLabel("(It would appear on atm card/cheque Book and Statement)");
        label7.setFont(new Font("Raleway",Font.BOLD,13));
        label7.setBounds(330,330,500,30);
        add(label7);


        /*PIN NUMBER*/
        JLabel label8 = new JLabel("PIN:");
        label8.setFont(new Font("Raleway",Font.BOLD,18));
        label8.setBounds(100,370,200,30);
        add(label8);

        JLabel label9 = new JLabel("XXXX");
        label9.setFont(new Font("Raleway",Font.BOLD,18));
        label9.setBounds(330,370,200,30);
        add(label9);

        JLabel label10 = new JLabel("(Your 4-digit Password)");
        label10.setFont(new Font("Raleway",Font.BOLD,12));
        label10.setBounds(100,400,200,20);
        add(label10);

        JLabel label11 = new JLabel("Services Required:");
        label11.setFont(new Font("Raleway",Font.BOLD,18));
        label11.setBounds(100,450,200,20);
        add(label11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 =new JCheckBox("I here by declare that the above entered details is correct to the best of my knowledge.",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);

        JLabel label12 =new JLabel("Form no:-");
        label12.setFont(new Font("Raleway",Font.BOLD,14));
        label12.setBounds(640,10,100,30);
        add(label12);

        JLabel label13 =new JLabel(formno);
        label13.setFont(new Font("Raleway",Font.BOLD,14));
        label13.setBounds(710,10,60,30);
        add(label13);

        /*SUBMIT AND CANCEL BUTTON*/

        s =new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.white);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);


        c =new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(300,1);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Signup3("");
        String atype= null;

        if (r1.isSelected()){
            atype ="Saving Account";
        }else if (r2.isSelected()){
            atype="Fixed Deposit Account";
        }else if (r2.isSelected()){
            atype="Current Account";
        }else if (r2.isSelected()){
            atype="Recurring Deposit Account";
        }
        Random ran= new Random();
        long first7 =(ran.nextLong() % 90000000L)+1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin ="" + Math.abs(first3);


        String fac ="";
        if (c1.isSelected()){
            fac = fac+"ATM CARD";
        }else if (c2.isSelected()){
            fac =fac+"INTERNET BANKING";
        }else if (c3.isSelected()){
            fac =fac+"MOBILE BANKING";
        }else if (c4.isSelected()){
            fac =fac+"EMAIL Alerts";
        }else  if (c5.isSelected()){
            fac =fac+"Cheque Book";
        }else if (c6.isSelected()){
            fac= fac+"E-Statement";
        }

        try{

            if (e.getSource()==s){
                /* assert atype != null;*/
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Con c1 =new Con();

                    String q1 ="insert into  signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 ="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if(e.getSource()==c){
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");

    }
}
