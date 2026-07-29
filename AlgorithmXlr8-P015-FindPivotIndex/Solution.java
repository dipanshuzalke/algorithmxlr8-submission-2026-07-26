import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();

        long totalSum = 0;
        for(long num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            long rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) {
                System.out.print(i);
                return;
            }
            leftSum += nums[i];
        }

        System.out.print(-1);
    }
}
