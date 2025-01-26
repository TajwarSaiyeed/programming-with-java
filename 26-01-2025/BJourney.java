
import java.util.Scanner;

public class BJourney {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                solve(sc);
            }
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sum = a + b + c;
        int ans = n / sum;
        n %= sum;
        ans = ans * 3;
        if (n != 0) {
            if (n > a + b) {
                ans += 3;
            } else if (n > a) {
                ans += 2;
            } else {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
