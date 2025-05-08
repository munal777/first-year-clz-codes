package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gridbagLayout extends JFrame {

    public gridbagLayout()
    {
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setTitle("GridBag Layouut");
        ImageIcon img = new ImageIcon("gui/Java.png");
        setIconImage(img.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);

        // JPanel panel1 = new JPanel(new GridBagLayout());
        // panel1.setBackground(Color.BLACK);
        // GridBagConstraints gbc1 = new GridBagConstraints();

        // gbc1.gridx = 0;
        // gbc1.gridy = 0;
        // gbc1.insets = new Insets(35, 10, 10, 20);
        // JLabel label = new JLabel("Hello");
        // label.setForeground(Color.WHITE);
        // panel1.add(label,gbc1);

        // gbc1.gridx = 1;
        // gbc1.gridy = 0;
        // gbc1.insets = new Insets(35, 10, 10, 20);
        // JTextField area = new JTextField();
        // area.setPreferredSize(new Dimension(150,25));
        // panel1.add(area,gbc1);

        // gbc1.gridx = 0;
        // gbc1.gridy = 0;
        // gbc1.gridwidth = 2;
        // gbc1.gridheight = 1;
        // gbc1.anchor = GridBagConstraints.NORTHWEST;
        // add(panel1, gbc1);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLACK);
        panel1.setPreferredSize(new Dimension(170,75));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        add(panel1, gbc);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.setPreferredSize(new Dimension(150,100));

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        add(panel2, gbc);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.RED);
        panel3.setPreferredSize(new Dimension(75,75));

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        add(panel3, gbc);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.RED);
        panel4.setPreferredSize(new Dimension(75,75));

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        add(panel4, gbc);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.GREEN);
        panel5.setPreferredSize(new Dimension(100,55));

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(panel5, gbc);
        //---------Flow layout---------------
    //     JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    //     panel.setPreferredSize(new Dimension(200,200));
    //     panel.setBackground(Color.BLACK);
    //     add(panel);

    //    for(int i=1; i<=5; i++)
    //    {
    //     JButton btn =new JButton("Button " + i);
    //     panel.add(btn);
    //    }

    //     JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    //     panel1.setPreferredSize(new Dimension(100,100));
    //     panel1.setBackground(Color.BLUE);
    //     add(panel1);

        setVisible(true);
    }

    public static void main(String[] args) {
        gridbagLayout gui = new gridbagLayout();
    }
}
