
import java.util.*;
import java.math.*;

public class J03032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for (String x : a) {
                for (int i = x.length()-1; i>=0;i--) {
                    sb.append(x.charAt(i));
                }
                sb.append(' ');
            }
            System.out.println(sb.deleteCharAt(sb.length()-1).toString());
        }
    }
}
