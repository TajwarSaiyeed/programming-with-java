import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JTextField number = new JTextField();
//
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1000, 500);
//
//        frame.getContentPane().setBackground(Color.ORANGE);
//
//        Border b = BorderFactory.createLineBorder(Color.GREEN);
//        JLabel label = new JLabel();
//        label.setText("Tajwar Saiyeed");
//        label.setForeground(Color.ORANGE);
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setFont(new Font("Arial", Font.BOLD, 40));
//        label.setBorder(b);
//        label.setBackground(Color.BLACK);
//        label.setOpaque(true);
//        label.setBounds(250, 100, 500, 100);
//
//        // Button
//        JButton button = new JButton();
//        button.setText("Click Me");
//        button.setBounds(250, 250, 500, 40);
//        button.setBackground(new Color(0xFF4D4D));
//        button.setForeground(Color.ORANGE);
//        button.setBorderPainted(false);
//        button.setFocusPainted(false);

//        JTextField textField = new JTextField();
//        textField.setBounds(250, 300, 500, 30);
//
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("Hi, I'm Tajwar Saiyeed");
//                textField.setText("Hello world");
//            }
//        });
//
//        frame.setLayout(null);
//        frame.add(label);
//        frame.add(button);
//        frame.add(textField);
//
//        frame.setVisible(true);



        JLabel number1Label = new JLabel();
        number1Label.setText("Number 1");
        number1Label.setBounds(10, 0, 100, 10);

        JLabel number2Label = new JLabel();
        number2Label.setText("Number 2");
        number2Label.setBounds(115, 0, 100, 10);

        JTextField number1 = new JTextField();
        number1.setBounds(10,20, 100, 50);
        number1.setOpaque(true);

        JTextField number2 = new JTextField();
        number2.setBounds(115,20, 100, 50);
        number2.setOpaque(true);

        JButton button = new JButton("Calculate Sum");
        button.setBounds(10, 80, 160, 20);

        JLabel output = new JLabel();
        output.setBounds(10, 110, 200, 30);
        output.setBackground(Color.BLUE);
        output.setForeground(Color.BLACK);
        output.setOpaque(true);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(number1.getText());
                int num2 = Integer.parseInt(number2.getText());
                int sum = num1+num2;
                output.setText(String.valueOf(sum));
                output.setOpaque(true);

            }
        });



        JFrame mainFrame = new JFrame();

        mainFrame.setTitle("Add Two Number");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 500);
        mainFrame.getContentPane().setBackground(Color.green);
        mainFrame.setLayout(null);
        mainFrame.add(number1Label);
        mainFrame.add(number1);
        mainFrame.add(number2Label);
        mainFrame.add(number2);
        mainFrame.add(button);
        mainFrame.add(output);
        mainFrame.setVisible(true);
    }


}
