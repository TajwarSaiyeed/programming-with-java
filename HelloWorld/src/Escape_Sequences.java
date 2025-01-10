public class Escape_Sequences {
    public static void main(String[] args) {
        // Here using backslash \ we scape the double quotes (")
        String message = "Hello \"Abid\"";
        System.out.println(message); // Hello "Abid"

        // To print backslash need to use double backslash \\
        String path1 = "home\\user\\programming\\java";
        System.out.println(path1);

        // To print new line use \n
        // To print a tag use \t
        String path2 = "Bangladesh\nChittagong\tLohagara";
        System.out.println(path2);
    }
}
