import java.util.*;

public class Data_types {

    public static void main(String[] args) {
        int i1 = 4;
        double d1 = 4.0;
        String s1 = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int i2 = scan.nextInt();
        double d2 = scan.nextFloat();
        scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();
        System.out.println(i1 + i2);
        System.out.println(d1 + d2);
        System.out.println(s1 + s2);
    }
}
