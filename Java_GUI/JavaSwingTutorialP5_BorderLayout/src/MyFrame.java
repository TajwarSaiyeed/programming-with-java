import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame () {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.GREEN);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.CYAN);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        // sub panel for center panel

        panel3.setLayout(new BorderLayout(5, 5));

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();


        panel6.setBackground(Color.MAGENTA);
        panel7.setBackground(Color.white);
        panel8.setBackground(Color.BLACK);
        panel9.setBackground(Color.PINK);
        panel10.setBackground(Color.RED);


        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel3.add(panel6, BorderLayout.NORTH);
        panel3.add(panel7, BorderLayout.EAST);
        panel3.add(panel8, BorderLayout.CENTER);
        panel3.add(panel9, BorderLayout.WEST);
        panel3.add(panel10, BorderLayout.SOUTH);

        this.setTitle("Border Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new BorderLayout(5, 5)); // border layout
        this.setVisible(true);
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.WEST);
        this.add(panel3, BorderLayout.CENTER);
        this.add(panel4, BorderLayout.EAST);
        this.add(panel5, BorderLayout.SOUTH);
    }
}
