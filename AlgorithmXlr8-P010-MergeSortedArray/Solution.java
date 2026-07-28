import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long[] nums1 = new long[m + n];
        for (int i = 0; i < m + n; i++) nums1[i] = sc.nextLong();
        long[] nums2 = new long[n];
        for (int i = 0; i < n; i++) nums2[i] = sc.nextLong();

        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        for(int p = 0; p < nums1.length; p++) {
            System.out.print(nums1[p] + " ");
        }
    }
}
