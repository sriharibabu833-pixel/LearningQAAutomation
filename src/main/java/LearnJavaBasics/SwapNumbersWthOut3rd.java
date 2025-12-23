package LearnJavaBasics;

//Method 1: Using Arithmetic operator(Addition & Subtraction)
public class SwapNumbersWthOut3rd {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without third variable
        a = a + b;  // a becomes 30
        b = a - b;  // b becomes 10 (original a)
        a = a - b;  // a becomes 20 (original b)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
