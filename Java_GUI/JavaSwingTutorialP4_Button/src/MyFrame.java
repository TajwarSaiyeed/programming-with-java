import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("p.png");
        ImageIcon wow = new ImageIcon("wow.png");
        label = new JLabel();
        label.setIcon(wow);
        label.setBounds(150, 250, 250, 150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(200, 100, 250, 100);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic sans", Font.ITALIC, 25));
        button.setIconTextGap(-10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(e -> {
            System.out.println("Hello world");
            button.setEnabled(false);
            label.setVisible(true);
        });


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
}
