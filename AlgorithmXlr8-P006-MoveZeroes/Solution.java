import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();

        int pos = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                long temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;

                pos++;
            }
        }

        for(long num : nums) {
            System.out.print(num + " ");
        }
    }
}
