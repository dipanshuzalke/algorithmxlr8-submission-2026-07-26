import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("false");
            return;
        }

        int[] factors = {2, 3, 5};
        for(int factor : factors) {
            while(n % factor == 0) {
                n /= factor;
            }
        }
        
        if(n == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
