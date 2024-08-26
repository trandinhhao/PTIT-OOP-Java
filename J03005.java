
import java.util.*;

public class J03005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- >0) {
            String tmp = sc.nextLine();
            String s = tmp.trim();
            StringBuilder sb = new StringBuilder("");
            String[] a = s.split("\\s+");
            boolean check = false;
            for (String i : a) {
                if (!check) {
                    check = true;
                    continue;
                }
                sb.append(Character.toUpperCase(i.charAt(0)));
                for (int j = 1; j<i.length(); j ++) {
                    sb.append(Character.toLowerCase(i.charAt(j)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(", ");
            sb.append(a[0].toUpperCase());
            System.out.println(sb.toString());
        }
    }
}
