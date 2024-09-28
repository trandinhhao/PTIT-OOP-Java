
import java.io.*;
import java.util.*;

public class J07002 {

    public static void main(String[] args) {
        long sum = 0;
        try {
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()) {
                try {
                    int tmp = Integer.parseInt(sc.next());
                    sum += tmp;
                } catch (Exception e) {
                    
                }
            }
            
        } catch (Exception ex) {
            
        }
        System.out.println(sum);
    }
}
