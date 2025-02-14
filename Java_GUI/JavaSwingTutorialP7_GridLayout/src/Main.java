import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // layout manager = Defines the natural for components withing a container

        /*
          * GridLayout is another layout manager that arranges components in a grid of cells,
          * with each component taking up one cell.
          */


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 10, 20));

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFocusable(false);
            frame.add(button);

            int finalI = i;
            button.addActionListener(_ -> System.out.println(finalI));
        }

        frame.setVisible(true);
    }
}