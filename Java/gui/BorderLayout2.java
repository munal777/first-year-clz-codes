package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayout2 {
    public BorderLayout2()
    {
        JFrame frame  = new JFrame();
        frame.setLayout(new BorderLayout(10,10));
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(200,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        JPanel deepPanel  = new JPanel();
        deepPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20, 20));
        deepPanel.setPreferredSize(new Dimension(300,150)); //to set the size of inner panel

        for (int i = 1; i <=5; i++)
        {
            deepPanel.add(new JButton("Button "+ i));
        }
        // JButton btn1 = new JButton("Hello!!");
        // deepPanel.add(btn1);

        // JButton btn2 = new JButton("Hello!!");
        // deepPanel.add(btn2);

        // JButton btn3 = new JButton("Hello!!");
        // deepPanel.add(btn3);

        // JButton btn4 = new JButton("Hello!!");
        // deepPanel.add(btn4);
        
        panel5.add(deepPanel);
        

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayout2 bdr = new BorderLayout2();
    }
}
