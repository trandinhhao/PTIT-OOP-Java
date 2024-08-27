
import java.util.*;
import java.math.*;

public class J03015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        StringBuilder tmp1 = new StringBuilder("");
        StringBuilder tmp2 = new StringBuilder("");
        int i = 0;
        while (i < s1.length() && s1.charAt(i) == '0') {
            i++;
        }
        if (i == s1.length()) {
            tmp1.append("0");
        } else {
            for (int j = i; j < s1.length(); j++) {
                tmp1.append(s1.charAt(j));
            }
        }
        i = 0;
        while (i < s2.length() && s2.charAt(i) == '0') {
            i++;
        }
        if (i == s2.length()) {
            tmp2.append("0");
        } else {
            for (int j = i; j < s2.length(); j++) {
                tmp2.append(s2.charAt(j));
            }
        }
        BigInteger b1 = new BigInteger(tmp1.toString());
        BigInteger b2 = new BigInteger(tmp2.toString());
        System.out.println(b1.subtract(b2));
    }
}
