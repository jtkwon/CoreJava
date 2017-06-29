package Lessons;
import java.lang.Math.*; // .* means import all classes under Math package

/**
 * @author Taera
 * @version 1.3
 * Description: This lesson will cover basic math functions and how operators work.
 */
public class Lesson003 {
	/* Lesson 003 - Operations and Math functions */
	public static void main(String[] args) {
		/* In Java, to do some math calculations, you need to import java.lang.Math class.
		 * If you will be using Math functions frequently, import them as staic (as above)*/
		System.out.println("Square root of 4 is = " + sqrt(4));
		System.out.println("2 to a power of 3 is = " + power(2,3));
		operatorPractice(); // EXAMPLE 3
	}
	
	// EXAMPLE 1 - Square root
	public static int sqrt(int x) {
		int result = 0;		
		result = (int) Math.sqrt(x);  // If you want to round up, you need to do round "example - (int) Math.round(Math.sqrt(x))" 
		/* (int) is type casting.  Type casting is used if variable type (int result) can hold less information than result from calculation,
		 *  which may cause data loss (in this example, there most likely will be dataloss (ex. Doing square root of 5)
		 *  If you want to do numeric conversion, do type casting.
		 */
		return result;
	} // This is return method (it returns type int) 
	
	// EXAMPLE 2 - Power
	public static double power(double x, double y) {
		double result = 0;
		result = Math.pow(x, y);
		/* In this example, I did not use type casting.  Math.pow accepts two double type arguments, which gives off double type results.*/
		return result;
	}
	
	/* Math class provides many useful functions, such as, Abstract, Trigonometric, Exponential, Constants (PI), etc  
	 * Write Math. to see the list of functions you can you
	 */
	
	// EXAMPLE 3 - OPERATORS (Increment/Decrement)
	public static void operatorPractice() {
		int x = 2;
		int postfix = 0;
		int prefix = 0;
		// POSTFIX
		postfix = x++;
		prefix = ++x;
		System.out.println("prefix of x++ is = " + postfix); // postfix = x++ (where x will increment after postfix gets value 2 from x)
		// PREFIX
		System.out.println("prefix of ++x is = " + prefix); // prefix = ++x (where x will increment first before assigning value 4 to prefix)		
		// Why 4? ++x or x++ will increment x, notprefix or postfix.  I am just assigning incremented value to them.
		// Decrement works the same as increment (--x or x--)
		/* TIP: I advise not to use increment or decrement inside any complex calculation, as it is very prone to error as it sometimes
		 * can confuse you, giving logical error. 
		*/
	}	
}
