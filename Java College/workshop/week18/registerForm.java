package workshop.week18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

public class registerForm
{
    private JFrame frame;
    private JLabel lblHeading, lblFirstName, lblLastName, EmailAddress, lblUserName, lblPassword, lblNumber;
    private JTextArea FirstNameArea, LastNameArea, EmailAddressArea, UserNameArea, PasswordArea, NumberArea;
    private JButton registerBtn; 

    public registerForm()
    {
        frame = new JFrame();

        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);

        Font font = new Font("Arial", Font.BOLD, 40);

        lblHeading = new JLabel("Register User");
        lblFirstName = new JLabel("First name: ");
        lblLastName = new JLabel("Last name: ");
        EmailAddress = new JLabel("Email address: ");
        lblFirstName = new JLabel("First name: ");

        lblUserName = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        lblNumber = new JLabel("Mobile number: ");

        FirstNameArea = new JTextArea();        
        LastNameArea = new JTextArea();        
        EmailAddressArea = new JTextArea();        
        UserNameArea = new JTextArea();        
        PasswordArea = new JTextArea();        
        NumberArea = new JTextArea();        


        lblHeading.setBounds(350, 50, 400, 60);

        lblFirstName.setBounds(120,150,80,20);
        FirstNameArea.setBounds(200, 150, 120, 20);

        lblUserName.setBounds(600,150,80,20);
        UserNameArea.setBounds(680, 150, 120, 20);

        lblLastName.setBounds(120,200,80,20);
        LastNameArea.setBounds(200, 200, 120, 20);

        lblPassword.setBounds(600,200,80,20);
        PasswordArea.setBounds(680, 200, 120, 20);

        EmailAddress.setBounds(100,250,100,20);
        EmailAddressArea.setBounds(200, 250, 120, 20);

        lblNumber.setBounds(580,250,100,20);
        NumberArea.setBounds(680, 250, 120, 20);
        
        lblHeading.setFont(font);
        frame.add(lblHeading);        
        frame.add(lblFirstName); 
        frame.add(FirstNameArea);
        frame.add(lblUserName);
        frame.add(UserNameArea);
        frame.add(lblLastName);
        frame.add(LastNameArea);
        frame.add(lblPassword);
        frame.add(PasswordArea);
        frame.add(EmailAddress);
        frame.add(EmailAddressArea);
        frame.add(lblNumber);
        frame.add(NumberArea);

        Font btn = new Font("Arial", Font.BOLD, 20);
        registerBtn = new JButton("Register");
        registerBtn.setBounds(400,350,150,50);
        registerBtn.setFont(btn);
        frame.add(registerBtn);




        frame.setVisible(true);
    }

    public static void main(String[] args) {
        registerForm rt = new registerForm();
    }
}