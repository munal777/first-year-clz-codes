

// import javax.swing.BorderFactory;
// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JCheckBox;
// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JTextField;
// import javax.swing.border.Border;
// import javax.swing.border.TitledBorder;

// public class StoreGUI extends JFrame {
//     // private JFrame frame;
//     private JLabel storeId, storeName, Location, openingHour, totalSales, totalDiscount, productName, markedPrice, sellingPrice, vatPrice, loyalityPoint, isPaymentOnline, purchasedYear;
//     private JTextField storeIdField, storeNameField, LocationField, openingHourField, totalSalesField, totalDiscountField, productNameField, markedPriceField, sellingPriceField, vatPriceField, loyalityPointField;
//     private JCheckBox isPayOnline, isPayOffline;
//     private ButtonGroup paymentSystem;
//     private JComboBox<String> yearsComboBox;
//     private JButton addDepartment, addRetailer, calculateDiscoutPrice, setLoyalityPoint, removeProduct, display, clear;

//     //creating constructor of StoreGUI class
//     public StoreGUI()
//     {
//         Border fieldBorder = BorderFactory.createLineBorder( new Color(240,240,240), 2);
//         Font lblFont = new Font("Arial", Font.PLAIN, 14);

//         // frame = new JFrame();
//         setSize(1220, 820);
//         setLayout(null);
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         getContentPane().setBackground(new Color(167,167,167));
//         setResizable(true);

//         JPanel mainPanel = new JPanel();
//         mainPanel.setLayout(null);
//         mainPanel.setBounds(20,20,1165,745);
//         mainPanel.setBackground(new Color(60,60,60));
//         add(mainPanel);

//         //creating left panel  where store info will be presented
//         JPanel leftPanel = new JPanel();
//         leftPanel.setLayout(null);
//         leftPanel.setBorder(BorderFactory.createTitledBorder(fieldBorder,"<html><span style='color:white;'>Store info<span></html>",TitledBorder.LEFT,TitledBorder.TOP));
//         leftPanel.setBounds(40, 100, 300, 350);
//         leftPanel.setBackground(new Color(60,60,60));
//         mainPanel.add(leftPanel);


//         //Jlebel text adding in leftPanel
//         storeId = new JLabel("Store Id:");
//         storeId.setBounds(20,50,80,20);
//         storeId.setFont(lblFont);
//         leftPanel.add(storeId);

//         storeName = new JLabel("Store Name:");
//         storeName.setBounds(20,100,80,20);
//         storeName.setFont(lblFont);
//         leftPanel.add(storeName);

//         Location = new JLabel("Store Id:");
//         Location.setBounds(20,150,80,20);
//         Location.setFont(lblFont);
//         leftPanel.add(Location);

//         openingHour = new JLabel("Opening Hour:");
//         openingHour.setBounds(20,200,100,20);
//         openingHour.setFont(lblFont);
//         leftPanel.add(openingHour);


//         //JTextField adding in leftPanel
//         storeIdField = new JTextField();
//         storeIdField.setBounds(130,50,130,22);
//         storeIdField.setBorder(fieldBorder);
//         leftPanel.add(storeIdField);

//         storeNameField = new JTextField();
//         storeNameField.setBounds(130,100,130,22);
//         storeNameField.setBorder(fieldBorder);
//         leftPanel.add(storeNameField);

//         LocationField = new JTextField();
//         LocationField.setBounds(130,150,130,22);
//         LocationField.setBorder(fieldBorder);
//         leftPanel.add(LocationField);

//         openingHourField = new JTextField();
//         openingHourField.setBounds(130,200,130,22);
//         openingHourField.setBorder(fieldBorder);
//         leftPanel.add(openingHourField);


//         //creating rightPanel for product details info
//         JPanel rightPanel = new JPanel();
//         rightPanel.setLayout(null);
//         rightPanel.setBorder(BorderFactory.createTitledBorder(fieldBorder,"<html><span style='color:white;'>Retailer info<span></html>",TitledBorder.LEFT,TitledBorder.TOP));
//         rightPanel.setBounds(830, 100, 300, 400);
//         rightPanel.setBackground(new Color(60,60,60));
//         mainPanel.add(rightPanel);


//         //Jlebel text adding in rightPanel

//         // productName = new JLabel("Product Name:");
//         // productName.setBounds(20,50,100,20);
//         // productName.setFont(lblFont);
//         // rightPanel.add(productName);

//         // markedPrice = new JLabel("Marked Price:");
//         // markedPrice.setBounds(20,100,100,20);
//         // markedPrice.setFont(lblFont);
//         // rightPanel.add(markedPrice);

