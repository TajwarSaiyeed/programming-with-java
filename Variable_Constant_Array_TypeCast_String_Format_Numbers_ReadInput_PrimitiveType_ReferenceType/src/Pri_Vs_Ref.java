import java.awt.*;

public class Pri_Vs_Ref {
    public static void main(String[] args) {
        // Primitive Type
        byte x = 1;
        byte y = x;
        x = 2; // here y is effected or updated
        System.out.println(y);
        /*
         Reference Type
         Here point1 & point2 pointing same address
        */

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 30;
        System.out.println(point2);
    }
}
