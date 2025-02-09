import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame () {
        this.setTitle("JFrameSwingTutorialP1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        this.setResizable(false); // prevent resizeable false
        this.setSize(420, 420);
        this.setVisible(true); // Make frame visible
        ImageIcon image = new ImageIcon("tajwarsaiyeed.jpg"); // create an image icon  // Image icon
        System.out.println(image);
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(0xAEFE00)); // background color // this.getContentPane().setBackground(new Color(123, 50, 250));
    }
}
