import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();

        long candidate = nums[0];
        int count = 1;

        for(int i=1; i<nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
                count = 1;
            } else if(nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }
}
