
public class BreakContinue {

    public static void main(String[] args) {
        break_();
        continue_();
    }

    public static void break_() {
        System.out.println("Break: ");
        for (int i = 0; i < 5; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void continue_() {
        System.out.println("Continue: ");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
