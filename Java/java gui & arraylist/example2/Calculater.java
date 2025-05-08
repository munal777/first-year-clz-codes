package example2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Calculater extends JFrame 
{
    private JTextArea num1Area, num2Area, resultArea;
    private JButton sum, sub, clear, mul, div;
    public Calculater()
    {
        setSize(450, 550);
        setTitle("Math Events");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel num1 = new JLabel("Number 1:");
        num1.setBounds(60, 100, 100, 20);
        add(num1);

        num1Area = new JTextArea();
        num1Area.setBounds(160, 100, 150, 22);
        num1Area.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(num1Area);

        JLabel num2 = new JLabel("Number 2:");
        num2.setBounds(60, 150, 100, 20);
        add(num2);

        num2Area = new JTextArea();
        num2Area.setBounds(160, 150, 150, 22);
        num2Area.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(num2Area);

        JLabel result = new JLabel("Result:");
        result.setBounds(60, 200, 100, 20);
        add(result);

        resultArea = new JTextArea();
        resultArea.setBounds(160, 200, 150, 22);
        resultArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(resultArea);

        sum = new JButton("+");
        sum.setBounds(50, 300, 70, 35);
        sum.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(sum);

        sub = new JButton("-");
        sub.setBounds(150, 300, 70, 35);
        sub.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(sub);

        mul = new JButton("x");
        mul.setBounds(50, 350, 70, 35);
        mul.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(mul);

        div = new JButton("/");
        div.setBounds(150, 350, 70, 35);
        div.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(div);

        clear = new JButton("C");
        clear.setBounds(250, 300, 70, 35);
        clear.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
        add(clear);

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (num1Area.getText().equals("") || (num2Area.getText().equals("")))
                {
                    JOptionPane.showMessageDialog(null,"<html><span style='color: red;'>Enter both the Number!</span></html>","Error",JOptionPane.ERROR_MESSAGE);
                }
                
                try{
                    int number1 = Integer.parseInt(num1Area.getText());
                    int number2 = Integer.parseInt(num2Area.getText());
                    int add = number1 + number2;

                    String toAdd = Integer.toString(add);
                    resultArea.setText(toAdd);
                }
                catch (NumberFormatException a){
                    JOptionPane.showMessageDialog(null, "you have entered to num or field is empty","Error handling",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (num1Area.getText().equals("") || (num2Area.getText().equals("")))
                {
                    JOptionPane.showMessageDialog(null,"<html><span style='color: red;'>Enter both the Number!</span></html>","Error",JOptionPane.ERROR_MESSAGE);
                }
                try {
                int number1 = Integer.parseInt(num1Area.getText());
                int number2 = Integer.parseInt(num2Area.getText());
                int subtract = number1 - number2;

                String toSub = Integer.toString(subtract);
                resultArea.setText(toSub);
                }

                catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Enter a Number","Error handling",JOptionPane.ERROR_MESSAGE);
                }
            } 
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (num1Area.getText().equals("") || (num2Area.getText().equals("")))
                {
                    JOptionPane.showMessageDialog(null,"<html><span style='color: red;'>Enter both the Number!</span></html>","Error",JOptionPane.ERROR_MESSAGE);
                }
                try {
                    int num1 = Integer.parseInt(num1Area.getText());                    
                    int num2 = Integer.parseInt(num2Area.getText());    
                    int multiple = num1 * num2;
                    
                    String toMul = Integer.toString(multiple);
                    resultArea.setText(toMul);
                }
                catch (Exception a)
                {
                    JOptionPane.showMessageDialog(null, "we can't multiple with a string", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (num1Area.getText().equals("") || (num2Area.getText().equals("")))
                {
                    JOptionPane.showMessageDialog(null,"<html><span style='color: red;'>Enter both the Number!</span></html>","Error",JOptionPane.ERROR_MESSAGE);
                }
                try {
                    int num1 = Integer.parseInt(num1Area.getText());                    
                    int num2 = Integer.parseInt(num2Area.getText());    
                    int divide = num1 / num2;
                    
                    String todiv = Integer.toString(divide);
                    resultArea.setText(todiv);
                }
                catch (NumberFormatException | ArithmeticException a)
                {
                    if (a instanceof NumberFormatException)
                    {
                        JOptionPane.showMessageDialog(null, "Enter only a Number", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "we can't divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                // catch (ArithmeticException a)
                // {
                //     JOptionPane.showMessageDialog(null, "we can't divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                // }
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                num1Area.setText("");
                num2Area.setText("");
                resultArea.setText("");
            }
        });

        setVisible(true);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {

    //     String input1 = num1Area.getText();
    //     String input2 = num2Area.getText();
    //     int number1 = Integer.parseInt(input1);
    //     int number2 = Integer.parseInt(input2);

    //     int add = number1 + number2;
    //     String addResult = Integer.toString(add);

    //     int subtract = number1 - number2;
    //     String subResult = Integer.toString(subtract);

    //     if(e.getSource() == clear)
    //     {
    //         num1Area.setText("");
    //         num2Area.setText("");
    //         resultArea.setText("");
    //     }

    //     if(e.getSource() == sum)
    //     {
    //         resultArea.setText(addResult);
    //     }

    //     if(e.getSource() == sub)
    //     {
    //          resultArea.setText(subResult);
    //     }
    // }
    
    public static void main(String[] args) {
        Calculater cal = new Calculater();
    }    
    
}
