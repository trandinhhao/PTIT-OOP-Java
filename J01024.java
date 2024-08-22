
import java.util.*;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            boolean check = true;
            for (char x : s.toCharArray()) {
                if (x != '0' && x != '1' && x != '2') {
                    check = false;
                    break;
                }
            }
            if(check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
