public class Casting {
    public static void main(String[] args) {
        /*
            HERE:
            Allocate an anonymous variable somewhere in memory that will be integer
            and copy the value of x
         */
        // Implicit Casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double i = 1.1;
        double j = i + 2; // 1.1 + 2.0
        System.out.println(j);

        // explicit casting
        double m = 2.5;
        int n = (int) m + 2;
        System.out.println(n);

        // Explicit casing can only happen between compatible types
        // A string can not cast to a number

        /*
            String str = "1";
            Integer.parseInt(str);
            Float.parseFloat(str);
         */
        String strI = "1";
        int strN = Integer.parseInt(strI) + 2;
        String strD = "2.5";
        double strN1 = Double.parseDouble(strD) + 2;
        System.out.println(strN);
        System.out.println(strN1);

    }
}
