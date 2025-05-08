package gui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class Label {
    private JFrame  frame;
    public Label()
    {
        frame = new JFrame();
        frame.setTitle("Munal");
        frame.setSize(900,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color(245,245,245)); //set background color
        ImageIcon img = new ImageIcon("gui/Java.png"); //add logo icon 
        frame.setIconImage(img.getImage());

        Border border = BorderFactory.createLineBorder(new Color(230,230,230),15);
        // Border border2 = BorderFactory.createEmptyBorder(15, 35, 15, 15); //in empty border: border is not drawen but leave specfic space with assigning Top, left, bottom ,right

        JLabel lbl = new JLabel();
        lbl.setText("Strawberry!!");
        ImageIcon img1 = new ImageIcon("gui/strawberry.jpg");
        lbl.setHorizontalTextPosition(JLabel.CENTER); //set text to LEFT, RIGHT, CENTER of imageicon
        lbl.setVerticalTextPosition(JLabel.TOP); //set text to TOP, BOTTOM, CENTER of imageicon
        lbl.setIcon(img1);
        lbl.setIconTextGap(50); //set gap of text to image
        lbl.setForeground(Color.GRAY); // set font color of text
        lbl.setBackground(Color.BLACK); //adding background color
        lbl.setOpaque(true);//opaque makes the background color visible in frame
        lbl.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font to text
        lbl.setBorder(border);
        lbl.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        frame.add(lbl);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Label dis = new Label();
    }
}
