package LearnJavaBasics;

import java.util.Scanner;

public class SwapNumbersWithOut3ViaScanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without third variable (using arithmetic)
        a = a + b;  // sum of both
        b = a - b;  // original a
        a = a - b;  // original b

        System.out.println("After swapping: a = " + a + ", b = " + b);

        //sc.close();
    }
}


//Swap without third variable (using XOR)
//a = a ^ b;
//b = a ^ b;
//a = a ^ b;