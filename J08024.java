package TEST;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class J08024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger nine = BigInteger.valueOf(9);
        BigInteger ten = BigInteger.valueOf(10);
        BigInteger zero = BigInteger.valueOf(0);
        while (t-- > 0) {
            BigInteger x = sc.nextBigInteger();
            BigInteger tmp = new BigInteger("9");
            ArrayList<BigInteger> a = new ArrayList<>();
            a.add(tmp);
            boolean check = false;
            while (!check) {
                BigInteger b = a.get(0);
                a.remove(b);
                if (b.mod(x).equals(zero)) {
                    System.out.println(b.toString());
                    check = true;
                }
                a.add(b.multiply(ten).add(zero));
                a.add(b.multiply(ten).add(nine));
            }
        }
    }
}
