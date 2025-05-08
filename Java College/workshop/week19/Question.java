package workshop.week19;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Question {
    private JFrame frame;
    private JPanel panel1, panel2, panel3;
    private JComboBox<String> comboBox1, comboBox2;
    private JCheckBox checkBox1, checkBox2;
    private JRadioButton radioButton1, radioButton2;
    private ButtonGroup buttonGroup;
    private JTextArea textArea;

    public Question()
    {
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel1 = new JPanel();
        panel1.setBounds(50,30,300,200);
        panel1.setBackground(Color.GRAY);

        comboBox1 = new JComboBox<>();
        comboBox1.addItem("item 1");
        comboBox1.addItem("item 2");
        panel1.add(comboBox1);

        //by using arraylist
        String[] items = {"item 1","item 2","item 3","item 4"};
        comboBox2 = new JComboBox<>(items);
        panel1.add(comboBox2);

        panel2 = new JPanel();
        panel2.setBounds(450,30,300,200);
        panel2.setBackground(Color.BLUE);

        checkBox1 = new JCheckBox("Male");
        checkBox2 = new JCheckBox("Female");
        panel2.add(checkBox1);
        panel2.add(checkBox2);

        panel3 = new JPanel();
        panel3.setBounds(50,260,700,180);
        panel3.setBackground(Color.RED);

        radioButton1 = new JRadioButton("Radio Button");
        radioButton1.setForeground(Color.WHITE);
        radioButton1.setBackground(Color.BLACK);
        panel3.add(radioButton1);

        radioButton2 = new JRadioButton("Radio Button");
        radioButton2.setForeground(Color.WHITE);
        radioButton2.setBackground(Color.BLACK);
        panel3.add(radioButton2);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        textArea = new JTextArea(3,20);
        textArea.setLineWrap(true); //wrap on huda row will increase but if wrap is false columns will increase it size
        panel3.add(textArea);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Question dis = new Question();
    }
}
