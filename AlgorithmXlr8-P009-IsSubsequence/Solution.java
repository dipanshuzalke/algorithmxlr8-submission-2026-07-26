import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if(s.length() == 0) {
            System.out.println("true");
            return;
        }

        int i=0;

        for(int j=0; j<t.length(); j++) {
            if(i == s.length()) {
                System.out.print("true");
                return;
            }

            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        if(i == s.length()) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
