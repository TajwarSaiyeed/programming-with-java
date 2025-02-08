
public class MyMethod {

    static int sum(int a, int b) {
        return a + b;
    }

    static String fullName(String first_name, String last_name) {
        return first_name + last_name;
    }

    static void nameWithAge(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(6, 50));

        String FullName = fullName("Tajwar ", "Saiyeed");
        System.out.println(FullName);
        nameWithAge(FullName, 18);
    }
}
