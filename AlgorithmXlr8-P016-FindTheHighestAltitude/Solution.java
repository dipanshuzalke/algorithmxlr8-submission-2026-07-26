import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] gain = new long[n];
        for (int i = 0; i < n; i++) gain[i] = sc.nextLong();

        int highest = 0;
        int altitude = 0;

        for(int i=0; i<gain.length; i++) {
            altitude += gain[i];
            highest = Math.max(highest, altitude);
        }

        System.out.print(highest);
    }
}
