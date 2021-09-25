import java.util.*;
public class Operators{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        float mp = in.nextFloat();
        int tp = in.nextInt();
        int txp = in.nextInt();
        in.close();

        System.out.println(Math.round((mp+(mp*tp/100)+(mp*txp)/100)));

    }
}