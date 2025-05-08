package gui.ActionLIstner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class MyFrame extends JFrame implements ActionListener {
    private JButton button1, button2;
    private JTextArea nameArea;
    private JLabel invisibleLbl;
    private JComboBox<String> day;
    private JRadioButton male, female;
    private ButtonGroup gender;

    public MyFrame()
    {
        Border border = BorderFactory.createLineBorder(Color.black,2);

        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Submit");
        button1.setBounds(80, 200, 120, 32);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Reset");
        button2.setBounds(250, 200, 120, 32);
        button2.addActionListener(this);
        add(button2);

        JLabel name = new JLabel("Name:");
        name.setBounds(80, 50, 80, 20);
        add(name);

        String[] days = {"sunday","monday","tuesday","wednesday","friday","saturday"};
        day = new JComboBox<>(days);
        day.setBounds(300, 50, 120, 22);
        add(day);

        male = new JRadioButton("Male");
        male.setBounds(200,160,80,22);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(300,160,80,22);
        add(female);

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        ImageIcon icon = new ImageIcon("gui/strawberry.jpg");
        invisibleLbl = new JLabel("Name:");
        invisibleLbl.setBounds(80, 80, 180, 150);
        invisibleLbl.setIcon(icon);
        invisibleLbl.setVisible(false);
        add(invisibleLbl);

        nameArea = new JTextArea();
        nameArea.setBounds(160, 50, 100, 22);
        nameArea.setBorder(border);
        add(nameArea);


        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button2)
        {
            nameArea.setText("");
            invisibleLbl.setVisible(true);
            day.setSelectedIndex(3);
            gender.clearSelection();
        }
        if(e.getSource() == button1)
        {
            String name = nameArea.getText();
            // button1.setText(name);
            JOptionPane.showMessageDialog(null, name, "tittle", JOptionPane.ERROR_MESSAGE);
        }
    }
    
} 