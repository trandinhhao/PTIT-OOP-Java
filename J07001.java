
import java.io.*;
import java.util.*;

public class J07001 {

    public static void main(String[] args) {
        File f = new File("DATA.in");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            
        }
    }
}