//         // sellingPrice = new JLabel("Selling Price:");
//         // sellingPrice.setBounds(20,150,100,20);
//         // sellingPrice.setFont(lblFont);
//         // rightPanel.add(sellingPrice);

//         vatPrice = new JLabel("VAT Price:");
//         vatPrice.setBounds(20,50,100,20);
//         vatPrice.setFont(lblFont);
//         rightPanel.add(vatPrice);

//         loyalityPoint = new JLabel("Loyality Point:");
//         loyalityPoint.setBounds(20,100,100,20);
//         loyalityPoint.setFont(lblFont);
//         rightPanel.add(loyalityPoint);

//         isPaymentOnline = new JLabel("Online Payment:");
//         isPaymentOnline.setBounds(20,150,110,20);
//         isPaymentOnline.setFont(lblFont);
//         rightPanel.add(isPaymentOnline);

//         purchasedYear = new JLabel("Purchased Year:");
//         purchasedYear.setBounds(20,200,110,20);
//         purchasedYear.setFont(lblFont);
//         rightPanel.add(purchasedYear);



//         //JTextField adding in rightPanel

//         // productNameField = new JTextField();
//         // productNameField.setBounds(130,50,130,22);
//         // productNameField.setBorder(fieldBorder);
//         // rightPanel.add(productNameField);

//         // markedPriceField = new JTextField();
//         // markedPriceField.setBounds(130,100,130,22);
//         // markedPriceField.setBorder(fieldBorder);
//         // rightPanel.add(markedPriceField);

//         // sellingPriceField = new JTextField();
//         // sellingPriceField.setBounds(130,150,130,22);
//         // sellingPriceField.setBorder(fieldBorder);
//         // rightPanel.add(sellingPriceField);

//         vatPriceField = new JTextField();
//         vatPriceField.setBounds(130,50,130,22);
//         vatPriceField.setBorder(fieldBorder);
//         rightPanel.add(vatPriceField);

//         loyalityPointField = new JTextField();
//         loyalityPointField.setBounds(130,100,130,22);
//         loyalityPointField.setBorder(fieldBorder);
//         rightPanel.add(loyalityPointField);

//         isPayOnline = new JCheckBox("  Yes");
//         isPayOnline.setBounds(140,150,65,22);
//         isPayOnline.setBackground(new Color(60,60,60));
//         isPayOnline.setForeground(Color.WHITE);
//         rightPanel.add(isPayOnline);

//         isPayOffline = new JCheckBox("  No");
//         isPayOffline.setBounds(220,150,65,22);
//         isPayOffline.setBackground(new Color(60,60,60));
//         isPayOffline.setForeground(Color.WHITE);
//         rightPanel.add(isPayOffline);

//         paymentSystem = new ButtonGroup();
//         paymentSystem.add(isPayOnline);
//         paymentSystem.add(isPayOffline);

//         String[] years = {"2020","2021","2022","2023","2024"};
//         yearsComboBox = new JComboBox<>(years);
//         yearsComboBox.setBounds(140, 200, 110, 22);
//         rightPanel.add(yearsComboBox);

//         //adding set loyality point Button in centerPanel
//         setLoyalityPoint = new JButton("Loyality Point");
//         setLoyalityPoint.setBounds(30, 270, 110, 30);
//         setLoyalityPoint.setBorder(fieldBorder);
//         rightPanel.add(setLoyalityPoint);

//         setLoyalityPoint = new JButton("Remove Product");
//         setLoyalityPoint.setBounds(160, 270, 110, 30);
//         setLoyalityPoint.setBorder(fieldBorder);
//         rightPanel.add(setLoyalityPoint);

//         setLoyalityPoint = new JButton("Add Retailer");
//         setLoyalityPoint.setBounds(105, 340, 100, 40);
//         setLoyalityPoint.setBorder(fieldBorder);
//         rightPanel.add(setLoyalityPoint);


//         //Creating center JPanel for Department details
//         JPanel centerPanel = new JPanel();
//         centerPanel.setLayout(null);
//         centerPanel.setBorder(BorderFactory.createTitledBorder(fieldBorder,"<html><span style='color:white;'>Department info<span></html>",TitledBorder.LEFT,TitledBorder.TOP));
//         centerPanel.setBounds(435, 170, 300, 450);
//         centerPanel.setBackground(new Color(60,60,60));
//         mainPanel.add(centerPanel);

//         //Jlebel text adding in centerPanel
//         productName = new JLabel("Product Name:");
//         productName.setBounds(20,50,100,20);
//         productName.setFont(lblFont);
//         centerPanel.add(productName);

