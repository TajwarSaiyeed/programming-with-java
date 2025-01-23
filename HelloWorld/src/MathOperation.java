public class MathOperation {
    public static void main(String[] args) {
        // Round method for float and double values to whole number
        int x = Math.round(2.25F);
        System.out.println(x);

        // Ceil method for float and double values to round up
        int y = (int)Math.ceil(2.25);
        System.out.println(y);

        // Floor
        int z = (int)Math.floor(2.25);
        System.out.println(z);

        // max
        int max_value = Math.max(x, y);
        System.out.println(max_value);

        // min
        int min_value = Math.min(x, y);
        System.out.println(min_value);

        // random for generating random value between 0 and 1
        double result = Math.random();
        System.out.println(result);

        // if i need 0 to 100. simply multiple by 100
        int zero_to_100 = (int)(Math.random() * 100);
        System.out.println(zero_to_100);
    }
}
