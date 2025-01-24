import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        long principal = scanner.nextLong();
        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        double calculateRate = (rate / 100.00) / 12.00;
        int yearInDays = years * 12;
        /*
         * formula of mortgage calculator
         * mortgage = p*(r * ((1+r)^n)/((1+r)^n - 1))
         */
        double mortgage = principal * (calculateRate * Math.pow((1 + calculateRate), yearInDays))
                / (Math.pow((1 + calculateRate), yearInDays) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print("Mortgage: " + currency.format(mortgage));
        scanner.close();
    }
}