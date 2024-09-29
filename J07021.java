
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            String s = sc.nextLine().trim();
            if (s.equals("END")) {
                break;
            }
            String[] a = s.split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for (String x : a) {
                sb.append(Character.toUpperCase(x.charAt(0)));
                for (int i = 1; i < x.length(); i++) {
                    sb.append(Character.toLowerCase(x.charAt(i)));
                }
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
