package LearnJavaBasics;

public class ToLearnPrintInteger {

	public static void main(String[] args) {
		
		
		int c; //declaring a variable
		
//		Using for loop to repeate the instruction execution
		
		for( c=1;c<=10;c++) {
			
			System.out.println("Print the value of C:"+c);
			
		}

	}

}


//Explanation of Each Part
//- Initialization (c = 1)
//- This sets the starting value of the loop variable c to 1.
//- The loop begins with c = 1.
//- Condition (c <= 10)
//- Before each iteration, the loop checks if c is less than or equal to 10.
//- If the condition is true, the loop runs.
//- If false, the loop stops.
//- Increment (c++)
//- After each iteration, c increases by 1 (c = c + 1).
//- So the values of c will be: 1, 2, 3, … up to 10.
//- Loop Body ({ ... })
//- This is where you put the code that should run repeatedly.
//- Right now, it’s empty, so nothing happens inside.
//📊 How It Runs
//- Start: c = 1
//- Check: Is c <= 10? Yes → run body.
//- Increment: c++ → now c = 2.
//- Repeat until c = 11. At that point, condition fails (11 <= 10 is false), so the loop ends.
