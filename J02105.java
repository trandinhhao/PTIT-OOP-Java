
import java.util.*;

public class J02105 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1;i<=n;i++) {
            System.out.print("List(" + i +") = ");
            for (int j =1;j<=n;j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}
