
import java.util.Scanner;

public class Fact {

    static long fact(int n, long[] arr) {
        if (n <= 1) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        return arr[n] = n * fact(n - 1, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long[] arr = new long[number + 1];
        for (int i = 0; i <= number; i++) {
            arr[i] = -1;
        }
        long ans = fact(number, arr);
        System.out.println(ans);
    }
}
