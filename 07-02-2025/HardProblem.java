
import java.util.Scanner;

public class HardProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long sum = a + b + c;
        if (sum <= m) {
            System.out.println(sum);
            return;
        }

        long r1 = m >= a ? a : m;
        long r2 = m >= b ? b : m;

        m *= 2;
        m -= r1;
        m -= r2;
        long ans = r1 + r2 + Math.min(m, c);
        System.out.println(ans);
    }
}
