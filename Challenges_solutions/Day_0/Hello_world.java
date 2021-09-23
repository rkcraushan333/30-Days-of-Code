import java.util.Scanner;

public class Hello_world {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // String s = scan.next();
        String s = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(s);

    }
}
