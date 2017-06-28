package Lessons;

/**
 * @author Jeff (Taera) Kwon 
 * @version 1.0.2 2017-06-28
 */
/* Class named Brain with public access modifier.
 * Class name must match the file name for the source code ("Brain.java")
 */
public class Lesson002 {
	// VARIABLES HERE CAN BE SHARED WITHIN THIS CLASS OR OUTSIDE, DEPENDING ON ACCESS MODIFIER
	/* This can be confusing but understanding how access modifier work is very important.
	* For an example, when you create API as service, you do not want to expose your code to users.
	* By limiting user access via creating public getter/setter, you can not only protect the data, but also
	* restrict users from seeing the code itself.
	*/
	public String expression; // Accessible from any class
	protected String features; // Accessible from subclass
	private String thoughts; // Only accessible within this class
	
	public final String VERSION = "1"; // public constant variable (accessible from outside the class)
	public static final String RELEASE = "2"; // public static constant variable (it means all instance of this class will share same variable)
	// TIP! You will cover more about instance later when we get into classes and objects.		
		
	public static void main(String[] args) {
		/* Lesson 002
		 * What is variable ?
		 * Variable is a name or pointer that references to memory location where values are stored.
		 * In this example, I will show you how some declaration works.
		 */	
	
		/* final keyword is used to define constant variable.  
		 * Try to declare your constant variable with CAPITAL letters to make it easily identifiable. */
		final String MY_NAME = "Jeff (Taera) Kwon"; // This value, since it's inside main method, you only can use this variable inside the main.
		// However, VERSION and RELEASE variables can be accessed from anywhere in/out of the class (since it has public access modifier)
		
		System.out.println(MY_NAME + "... calculates");
		calculations();		
	} // End of main Block	
	
	// Calculations method will simply execute some calculations using different operators.
	/* 	TIP: strictfp tag (strict floating point) changes intermediate bits (80bits) to 64bits, which makes it gives more precise float calculations.
		This allows portability, since bits used in intermediate are identical in all platforms.
		If you want to know more about strictfp, go to https://en.wikipedia.org/wiki/Strictfp */
	private static strictfp void calculations() {
		/* Here is the list of basic operators 
		 * Addition: +
		 * Substraction: -
		 * Division: /
		 * Multiplication: *
		 * Modulus (To find remainder): %
		 * */
		float x = 4;
		float y = 3;
		float total;
		// Calculations
		total = x + y;		
		System.out.println("X + Y = " + total);
		total = x - y;
		System.out.println("X - Y = " + total);
		total = x * y;
		System.out.println("X * Y = " + total);
		total = x / y;
		System.out.println("X / Y = " + total);
		total = x % y; //"X mod Y"
		System.out.println("X % Y = " + total);		
		/* 	TIP: JAVA follow the rule of operator precedence (BDMAS)
		 	Bracker > Division = Multiplication (Order Sequence) > Addition = Substraction (Order Sequence)
			Best practice will be to use brackets. */
	} // End of calculations
} // End of Lesson002 Block
