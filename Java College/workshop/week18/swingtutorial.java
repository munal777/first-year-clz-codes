package workshop.week18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

public class swingtutorial {
    private JFrame frame;
    private JLabel lblHeading;
    private JLabel lblUserName;
    private JLabel lblPassword;
    private JButton loginBtn;
    private JTextArea usernameArea;
    private JTextArea passwordArea;

    public swingtutorial()
    {
        frame = new JFrame();

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);

        Font head = new Font("Arial", Font.BOLD, 25);

        lblHeading = new JLabel("Login Form");
        lblHeading.setBounds(140, 20, 180, 28);
        lblHeading.setFont(head);
        frame.add(lblHeading);

        lblUserName = new JLabel("Username: ");
        lblUserName.setBounds(120, 60, 100, 20);
        frame.add(lblUserName);

        usernameArea = new JTextArea();
        usernameArea.setBounds(200, 60, 100, 18);
        frame.add(usernameArea);

        lblPassword = new JLabel("Password: ");
        lblPassword.setBounds(120, 85, 100, 20);
        frame.add(lblPassword);

        passwordArea = new JTextArea();
        passwordArea.setBounds(200, 85, 100, 18);
        frame.add(passwordArea);

        loginBtn = new JButton("Log In");
        loginBtn.setBounds(150, 150, 100, 30);
        frame.add(loginBtn);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        swingtutorial st = new swingtutorial();
    }
}