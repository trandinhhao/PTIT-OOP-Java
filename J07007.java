
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("VANBAN.in");
        Scanner sc = new Scanner(f);
        TreeSet<String> se = new TreeSet<>();
        while (sc.hasNext()) {
            se.add(sc.next().trim().toLowerCase());
        }
        for (String s : se) {
            System.out.println(s);
        }
    }
}
