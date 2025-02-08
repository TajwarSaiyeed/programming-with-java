
public class JavaCons {

    int x;

    public JavaCons(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        JavaCons x = new JavaCons(5);
        x.display();
    }
}
