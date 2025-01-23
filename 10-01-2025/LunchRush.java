import java.util.Scanner;

public class LunchRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int mx = Integer.MIN_VALUE;

        while (n-- > 0) {
            int f = sc.nextInt();
            int t = sc.nextInt();

            if (t > k) {
                mx = Math.max(mx, f - (t - k));
            } else {
                mx = Math.max(mx, f);
            }
        }
        System.out.println(mx);
    }
}