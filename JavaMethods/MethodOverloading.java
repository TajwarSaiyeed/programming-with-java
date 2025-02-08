public class MethodOverloading {
    static long sum(long a, long b) {
        return a + b;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void sum(byte a, byte b) {
        System.out.println("Byte: " + (a + b)); 
    }

    public static void main(String[] args) {
        System.out.println("INT: " + sum(5, 6));
        System.out.println("LONG: " + sum(5454687123157L, 474787521L));
        sum((byte) 1, (byte) 5);
    }
}