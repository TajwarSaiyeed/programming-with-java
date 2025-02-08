
public class StaticPublicBlock {

    static void staticBlock() {
        System.out.println("Static Block access by not creating by Obj");
    }

    public void publicBlock() {
        System.out.println("Public Block access by creating Obj");
    }

    public static void main(String[] args) {
        staticBlock();
        StaticPublicBlock m = new StaticPublicBlock();
        m.publicBlock();
    }
}
