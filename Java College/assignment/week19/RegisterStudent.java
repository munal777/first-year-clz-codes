package assignment.week19;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class RegisterStudent implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private Font headFont, lblFont;
    private Border border;
    private  JLabel registerHead, name, dob, gender, address, mobileNo,  password, rePassword, courses, collage, semester;
    private JTextArea nameArea, addressArea, numArea, pwArea, rePwArea; 
    private JComboBox<String> yearComboBox, monthComboBox, dayComboBox, courseComboBox, clzComboBox, semComboBox;
    private JRadioButton male, female;
    private ButtonGroup genders;
    private JButton submit, reset;
    
    public RegisterStudent()
    {
        frame = new JFrame("Student Register Form");
        frame.setSize(660, 760);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(15, 10, 450, 700);
        // panel.setBackground(new Color(220,220,220));
        frame.add(panel);

        headFont = new Font("sans-serif", Font.BOLD, 20);
        lblFont = new Font("Arial", Font.PLAIN, 14);
        border = BorderFactory.createLineBorder(Color.LIGHT_GRAY,2);

        registerHead = new JLabel("Register a new Student");
        registerHead.setBounds(25, 10, 300, 26);
        registerHead.setFont(headFont);
        panel.add(registerHead);

        name = new JLabel("Name");
        name.setBounds(25, 50, 80, 20);
        name.setFont(lblFont);
        panel.add(name);

        nameArea = new JTextArea();
        nameArea.setBounds(130,50,180,22);
        nameArea.setBorder(border);
        panel.add(nameArea);

        dob = new JLabel("DOB");
        dob.setBounds(25, 100, 80, 20);
        dob.setFont(lblFont);
        panel.add(dob);

        String[] yearList = {"1999","2000","2001","2002","2003","2004"};
        yearComboBox = new JComboBox<>(yearList);
        yearComboBox.setBounds(130,98,92,28);
        panel.add(yearComboBox);
        
        String[] monthList = {"January","February","March","April","May","June","July","August","Semptember","October","November","December"};
        monthComboBox =  new JComboBox<>(monthList);
        monthComboBox.setBounds(245, 98, 85, 28);
        panel.add(monthComboBox);

        String[] dayList = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        dayComboBox  = new JComboBox<>(dayList);
        dayComboBox.setBounds(350,98,85,28);
        panel.add(dayComboBox);

        gender = new JLabel("Gender");
        gender.setBounds(25, 150, 80, 20);
        gender.setFont(lblFont);
        panel.add(gender);

        male = new JRadioButton("Male");
        male.setBounds(130, 148, 75, 28);
        male.setFont(lblFont);
        panel.add(male);

        female = new JRadioButton("Female");
        female.setBounds(270, 148, 75, 28);
        female.setFont(lblFont);
        panel.add(female);

        genders = new ButtonGroup();
        genders.add(male);
        genders.add(female);

        address = new JLabel("Address");
        address.setBounds(25, 200, 80, 20);
        address.setFont(lblFont);
        panel.add(address);

        addressArea = new JTextArea();
        addressArea.setLineWrap(true);
        addressArea.setBounds(130, 198, 180, 60);
        panel.add(addressArea);

        mobileNo = new JLabel("Mobile No");
        mobileNo.setBounds(25, 300, 80, 20);
        mobileNo.setFont(lblFont);
        panel.add(mobileNo);

        numArea = new JTextArea();
        numArea.setBounds(130,300,180,22);
        numArea.setBorder(border);
        panel.add(numArea);

        password = new JLabel("Password");
        password.setBounds(25, 350, 80, 20);
        password.setFont(lblFont);
        panel.add(password);

        pwArea = new JTextArea();
        pwArea.setBounds(130,350,180,22);
        pwArea.setBorder(border);
        panel.add(pwArea);

        rePassword = new JLabel("Re Password");
        rePassword.setBounds(25, 400, 100, 20);
        rePassword.setFont(lblFont);
        panel.add(rePassword);

        rePwArea = new JTextArea();
        rePwArea.setBounds(130,400,180,22);
        rePwArea.setBorder(border);
        panel.add(rePwArea);

        courses = new JLabel("Courses");
        courses.setBounds(25, 450, 80, 20);
        courses.setFont(lblFont);
        panel.add(courses);

        String[] courseList = {"BSc Hons Computing","BSc Hons BBA"};
        courseComboBox = new JComboBox<>(courseList);
        courseComboBox.setBounds(130,450,180,22);
        panel.add(courseComboBox);
        

        
        collage = new JLabel("Collage");
        collage.setBounds(25, 500, 80, 20);
        collage.setFont(lblFont);
        panel.add(collage);

        String[] clzList = {"Itahari International Collage","Islington Collage"};
        clzComboBox = new JComboBox<>(clzList);
        clzComboBox.setBounds(130,500,180,22);
        panel.add(clzComboBox);

        semester = new JLabel("Semester");
        semester.setBounds(25, 550, 80, 20);
        semester.setFont(lblFont);
        panel.add(semester);

        String[] semList = {"1","2","3","4","5","6"};
        semComboBox = new JComboBox<>(semList);
        semComboBox.setBounds(130,550,180,22);
        panel.add(semComboBox);

        submit = new JButton("submit");
        submit.setBounds(130,620,140,35);
        submit.setFont(lblFont);
        submit.setBorder(border);
        panel.add(submit);

        reset = new JButton("reset");
        reset.setBounds(305,620,140,35);
        reset.setFont(lblFont);
        reset.setBorder(border);
        panel.add(reset);

        //action listener 
        reset.addActionListener(this);
        submit.addActionListener(this);

        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        RegisterStudent assign = new RegisterStudent();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == reset)
        {
            nameArea.setText("");
            yearComboBox.setSelectedIndex(1);
            monthComboBox.setSelectedIndex(0);
            dayComboBox.setSelectedIndex(6);
            genders.clearSelection();
            addressArea.setText("");
            numArea.setText("");
            pwArea.setText("");
            rePwArea.setText("");
            courseComboBox.setSelectedIndex(0);
            clzComboBox.setSelectedIndex(0);
            semComboBox.setSelectedIndex(0);

        }
        else if (e.getSource() == submit) {
            showDetails();
        }
    }

    private void showDetails()
        {
            String name = nameArea.getText();
            String year = yearComboBox.getSelectedItem().toString();
            String month = monthComboBox.getSelectedItem().toString();
            String day = dayComboBox.getSelectedItem().toString();
            // String gender = genders.getSelection().toString();
            String selectedOption = "";
            if (male.isSelected())
            {
                selectedOption = male.getText();
            }
            else if (female.isSelected())
            {
                selectedOption = female.getText();
            }
            else
            {
                selectedOption ="<html><span style='color:red;'>Select the gender!</span></html>";
            }
            String Address = addressArea.getText();
            String mobile = numArea.getText();
            String pw = pwArea.getText();
            String rePw = rePwArea.getText();
            String course = courseComboBox.getSelectedItem().toString();
            String collage = clzComboBox.getSelectedItem().toString();
            String semester = semComboBox.getSelectedItem().toString();

            

            if(name.isEmpty() || Address.isEmpty() || mobile.isEmpty() || pw.isEmpty() || rePw.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"<html><span style='color:red;'>Please!!  fill all the form.</span></html>", "Form Error", JOptionPane.ERROR_MESSAGE);
            
            }
            else if(!pw.equals(rePw))
            {
                JOptionPane.showMessageDialog(null,"<html><span style='color:black;'>Enter the correct Re password!!</span></html>" , "Password Error", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                String message = "Name: " +name+"\nYear: " +year+"\nMonth: "+month+"\nDay: "+day+"\nGender: "+selectedOption+
                "\nAddress: "+Address+"\nPhone no: "+mobile+"\nPassword: "+pw+"\nRe password: "+rePw+"\nCourse: "+course+
                "\nCollge: "+collage+"\nSemester: "+semester;
                JOptionPane.showMessageDialog(null, message, "Info of User", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
        }
}
