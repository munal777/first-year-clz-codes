package  learnLayout;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutAdvancedExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Advanced GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Number 1 Label with insets and anchor
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(10, 10, 5, 10); // Top, Left, Bottom, Right
        panel.add(new JLabel("Number 1:"), gbc);

        // Number 1 TextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 5, 10); // Top, Left, Bottom, Right
        panel.add(new JTextField(10), gbc);

        // Number 2 Label with insets and anchor
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 10, 5, 10); // Top, Left, Bottom, Right
        panel.add(new JLabel("Number 2:"), gbc);

        // Number 2 TextField
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 0, 5, 10); // Top, Left, Bottom, Right
        panel.add(new JTextField(10), gbc);

        // Result Label with insets and anchor
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 10, 10, 10); // Top, Left, Bottom, Right
        panel.add(new JLabel("Result:"), gbc);

        // Result TextField
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 0, 10, 10); // Top, Left, Bottom, Right
        panel.add(new JTextField(10), gbc);

        // Button Panel
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.insets = new Insets(5, 5, 5, 5);

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
        gbc.insets = new Insets(20, 10, 10, 10); // Top, Left, Bottom, Right
        panel.add(buttonPanel, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
