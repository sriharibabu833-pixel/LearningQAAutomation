package LearnJavaBasics;

import java.util.Scanner;

public class StringScannerExample {
    public static void main(String[] args) {
        String text = "10 20 30";
        Scanner sc = new Scanner(text);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num);
        }

        //sc.close();
    }
}
