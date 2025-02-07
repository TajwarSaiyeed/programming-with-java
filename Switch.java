public class Switch{
    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("Your are an admin user");
                System.out.println("Hello world");
                break;
            case "superuser":
                System.out.println("You are a superuser");
                break;
            default:
                System.out.println("You are a guest");
        }
    }
}
