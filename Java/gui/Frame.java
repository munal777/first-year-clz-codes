package gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Frame {
    private JFrame frame;

    public Frame()
    {
        frame = new JFrame(); // ceate a frame
        frame.setTitle("JFrame Tutorial"); //sets title for frame
        frame.setSize(1200,700); // set x-dimension & y-dimension of a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to exit out the application
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(true); // frame can be resizable
        frame.setVisible(true); //make a frame visible

        ImageIcon img = new ImageIcon("gui/Java.png"); //create an image icon
        frame.setIconImage(img.getImage()); //change icon of frame
        frame.getContentPane().setBackground(Color.GRAY); //change color of background
        // frame.getContentPane().setBackground(new Color(255,255,255)); //color range from 0 to 255

    }

    public static void main(String[] args) {
        Frame display = new Frame();
    }
}