//         markedPrice = new JLabel("Marked Price:");
//         markedPrice.setBounds(20,100,100,20);
//         markedPrice.setFont(lblFont);
//         centerPanel.add(markedPrice);

//         sellingPrice = new JLabel("Selling Price:");
//         sellingPrice.setBounds(20,150,100,20);
//         sellingPrice.setFont(lblFont);
//         centerPanel.add(sellingPrice);

//         JLabel dottedLine = new JLabel("x - - - - - - - - - - - - - - - - - - - - - x");
//         dottedLine.setBounds(60, 240, 250, 20);
//         centerPanel.add(dottedLine);

//         totalSales = new JLabel("Total Sales:");
//         totalSales.setBounds(20,270,100,20);
//         totalSales.setFont(lblFont);
//         centerPanel.add(totalSales);

//         totalDiscount = new JLabel("Total Discount:");
//         totalDiscount.setBounds(20,320,100,20);
//         totalDiscount.setFont(lblFont);
//         centerPanel.add(totalDiscount);

//         //JTextField adding in centerPanel
//         productNameField = new JTextField();
//         productNameField.setBounds(130,50,130,22);
//         productNameField.setBorder(fieldBorder);
//         centerPanel.add(productNameField);

//         markedPriceField = new JTextField();
//         markedPriceField.setBounds(130,100,130,22);
//         markedPriceField.setBorder(fieldBorder);
//         centerPanel.add(markedPriceField);

//         sellingPriceField = new JTextField();
//         sellingPriceField.setBounds(130,150,130,22);
//         sellingPriceField.setBorder(fieldBorder);
//         centerPanel.add(sellingPriceField);

//         totalSalesField = new JTextField();
//         totalSalesField.setBounds(130,270,130,22);
//         totalSalesField.setBorder(fieldBorder);
//         centerPanel.add(totalSalesField);

//         totalDiscountField = new JTextField();
//         totalDiscountField.setBounds(130,320,130,22);
//         totalDiscountField.setBorder(fieldBorder);
//         centerPanel.add(totalDiscountField);

//         //set add Department JButtom in centerPanel
//         addDepartment = new JButton("Add Department");
//         addDepartment.setBounds(85, 370, 120, 40);
//         addDepartment.setBorder(fieldBorder);
//         centerPanel.add(addDepartment);

//         //adding calulate discount price JButtom in centerPanel
//         calculateDiscoutPrice = new JButton("Calculate Discount");
//         calculateDiscoutPrice.setBounds(85, 200, 120, 30);
//         calculateDiscoutPrice.setBorder(fieldBorder);
//         centerPanel.add(calculateDiscoutPrice);


//         display = new JButton("Display");
//         display.setBounds(250, 650, 120, 40);
//         display.setBorder(fieldBorder);
//         mainPanel.add(display);
        
//         clear = new JButton("Clear");
//         clear.setBounds(800, 650, 120, 40);
//         clear.setBorder(fieldBorder);
//         mainPanel.add(clear);

//         // Set foreground color to white for all JLabels
//         setLabelForegroundWhite(mainPanel);

//         // Set background color to black and text color to white for all JTextFields
//         setTextFieldForegroundBlack(mainPanel);

//         //set background color to black and text color to white for all JButtons
//         setButtonBackgroundBlack(mainPanel);

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         StoreGUI gui = new StoreGUI();
//     }

//     public static void setLabelForegroundWhite(Container container)
//     {
//         for(Component component: container.getComponents())
//         {
//             if (component instanceof  JLabel)
//             {
//                 ((JLabel) component).setForeground(Color.WHITE);
//             }
//             if (component instanceof Container)
//             {
//                 setLabelForegroundWhite((Container) component);
//             }
//         }
//     }

//     public static void setTextFieldForegroundBlack(Container container)
//     {
//         for(Component component: container.getComponents())
//         {
//             if (component instanceof  JTextField)
//             {
//                 ((JTextField) component).setBackground(new Color(80,80,80));
//                 ((JTextField) component).setForeground(Color.WHITE);
//             }
//             if (component instanceof Container)
//             {
//                 setTextFieldForegroundBlack((Container) component);
//             }
//         }
//     }

//     public static void setButtonBackgroundBlack(Container container)
//     {
//         for(Component component: container.getComponents())
//         {
//             if (component instanceof JButton)
//             {
//                 ((JButton) component).setBackground(new  Color(90,90,90));
//                 ((JButton) component).setForeground(Color.WHITE);
//             }
//             if (component instanceof Container)
//             {
//                 setButtonBackgroundBlack((Container) component);
//             }
//         }
        
//     }
// }
