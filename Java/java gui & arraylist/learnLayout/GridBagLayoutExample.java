package learnLayout;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Button 1 spans 2 columns
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JButton button1 = new JButton("Button 1");
        panel.add(button1, gbc);
        
        // Button 2 spans 2 rows
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        JButton button2 = new JButton("Button 2");
        panel.add(button2, gbc);
        
        // Button 3 with internal padding
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.ipadx = 20; // 20 pixels of internal padding horizontally
        gbc.ipady = 10; // 10 pixels of internal padding vertically
        JButton button3 = new JButton("Button 3");
        panel.add(button3, gbc);
        
        // Button 4 with default settings
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        JButton button4 = new JButton("Button 4");
        panel.add(button4, gbc);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
