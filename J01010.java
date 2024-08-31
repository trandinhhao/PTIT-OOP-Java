
import java.util.*;
import java.math.*;

public class J01010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder("");
            boolean check = true;
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp == '0' || tmp == '8' || tmp == '9') {
                    sb.append('0');
                } else if (tmp == '1') {
                    sb.append('1');
                } else {
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("INVALID");

            } else {
                boolean check_After = false;
                for (char i : sb.toString().toCharArray()) {
                    if (i != '0') {
                        check_After = true;
                        break;
                    }
                }
                if (!check_After) {
                    System.out.println("INVALID");
                } else {
                    BigInteger x = new BigInteger(sb.toString());
                    System.out.println(x);
                }
            }
        }
    }
}
