package LearnJavaBasics;

public class AddNumbers_Using_CommandLine_Arguments{
    public static void main(String[] args) {
        // args[0] and args[1] are taken from command line
    	
    	 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        args[0]="10";
        args[1]="11";
        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
