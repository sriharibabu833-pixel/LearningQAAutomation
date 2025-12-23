package LearnJavaBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}
