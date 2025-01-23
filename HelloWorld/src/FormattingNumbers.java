import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        // $1234567 ==> $1,234,467
        // 0.1 ==> 10%

        // Use NumberFormat
        // factory method
         NumberFormat currency = NumberFormat.getCurrencyInstance();
         NumberFormat percent = NumberFormat.getPercentInstance();
         String result = currency.format(1234567.89);
         String result2 = percent.format(1234567.8915);
         System.out.println(result);
         System.out.println(result2);
        System.out.println(percent.format(0.1));
        System.out.println(NumberFormat.getPercentInstance().format(1234745275.44));




    }
}
