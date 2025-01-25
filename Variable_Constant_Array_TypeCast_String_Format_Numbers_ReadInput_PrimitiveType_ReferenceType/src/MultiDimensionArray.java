import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3]; // 2 * 3 matrix
        // numbers[first_row][first_col] = value
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // [[I@4f3f5b24, [I@15aeb7ab]
        System.out.println(Arrays.deepToString(numbers)); // [[1, 0, 0], [0, 0, 0]]


        // Curly Braces
        int[][] marks = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(marks));
    }
}
