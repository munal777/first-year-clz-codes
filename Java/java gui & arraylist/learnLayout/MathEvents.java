package learnLayout;

import javax.swing.*;
import java.awt.*;

public class MathEvents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Math Events");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();

        // Add labels and text fields for Number 1, Number 2, and Result
        gbc.insets = new Insets(10, 0, 30, 10); // Padding

        // Number 1 Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Number 1:"), gbc);

        // Number 1 TextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(10), gbc);

        // Number 2 Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Number 2:"), gbc);

        // Number 2 TextField
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(10), gbc);

        // Result Label
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Result:"), gbc);

        // Result TextField
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(10), gbc);

        // Add buttons
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBackground(Color.BLACK);
        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.insets = new Insets(15, 5, 5, 5);

        // Plus Button
        gbcButton.gridx = 0;
        gbcButton.gridy = 0;
        buttonPanel.add(new JButton("+"), gbcButton);

        // Minus Button
        gbcButton.gridx = 1;
        gbcButton.gridy = 0;
        buttonPanel.add(new JButton("-"), gbcButton);

        // Clear Button
        gbcButton.gridx = 2;
        gbcButton.gridy = 0;
        buttonPanel.add(new JButton("C"), gbcButton);

        // Add button panel to main panel
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonPanel, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
