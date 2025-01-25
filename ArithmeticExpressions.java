public class ArithmeticExpressions {
    public static void main(String[] args) {
        // +, -, *, /, %
        int add = 10 + 3;
        System.out.println(add);
        int sub = 7 - 4;
        System.out.println(sub);
        int div = 10 / 3;
        System.out.println(div);
        // Type cast
        double division = (double) 10 / (double) 3;
        System.out.println(division);

        int rem = 10 % 3;
        System.out.println(rem);


        // increment
        int x = 1;
        // postfix
        x++;
        System.out.println(x);
        // prefix
        ++x;
        System.out.println(x);


        // ----------
        int y = 10;
        int z = y++; // 10
        System.out.println(y); // 11
        System.out.println(z); // 10


        // -------
        int p = 1;
        p = p + 5; // p = 6

        // Augmented or compound assignment operator
        p += 5; // now p = 6 + 5 = 11
        p -= 1;
        p *= 2;
        p /= 2;
        System.out.println(p);

        // ----------
        int i = 20;
        int j = ++i;
        System.out.println(i); // 21
        System.out.println(j); // 21
    }
}
