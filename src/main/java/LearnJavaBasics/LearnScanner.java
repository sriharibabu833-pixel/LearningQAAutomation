package LearnJavaBasics;

import java.util.Scanner;

//Scanner mean get the inputs from user
public class LearnScanner {

	public static void main(String[] args) {
		
		
		int i;
		float f;
		String s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		s=sc.nextLine();
		
		System.out.println("You entered a string:"+s);
		i=sc.nextInt();
		System.out.println("You entered a int:"+i);
		
		f= sc.nextFloat();
		System.out.println("You entered a float:"+f);
		
		
		

	}

}
//What is Scanner?
//- Scanner is a utility class in Java (from java.util package).
//- It’s used to read input (like numbers, strings) from different sources such as keyboard (System.in), files, or strings

//Key Points
//- Always import java.util.Scanner;
//- Use new Scanner(System.in) for keyboard input.
//- Close the scanner with sc.close() to free resources.
//- Methods you’ll often use:
//- nextLine() → reads a full line
//- nextInt() → reads an integer
//- nextDouble() → reads a decimal number
//- next() → reads a single word
//-nextFloat()→ reads a float

