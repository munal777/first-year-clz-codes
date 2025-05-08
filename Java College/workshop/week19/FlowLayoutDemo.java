package workshop.week19;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class FlowLayoutDemo {
    private JButton b1, b2, b3, b4, b5;
    public FlowLayoutDemo()
    {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");

        JFrame frame = new JFrame("hello");
        frame.setSize(500,300);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        Tutorial st = new Tutorial();
    }
}
