
import java.util.*;

public class J02017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            a.add(sc.nextInt());
        }
        Stack<Integer> st = new Stack<>();
        for (int i : a) {
            if (!st.empty() && (st.peek() + i) % 2 == 0) {
                st.pop();
            } else {
                st.push(i);
            }
        }
        System.out.println(st.size());
    }
}
