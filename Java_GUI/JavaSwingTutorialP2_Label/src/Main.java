import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("tajwarsaiyeed.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);

        // Border
         Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        // JLabel = A GUI Display area for a string of text, an image or both
        JLabel label = new JLabel(); // create a label
        label.setText("Write once, run everywhere"); // set text of label
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);// set text left, center, right of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center, bottom of image icon
        label.setForeground(new Color(0x8CE2AC)); // set font color of text
        label.setFont(new Font("Poppins", Font.PLAIN, 50)); // set font of text
        label.setIconTextGap(30); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        // label.setBounds(0, 0, 250, 250); // set x, y position within frame as well as dimensions

        JLabel serviceLabel = new JLabel();
        serviceLabel.setText("This is service label");
        serviceLabel.setBackground(Color.gray);
        serviceLabel.setOpaque(true);
        serviceLabel.setBounds(0, 250, 250, 250);




        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.add(label);
        // frame.add(serviceLabel);
        frame.pack();
        frame.setVisible(true);
    }
}