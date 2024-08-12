
import java.util.*;

public class J01002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        for (int i = 0; i < Test; i++) {
            int n = sc.nextInt();
            long ans = 1l * n * (n + 1) / 2;
            System.out.println(ans);
        }
    }
}
