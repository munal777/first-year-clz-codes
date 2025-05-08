package workshop.week19;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;


public class Tutorial {
    private JButton b1, b2, b3, b4, b5;
    public Tutorial()
    {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");

        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.CENTER);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.SOUTH);
        frame.add(b5, BorderLayout.WEST);

        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        Tutorial st = new Tutorial();
    }
}
