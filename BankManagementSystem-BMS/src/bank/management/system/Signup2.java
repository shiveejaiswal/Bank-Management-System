package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Signup2 extends JFrame implements ActionListener {


    /*FOR DROP-DOWN*/
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;

    JButton next;

    JRadioButton r1, r2; // For Senior Citizen
    JRadioButton e1, e2; // For Existing Account

    JTextField textPan,textAadhar;


    String formno;


    Signup2(String formno){


        super("APPLICATION FORM");



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;


        /*PAGE NUMBER*/
        JLabel label1 = new JLabel("Page 2:-");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(360,30,150,40);
        add(label1);


        /*ADDITIONAL DETAILS*/
        JLabel label2 = new JLabel("Additional Details");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,60,600,40);
        add(label2);


        /*RELIGION*/
        JLabel label3 = new JLabel("Religion:");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(100,120,100,30);
        add(label3);

        /*DROP-DOWN IN RELIGION*/
        String religion[]={"Muslim","Hindu","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        /*CATEGORY*/
        JLabel label4 = new JLabel("Category:");
        label4.setFont(new Font("Raleway",Font.BOLD,22));
        label4.setBounds(100,170,110,30);
        add(label4);

        /*DROP-DOWN IN CATEGORY*/
        String Category[]={"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);


        /*INCOME*/
        JLabel label5 = new JLabel("Income:");
        label5.setFont(new Font("Raleway",Font.BOLD,22));
        label5.setBounds(100,220,100,30);
        add(label5);

        /*DROP-DOWN IN INCOME*/
        String income[]={"Null","<1,50,000","<2,50,000","5,00,000","Up to 1,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);


        /*EDUCATIONAL*/
        JLabel label6 = new JLabel("Educational:");
        label6.setFont(new Font("Raleway",Font.BOLD,22));
        label6.setBounds(100,270,140,30);
        add(label6);

        /*DROP-DOWN IN EDUCATIONAL*/
        String educational[]={"Not-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);



        /*OCCUPATION*/
        JLabel label7 = new JLabel("Occupation:");
        label7.setFont(new Font("Raleway",Font.BOLD,22));
        label7.setBounds(100,320,140,30);
        add(label7);

        /*DROP-DOWN IN OCCUPATION*/
        String Occupation[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);


        /*PAN-NUMBER*/
        JLabel label9 = new JLabel("PAN NUMBER:");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(100,370,170,30);
        add(label9);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,20));
        textPan.setBounds(350,370,320,30);
        add( textPan);


        /*AADHAR-NUMBER*/
        JLabel label10 = new JLabel("Aadhar NUMBER:");
        label10.setFont(new Font("Raleway",Font.BOLD,20));
        label10.setBounds(100,420,170,30);
        add(label10);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,20));
        textAadhar.setBounds(350,420,320,30);
        add( textAadhar);


        /*SENIOR CITIZEN*/
        JLabel label11 = new JLabel("Senior Citizen:");
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        label11.setBounds(100,470,180,30);
        add(label11);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(570,470,100,30);
        add(r2);

        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        /*EXISTING ACCOUNT*/
        JLabel label12 = new JLabel("Existing Account:");
        label12.setFont(new Font("Raleway",Font.BOLD,20));
        label12.setBounds(100,520,180,30);
        add(label12);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,520,180,30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(570,520,180,30);
        add(e2);

        ButtonGroup buttonGroup1  = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        /*FORM*/

        JLabel label13 = new JLabel("Form No:");
        label13.setFont(new Font("Raleway",Font.BOLD,14));
        label13.setBounds(640,10,100,30);
        add(label13);

        JLabel label14 = new JLabel(formno);
        label14.setFont(new Font("Raleway",Font.BOLD,14));
        label14.setBounds(720,10,100,30);
        add(label14);

        /*JBUTTON*/

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(300,1);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = (String) textPan.getText();
        String aadhar = (String) textAadhar.getText();

        String scitizen= " ";
        if ((r1.isSelected())){
            scitizen ="Yes";
        }else if (r2.isSelected()){
            scitizen ="No";
        }

        String eAccount = " ";
        if ((e1.isSelected())){
            eAccount ="Yes";
        }else if (e2.isSelected()){
            eAccount ="No";
        }

        try{

            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the  fields");
            }else {

                Con c1 = new Con();
                String q = "insert into Signuptwo values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Signup2("");

    }
}


