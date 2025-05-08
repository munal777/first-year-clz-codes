package gui;

import javax.swing.*;
import java.awt.*;

public class ColorExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Color Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel with a custom background color
        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 200, 255));  // Light blue

        // Create a label with custom foreground color
        JLabel label = new JLabel("This is a label");
        label.setForeground(Color.RED);  // Red text

        // Create a button with custom background color
        JButton button = new JButton("Click Me");
        button.setBackground(Color.YELLOW);  // Yellow background

        // Add components to the panel
        panel.add(label);
        panel.add(button);

        // Add panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}

