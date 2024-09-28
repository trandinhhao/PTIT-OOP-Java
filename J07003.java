
import java.io.*;
import java.math.*;
import java.util.*;

public class J07003 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        String s = sc.next();
        while (s.length() > 1) {
            BigInteger b1 = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger b2 = new BigInteger(s.substring(s.length() / 2, s.length()));
            s = b1.add(b2).toString();
            System.out.println(s);
        }
    }
}
