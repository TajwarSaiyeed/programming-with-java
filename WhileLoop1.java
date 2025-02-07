
import java.util.Scanner;

public class WhileLoop1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.toLowerCase().equals("q")) {
            System.out.print("Input: ");
            input = sc.next();
            System.out.println(input);
        }
    }
}
