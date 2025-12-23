package LearnJavaBasics;

public class Swap2NumbersUsing3rdVaraible {
    public static void main(String[] args) {
        // Assign values directly
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using third variable
        int temp = a;  // store value of a
        a = b;         // assign b to a
        b = temp;      // assign temp (old a) to b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
