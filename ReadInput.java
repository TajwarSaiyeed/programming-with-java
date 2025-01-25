import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            This line creates a Scanner object named 'sc'.
            'System.in' is used to read input from the standard input stream (usually the keyboard).
         */

        System.out.print("Name : ");
        String name = sc.nextLine().trim();
        /*
         This line reads an entire line of text from the user, including spaces,
        and stores it in a variable called 'name' of type String.
        `.trim()` removes any leading or trailing whitespace from the input.
        */

        System.out.print("Age : ");

        byte age = sc.nextByte();

        System.out.println("Your name is " + name);
        System.out.println("You are " + age);
    }
}

/*
    sc.next() reads the next "token" or single word from the input. It stops reading at the first whitespace character (like space, tab, or newline).

    sc.nextLine() reads the entire line of input including spaces until it finds the end of the line (a new line character).
 */