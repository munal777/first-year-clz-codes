package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class LayeredPanel {
    public LayeredPanel()
    {
        JLabel label1  = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.GREEN);
        label1.setBounds(100, 100, 200, 200);

        JPanel panel = new JPanel();
        panel.setBounds(150, 150, 200, 200);
        panel.setBackground(Color.RED);

        JLabel label2  = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(200, 200, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBackground(Color.BLACK);
        layeredPane.setBounds(0, 0, 500, 500);
        
        // layeredPane.moveToFront(label1);
        // layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); //the base layer
        layeredPane.add(label1, Integer.valueOf(-1)); //alternative by using wraper class
        // layeredPane.add(panel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel, Integer.valueOf(500));  //it will be top layer as drag layer value is 400
        layeredPane.add(label2, JLayeredPane.DRAG_LAYER); //drag layer is the top layer

        JFrame frame = new JFrame();
        frame.add(layeredPane);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        LayeredPanel layered = new LayeredPanel();
    }
}
