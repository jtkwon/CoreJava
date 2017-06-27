package Organs;

/**
 * @author Jeff (Taera) Kwon 
 * @version 1.0.1 2017-06-27
 * Description: I will be creating a framework that will resemble human brain structure.
 * The Brain class is the class that will contain public main method
 */
/* Class named Brain with public access modifier.
 * Class name must match the file name for the source code ("Brain.java")
 */
public class Brain {
	/*
	 * main method must be declared public and static.  When you compile and run this Java application,
	 * the javac (compiler) will compile this Brain.java file and create a bytecode file with same name
	 * but different extension ("Brain.class").  
	 */
	public static void main(String[] args) {
		/* Data types:
		 * Java is a strongly typed language, unlike VBScript or JavaScript, so you must declare type.
		 * Example - In JavaScript, you can simply write "var myname", where myname can contain
		 * integer, string, boolean, and etc.  In Java, to write a String, you need to create a variable type String.
		 * I always like to place comment above variable declarations.  I like to declare all STATIC variables first,
		 * then Private, and lastly Public. However, since main method is public static void, all your variables will be public.
		 */
		// Variables (Will cover all 8 data types - byte, short, int, long, float, double, char, boolean)
		// Type Integer (From smallest to largest)
		byte age = 127; // Max 8 Bits
		short tuitionFee = 32767; // Max 16 Bits
		int population = 2147483647; // Max 32 Bits
		long moneyYouCanEarn = 9223372036854755807L; // Max 64 Bits
		// I added suffix 'L' at the end to indicate Long (Since long can store 64 bits - without it, you only can store 32 bits)
		long million = 0b1111_0100_0010_0100_0000; // One million in binary (Compiler will ignore underscore) 
		/* (1,000,000 / 2 - write backward)
		   1,000,000 % 2 = 0, 500,000 % 2 = 0, 250,000 % 2 = 0, 125,000 % 2 = 0, 62,500 % 2 = 0
		   31,250 % 2 = 0, 31,250 % 2 = 1 (round up), .. and so on */ 

		// Type Float (From smallest to largest)
		float money = 29.9F; // f or F suffix to indicate float.  Without F, it is double.
		double wage = 50000.00; // Double numbers have twice the precision of the float type.  D or d suffix is optional.
		/* Some of the errors you can denote using float is POSITIVE_INFINITY, NEGATIVE_INFINITY, or NaN (Not a Number)*/
		System.out.println(Double.isNaN(wage)); // This will return false (Checking if wage is not a number)
		
		// Type Char
		char a = 'a'; // Char are enclosed in single quotes.  
		char symbol = '\u2122'; // This is unicode for trademark symbol.  \u is escape sequence for unicode.
		
		// Type Boolean (True or False)
		boolean sleeping = false;
		boolean awake = true;
		
		
		System.out.print("> "); // print will not add a new line character (\n)
		System.out.println("Time to wake up"); // this is equivalent to 'print("Time to wake up\n")';
		
		
		System.out.print("Time to wake up");
		System.out.println("Time to sleep again");
		System.exit(0); // Exit code 0 means normal exit
	} // End of main Block
} // End of Brain Block

/*
 * Why am I commenting so much?
 * Well, I do not comment this much when I code on my projects, but I do write enough codes to let other
 * developers understand my program, as long as they have understandings of Java.
 * Comments do not show up in the executable program.
 * The comment that starts with /** will generate documentation.
 * I have met many developers who follows very bad coding practices.  You think it is not important now,
 * for an example, using Camel Case for the naming contention (Example: private void TestMeNow) is very important.
 * Try to follow recommended practices while making some changes to make it better. 
 */
