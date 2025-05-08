package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
public class Panel {
    public Panel()
    {
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout()); //creating newborder layout inside panel to change icon-text position

        JLabel lbl = new JLabel();
        lbl.setText("Hi");
        lbl.setVerticalAlignment(JLabel.CENTER);
        lbl.setHorizontalAlignment(JLabel.TRAILING);
        greenPanel.add(lbl);
       
        JFrame frame = new JFrame();
        frame.setTitle("Java website");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }

    public static void main(String[] args) {
        Panel panel = new Panel();
    }

    public static void setBounds(int i, int j, int k, int l) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBounds'");
    }
}