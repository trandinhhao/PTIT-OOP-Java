
import java.util.*;

public class J03010 {
    
    public static TreeMap<String,Integer> mp = new TreeMap<>();

    public static void solve(String s) {
        String[] a = s.split("\\s+");
        StringBuilder sb = new StringBuilder(a[a.length-1].toLowerCase());
        for (int i = 0;i<a.length-1;i++) {
            sb.append(Character.toLowerCase(a[i].charAt(0)));
        }
        if (mp.containsKey(sb.toString())) {
            int stt = mp.get(sb.toString()) + 1;
            mp.put(sb.toString(), stt);
            sb.append(stt);
        } else {
            mp.put(sb.toString(), 1);
        }
        System.out.println(sb.toString() + "@ptit.edu.vn");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            solve(s.trim());
        }
    }
}
