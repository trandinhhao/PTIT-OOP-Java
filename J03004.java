
import java.util.*;

public class J03004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- >0) {
            String s = sc.nextLine();
            s = s.trim();
            String[] a = s.split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for(String x : a) {
                sb.append(Character.toUpperCase(x.charAt(0)));
                for (int i = 1;i<x.length();i++) {
                    sb.append(Character.toLowerCase(x.charAt(i)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}
