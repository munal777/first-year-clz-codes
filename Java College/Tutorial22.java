import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.Color;

/**
 * Tutorial22
 */
public class Tutorial22 extends JFrame {

    private JPanel panel;
    private JTextArea textArea;
    private JLabel label;
    private JButton upperCaseButton, lowerCaseButton, letterCountButton, wordCountButton;

    public Tutorial22() {
        setTitle("Tutorial 22");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        // setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        // panel.setBorder(BorderFactory.createTitledBorder(2,"Munal"));
        panel.setBounds(10, 10, 400, 500);
  
        add(panel);

        label = new JLabel("Enter your text here");
        label.setBounds(30, 10, 200, 20);
        panel.add(label);

        textArea = new JTextArea();
        textArea.setBounds(30, 30, 250, 200);
        textArea.setLineWrap(true);
        panel.add(textArea);

        upperCaseButton = new JButton("Upper Case");
        upperCaseButton.setBounds(30, 250, 100, 30);
        panel.add(upperCaseButton);

        //actionlistener
        upperCaseButton.addActionListener(e -> {
            convertToUpperCase();
        });
    
        lowerCaseButton = new JButton("Lower Case");
        lowerCaseButton.setBounds(140, 250, 100, 30);
        panel.add(lowerCaseButton);

        //actionlistener
        lowerCaseButton.addActionListener(e -> {
            convertToLowerCase();
        });


        wordCountButton = new JButton("Word Count");
        wordCountButton.setBounds(250, 250, 100, 30);
        panel.add(wordCountButton);

        // actionlistener
        wordCountButton.addActionListener(e->{
            countWord();
        });

        letterCountButton = new JButton("Letter Count");
        letterCountButton.setBounds(30, 290, 100, 30);
        panel.add(letterCountButton);

        // actionlistener
        letterCountButton.addActionListener(e->{
            countLetter();
        });


        setVisible(true);

    }

    public static void main(String[] args) {
        new Tutorial22();
    }

    public void convertToUpperCase()
    {
        String text = textArea.getText();
        textArea.setText(text.toUpperCase());
    }

    public void convertToLowerCase()
    {
        String text = textArea.getText();
        textArea.setText(text.toLowerCase());
    }

    

    public void countLetter()
    {
        String text = textArea.getText();
        int length = text.replaceAll("\\s","").length();
        // String jooinedText = text.replaceAll("\\s", "");
        JOptionPane.showMessageDialog(null, length, "letter count", JOptionPane.INFORMATION_MESSAGE);
    }

    public void countWord()
    {
        String text = textArea.getText();
        String[] words = text.split(" ");
        int length = words.length;
        JOptionPane.showMessageDialog(null, length, "word count", JOptionPane.INFORMATION_MESSAGE);


    }

}