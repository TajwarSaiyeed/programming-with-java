
public class Main {

    int x = 20;
    int y;
    final double PI = 3.1416;
    String fname = "taj";
    String lname = "war";

    public static void main(String[] args) {
        Main obj = new Main();
        obj.y = 900;
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.PI);
        System.out.println(obj.fname + obj.lname);

        OtherMain obj1 = new OtherMain();
        System.out.println(obj1.y + " " + obj1.c);
    }
}
