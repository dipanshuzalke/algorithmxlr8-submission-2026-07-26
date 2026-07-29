import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long target = sc.nextLong();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) numbers[i] = sc.nextLong();

        int left = 0, right = numbers.length - 1;

        while(left <= right) {
            long sum = numbers[left] + numbers[right];

            if(sum == target) {
                System.out.println((left + 1) + " " + (right + 1));
                return;
            }

            if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
