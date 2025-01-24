// https://www.wikihow.com/Calculate-Mortgage-Payments

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
        int numberOfPayments = years * 12;
        /*
         * formula of mortgage calculator
         * mortgage = p*(r * ((1+r)^n)/((1+r)^n - 1))
         */
        double mortgage = principal * (calculateRate * Math.pow((1 + calculateRate), numberOfPayments))
                / (Math.pow((1 + calculateRate), numberOfPayments) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + currency.format(mortgage));
        scanner.close();
    }
}