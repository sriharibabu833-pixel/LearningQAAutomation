package LearnJavaBasics;

//Method 2: Using Bitwise XOR operator
public class SwapNumbersWithOut3Varaible {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without third variable using XOR
        a = a ^ b;  // a becomes 30 (binary XOR result)
        b = a ^ b;  // b becomes 10 (original a)
        a = a ^ b;  // a becomes 20 (original b)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}


//Truth Table for XOR
//
//a     b     a^b
//0     0      0
//1     0      1
//0     1      1
//1     1      0



