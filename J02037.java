
import java.util.*;
import java.math.*;

public class J02037 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String s = sc.nextLine();
            ArrayList<BigInteger> a = new ArrayList<>();
            String[] x = s.split("\\s+");
            int cnt = x.length;
            int chan = 0;
            int le = 0;
            for (String i : x) {
                int tmp = i.charAt(i.length()-1) - '0';
                if (tmp == 0 || tmp == 2 || tmp == 4 || tmp == 6 || tmp == 8) {
                    chan ++;
                } else {
                    le++;
                }
            }
            if (cnt % 2 == 0 && chan >le) {
                System.out.println("YES");
            } else if (cnt % 2 == 1 && le > chan) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
