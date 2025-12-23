package LearnJavaBasics;

import java.util.Scanner;

public class Add2NumbersViaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Add the numbers
        int sum = a + b;

        // Display result
        System.out.println("Sum = " + sum);

        //sc.close();
    }
}
