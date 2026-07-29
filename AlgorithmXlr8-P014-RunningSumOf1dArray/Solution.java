import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();

        long[] prefix = new long[nums.length];

        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int j=0; j<prefix.length; j++) {
            System.out.print(prefix[j] + " ");
        }
    }
}
