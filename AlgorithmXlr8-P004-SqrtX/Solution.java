import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        if(x < 2) {
            System.out.println(x);
            return;
        }

        long left = 1, right = x/2;

        while(left <= right) {
            long mid = left + (right - left)/ 2;
            long square = mid * mid;
            if(square == x) {
                System.out.println((int) mid);
                return;
            } else if(square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println((int) right);
    }
}
