package gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
public class BorderlayoutDemo {

    public BorderlayoutDemo()
    {
        JFrame frame  = new JFrame();
        frame.setLayout(null);
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(200,200,200));
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,450,250);
        panel.setBackground(Color.GRAY);
        BorderLayout layout = new BorderLayout();
        panel.setLayout(layout);
        frame.add(panel);
         
        JButton btn3 = new JButton("Button 3");
        btn3.setBackground(Color.CYAN);
        btn3.setPreferredSize(new Dimension(100, 50));

        //creating nested panel to control the size of button
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(btn3);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);
        centerPanel.setBounds(20,20,100,100);
        centerPanel.setBackground(Color.BLUE);
        panel.add(centerPanel);

        //nested panel want to add inside centerpanel
        JPanel deepPanel = new JPanel();
        deepPanel.setLayout(new FlowLayout()); // trying with flowlayout
        deepPanel.setBounds(10, 10, 100, 50);
        centerPanel.add(deepPanel);

        JLabel lbl = new JLabel("Munal");
        // lbl.setVerticalAlignment(10);
        deepPanel.add(lbl);

        panel.add(northPanel, BorderLayout.NORTH);
        // panel.add(new JButton("Button 1"),BorderLayout.CENTER);
        panel.add(new JButton("Button 2"), BorderLayout.EAST);
        panel.add(new JButton("Button 4"), BorderLayout.SOUTH);
        panel.add(new JButton("Button 5"), BorderLayout.WEST);

        layout.setHgap(10);
        layout.setVgap(20);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        BorderlayoutDemo gui = new BorderlayoutDemo();
    }
}
