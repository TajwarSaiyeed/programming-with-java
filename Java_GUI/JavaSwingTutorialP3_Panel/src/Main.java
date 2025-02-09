import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JPanel = A GUI component that functions as a container to hold other components

        JLabel label = new JLabel();
        label.setText("HI");
        label.setFont(new Font("Times new roman", Font.PLAIN, 30));
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(0,0, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0, 250, 250);
        bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250, 500, 250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.add(redPanel);
        greenPanel.add(label);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}