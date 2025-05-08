package learnLayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Store Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);

        // Main panel with GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.DARK_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();

        // Add Store Info Panel
        JPanel storeInfoPanel = createStoreInfoPanel();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.NORTHWEST;
        mainPanel.add(storeInfoPanel, gbc);

        // Add Department Info Panel
        JPanel departmentInfoPanel = createDepartmentInfoPanel();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(departmentInfoPanel, gbc);

        // Add Retailer Info Panel
        JPanel retailerInfoPanel = createRetailerInfoPanel();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        mainPanel.add(retailerInfoPanel, gbc);

        // Add Display Button
        JButton displayButton = new JButton("Display");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(20, 10, 10, 10);
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        mainPanel.add(displayButton, gbc);

        // Add Clear Button
        JButton clearButton = new JButton("Clear");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(20, 10, 10, 10);
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        mainPanel.add(clearButton, gbc);

        add(mainPanel);
    }

    private JPanel createStoreInfoPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Store Info"));
        panel.setBackground(Color.DARK_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel storeIdLabel = new JLabel("Store Id:");
        JLabel storeNameLabel = new JLabel("Store Name:");
        JLabel storeIdLabel2 = new JLabel("Store Id:");
        JLabel openingHourLabel = new JLabel("Opening Hour:");
        JTextField storeIdField = new JTextField(10);
        JTextField storeNameField = new JTextField(10);
        JTextField storeIdField2 = new JTextField(10);
        JTextField openingHourField = new JTextField(10);

        storeIdLabel.setForeground(Color.WHITE);
        storeNameLabel.setForeground(Color.WHITE);
        storeIdLabel2.setForeground(Color.WHITE);
        openingHourLabel.setForeground(Color.WHITE);

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(storeIdLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(storeIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(storeNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(storeNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(storeIdLabel2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(storeIdField2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(openingHourLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(openingHourField, gbc);

        return panel;
    }

    private JPanel createDepartmentInfoPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Department Info"));
        panel.setBackground(Color.DARK_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel productNameLabel = new JLabel("Product Name:");
        JLabel markedPriceLabel = new JLabel("Marked Price:");
        JLabel sellingPriceLabel = new JLabel("Selling Price:");
        JLabel totalSalesLabel = new JLabel("Total Sales:");
        JLabel totalDiscountLabel = new JLabel("Total Discount:");
        JTextField productNameField = new JTextField(10);
        JTextField markedPriceField = new JTextField(10);
        JTextField sellingPriceField = new JTextField(10);
        JTextField totalSalesField = new JTextField(10);
        JTextField totalDiscountField = new JTextField(10);
        JButton calculateDiscountButton = new JButton("Calculate Discount");
        JButton addDepartmentButton = new JButton("Add Department");

        productNameLabel.setForeground(Color.WHITE);
        markedPriceLabel.setForeground(Color.WHITE);
        sellingPriceLabel.setForeground(Color.WHITE);
        totalSalesLabel.setForeground(Color.WHITE);
        totalDiscountLabel.setForeground(Color.WHITE);

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(productNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(productNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(markedPriceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(markedPriceField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(sellingPriceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(sellingPriceField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(calculateDiscountButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(new JSeparator(), gbc);

        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(totalSalesLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(totalSalesField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(totalDiscountLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(totalDiscountField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(addDepartmentButton, gbc);

        return panel;
    }

    private JPanel createRetailerInfoPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Retailer Info"));
        panel.setBackground(Color.DARK_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel vatPriceLabel = new JLabel("VAT Price:");
        JLabel loyaltyPointLabel = new JLabel("Loyalty Point:");
        JLabel onlinePaymentLabel = new JLabel("Online Payment:");
        JLabel purchasedYearLabel = new JLabel("Purchased Year:");
        JTextField vatPriceField = new JTextField(10);
        JTextField loyaltyPointField = new JTextField(10);
        JRadioButton onlinePaymentYes = new JRadioButton("Yes");
        JRadioButton onlinePaymentNo = new JRadioButton("No");
        ButtonGroup onlinePaymentGroup = new ButtonGroup();
        onlinePaymentGroup.add(onlinePaymentYes);
        onlinePaymentGroup.add(onlinePaymentNo);
        JComboBox<String> purchasedYearComboBox = new JComboBox<>(new String[]{"2020", "2021", "2022", "2023", "2024"});
        JButton loyaltyPointButton = new JButton("Loyalty Point");
        JButton removeProductButton = new JButton("Remove Product");
        JButton addRetailerButton = new JButton("Add Retailer");

        vatPriceLabel.setForeground(Color.WHITE);
        loyaltyPointLabel.setForeground(Color.WHITE);
        onlinePaymentLabel.setForeground(Color.WHITE);
        purchasedYearLabel.setForeground(Color.WHITE);
        onlinePaymentYes.setForeground(Color.WHITE);
        onlinePaymentNo.setForeground(Color.WHITE);
        onlinePaymentYes.setBackground(Color.DARK_GRAY);
        onlinePaymentNo.setBackground(Color.DARK_GRAY);

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(vatPriceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(vatPriceField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(loyaltyPointLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(loyaltyPointField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(onlinePaymentLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(onlinePaymentYes, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(onlinePaymentNo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(purchasedYearLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(purchasedYearComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(loyaltyPointButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(removeProductButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(addRetailerButton, gbc);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
