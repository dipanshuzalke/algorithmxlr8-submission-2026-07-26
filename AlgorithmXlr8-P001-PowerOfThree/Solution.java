import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n < 1) {
            System.out.println("false");
            return;
        }

        while(n > 1) {
            if(n % 3 != 0) {
                System.out.println("false");
                return;
            }
            n /= 3;
        }
        System.out.println("true");
    }
}
