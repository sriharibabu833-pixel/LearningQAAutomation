package LearnJavaBasics;


import java.util.Scanner;

public class Swap2NumbersUsing3Varaible_Scanner {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using third variable
        int temp = a;  // store value of a
        a = b;         // assign b to a
        b = temp;      // assign temp (old a) to b

        // Display after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);

        //sc.close();
    }
}