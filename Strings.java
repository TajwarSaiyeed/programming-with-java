public class Strings {
    public static void main(String[] args) {
        /*
         String is reference type in Java
         String can concatenate with (+) Operator
        */
        String message = "Hello, World" + " !!!";
        // startsWith & endsWith return true or false value
        System.out.println(message.endsWith("&"));
        System.out.println(message.startsWith("How"));
        System.out.println(message);

        // To get the length of a string use length() method
        System.out.println(message.length());

        /*
         To get the index of a character or a string use indexOf() method
         Non exist char or string return -1
        */
        System.out.println(message.indexOf('H')); // 0
        System.out.println(message.indexOf("Sky")); // -1

        /*
         replace(target, replacement) method for replacing
         replace(oldChar, newChar)
        */
        System.out.println(message.replace('!', '*')); // Hello, World ***
        System.out.println(message);
        /*
         replace() method doesn't modify original string
         Because strings are immutable
        */

        /*
            toLowerCase() = convert all char to lower case
            toUpperCase() = convert all char to upper case
         */

        System.out.println(message.toLowerCase()); // hello, world !!!
        System.out.println(message.toUpperCase()); // HELLO, WORLD !!!


        // trim() method for removing extra whitespaces (begin or end of a string)
        String bd = " Bangladesh   ";
        System.out.println(bd);
        System.out.println(bd.trim());
    }
}
