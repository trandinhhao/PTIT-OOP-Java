
import java.util.*;
import java.math.*;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> se = new HashSet<>();
        for (char x : s.toCharArray()) {
            se.add(x);
        }
        System.out.println(se.size());
    }
}
