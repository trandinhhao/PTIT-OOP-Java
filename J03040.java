
import java.util.*;
import java.math.*;

public class J03040 {
    
    public static boolean check(ArrayList<Character> a) {
        boolean ccheck = false;
        if (a.get(0) == a.get(1) && a.get(1) == a.get(2) && a.get(3) == a.get(4)) {
            ccheck = true;
        } else if (a.get(0) < a.get(1) && a.get(1) < a.get(2) && a.get(2) < a.get(3) && a.get(3) < a.get(4)) {
            ccheck = true;
        } else if ((a.get(0) == '6' || a.get(0) == '8') && (a.get(1) == '6' || a.get(1) == '8') && (a.get(2) == '6' || a.get(2) == '8') && (a.get(3) == '6' || a.get(3) == '8') && (a.get(4) == '6' || a.get(4) == '8')) {
            ccheck = true;
        }
        return ccheck;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String s = sc.nextLine();
            ArrayList<Character> a = new ArrayList<>();
            a.add(s.charAt(5));
            a.add(s.charAt(6));
            a.add(s.charAt(7));
            a.add(s.charAt(9));
            a.add(s.charAt(10));
            if (check(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
