package learnLayout;
import javax.swing.*;
import java.awt.*;

public class GridBagExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        // Create first panel
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.insets = new Insets(5, 5, 5, 5);

        JButton button1 = new JButton("Button 1");
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.gridwidth = 2; // Span 2 columns
        gbc1.gridheight = 1;
        panel1.add(button1, gbc1);

        JButton button2 = new JButton("Button 2");
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        panel1.add(button2, gbc1);

        JButton button3 = new JButton("Button 3");
        gbc1.gridx = 1;
        gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 2; // Span 2 rows
        panel1.add(button3, gbc1);

        JButton button4 = new JButton("Button 4");
        gbc1.gridx = 0;
        gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        panel1.add(button4, gbc1);

        // Create second panel
        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.insets = new Insets(5, 5, 5, 5);

        JButton button5 = new JButton("Button 5");
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.gridwidth = 3; // Span 3 columns
        gbc2.gridheight = 1;
        panel2.add(button5, gbc2);

        JButton button6 = new JButton("Button 6");
        gbc2.gridx = 0;
        gbc2.gridy = 1;
        gbc2.gridwidth = 1;
        gbc2.gridheight = 1;
        panel2.add(button6, gbc2);

        JButton button7 = new JButton("Button 7");
        gbc2.gridx = 1;
        gbc2.gridy = 1;
        gbc2.gridwidth = 1;
        gbc2.gridheight = 1;
        panel2.add(button7, gbc2);

        JButton button8 = new JButton("Button 8");
        gbc2.gridx = 2;
        gbc2.gridy = 1;
        gbc2.gridwidth = 1;
        gbc2.gridheight = 2; // Span 2 rows
        panel2.add(button8, gbc2);

        JButton button9 = new JButton("Button 9");
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        gbc2.gridwidth = 2; // Span 2 columns
        gbc2.gridheight = 1;
        panel2.add(button9, gbc2);

        // Add panels to the frame
        GridBagConstraints frameGbc = new GridBagConstraints();
        frameGbc.fill = GridBagConstraints.BOTH;
        frameGbc.insets = new Insets(10, 10, 10, 10);

        frameGbc.gridx = 0;
        frameGbc.gridy = 0;
        frame.add(panel1, frameGbc);

        frameGbc.gridx = 1;
        frameGbc.gridy = 0;
        frame.add(panel2, frameGbc);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}

