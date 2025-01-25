import java.util.Date;

public class Reference_Type {
    public static void main(String[] args) {
        // primitive types
        byte age = 30;
        /*
         reference types
         need to use new keyword
         here now variable is an instance of Date class
        */
        Date now = new Date();
        System.out.println(now.getTime());
        System.out.println(now);
    }
}
