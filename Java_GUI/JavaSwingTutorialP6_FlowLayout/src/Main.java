import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // layout manager = Defines the natural for components withing a container

        /*
         * FlowLayout is a simple layout manager that arranges components in a left-to-right flow,
         * much like lines of text in a paragraph. It is the default layout manager for JPanel.
         */


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 250));
        panel.setBackground(Color.ORANGE);

        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFocusable(false);
            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}