package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    /*MARITAL STATUS CLASS BUTTON*/
    JRadioButton r1,r2,M1,M2,M3;

    /*BUTTON FOR SUBMIT*/
    JButton Next;

    /*PERSIONAL DETAIL CLASSES*/
    JTextField textName, textFname, textEmail,textMS,textADD,textCity,textPincode,textState;
    JDateChooser dateChooser;

    /*RANDOM NUMBER GENRATE FOR APPLICATION FORM*/
    Random ran =new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);

    Signup(){

        /*CREATE APPLICATION FORM AND BANK ICON*/
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        /*Random form number connection*/
        JLabel label1 = new JLabel("APPLICATON FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        /*PAGE NUMBER*/
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        /*Personal Detail*/
        JLabel label3 = new JLabel("Personal Detail");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        /*Father Name*/
        JLabel labelFName = new JLabel("Father's Name:");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        /*DOB*/
        JLabel DOB= new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        /*GENDER*/

        JLabel labelG =new JLabel("Gender:");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        /*E-Mail*/

        JLabel labelEmail = new JLabel("Email Address:");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add( textEmail);


        /*MARITAL STATUS*/

        JLabel labelMS = new JLabel("Marital Status:");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        M1 = new JRadioButton("Married");
        M1.setFont(new Font("Raleway",Font.BOLD,14));
        M1.setBackground(new Color(222,255,228));
        M1.setBounds(300,440,100,30);
        add(M1);

        M2 = new JRadioButton("Unmarried");
        M2.setFont(new Font("Raleway",Font.BOLD,14));
        M2.setBackground(new Color(222,255,228));
        M2.setBounds(450,440,100,30);
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setFont(new Font("Raleway",Font.BOLD,14));
        M3.setBackground(new Color(222,255,228));
        M3.setBounds(630,440,100,30);
        add(M3);

        ButtonGroup buttonGroup1  = new ButtonGroup();
        buttonGroup1.add(M1);
        buttonGroup1.add(M2);
        buttonGroup1.add(M3);

        /*ADDRESS*/

        JLabel labelADD = new JLabel("Address:");
        labelADD.setFont(new Font("Raleway",Font.BOLD,20));
        labelADD.setBounds(100,490,200,30);
        add(labelADD);

        textADD = new JTextField();
        textADD.setFont(new Font("Raleway",Font.BOLD,14));
        textADD.setBounds(300,490,400,30);
        add(textADD);

        /*CITY*/

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        /*PINCODE*/

        JLabel labelPincode = new JLabel("Pincode:");
        labelPincode.setFont(new Font("Raleway",Font.BOLD,20));
        labelPincode.setBounds(100,590,200,30);
        add(labelPincode);

        textPincode = new JTextField();
        textPincode.setFont(new Font("Raleway",Font.BOLD,14));
        textPincode.setBounds(300,590,400,30);
        add(textPincode);


        /*SATE*/

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);


        Next = new JButton("Next");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setBackground(Color.black);
        Next.setForeground(Color.white);
        Next.setBounds(620,710,80,30);
        Next.addActionListener(this);
        add(Next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(300,1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (M1.isSelected()) {
            marital = "Married";
        } else if (M2.isSelected()) {
            marital = "Unmarried";
        } else if (M3.isSelected()) {
            marital = "Other";
        }
        String address = textADD.getText();
        String City = textCity.getText();
        String Pincode = textPincode.getText();
        String state = textState.getText();

        try{

            if (textName.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+City+"','"+Pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);

                new  Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Signup();
    }
}

