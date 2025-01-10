import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // We use arrays to store a list items, people, messages etc;
        // Arrays are reference type

        // older way
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println(Arrays.toString(numbers)); // [10, 20, 0, 0, 0]
        // System.out.println(numbers);
        // Index 10 out of bounds for length 5
        // numbers[10] = 50;


        // Newer way
        // Array is fixed size mean cannot add or remove additional items to them
        int[] marks = {38, 40, 33, 20, 45};
        System.out.println(marks.length); // 5
        System.out.println(Arrays.toString(marks)); // [38, 40, 33, 20, 45]
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks)); // [20, 33, 38, 40, 45]
    }
}
