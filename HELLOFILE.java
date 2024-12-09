
import java.io.*;
import java.util.*;

public class HELLOFILE {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Hello.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}
