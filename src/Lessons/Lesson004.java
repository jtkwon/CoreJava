package Lessons;

import java.util.Scanner;

/***
 * 
 * @author taera
 * @version 1.4
 * Description:	This lesson will demonstrate some of console examples where
 * 				users interact with string input/output.  Some String methods will be
 * 				demonstrated in this example.
 *  
 */
public class Lesson004 {
	// Type enumeration can be used instead of String
	// final 
	private static enum carBrands {Honda, Hyundai, Toyota, Volkswagen}; // Private accessor is not necessary as it will always be private as default
	private static String hr = "";
	public static void main(String[] args) {		
		for (int i = 0; i < 75; i++){
			hr += "=";
		}
		String answer1 = question("Which brand do you prefer ? (Enter Brand Name)");
		System.out.println("I see, so you prefer ".concat(answer1)); // Instead of '+', you can use concat to concatenate strings
		String sPrefered = "Honda";
		if (answer1.equalsIgnoreCase(sPrefered)) { // This will match answer to sPrefered (Honda)
			System.out.printf("I also prefer %s", sPrefered);			
		} else {
			System.out.printf("I prefer %s", sPrefered);
		} // People sometimes use "==" to compare strings (This will compare whether if String you are comparing are identical (Even in memory location)"
		String etc = "This will say only Good Bye";
		int startIndex = etc.indexOf("Good"); // This will return index of "Good" from string etc. (Index will be 19 as first letter is always position 0)
		System.out.println("\n" + etc.substring(startIndex)); // This will only print "Good Bye" as it extract substring of etc from startIndex (19)
		String from = "From";
		String author = "Taera";
		System.out.println(String.join(" ", "-", from, author)); // " " is delimeter (which will separate each elements - in this case, empty char)
	}
	
	/* This example covers fundamental input/output with some string methods.  It does not include any validation for learning purpose */
	private static String question(String question) {
		Scanner in = new Scanner(System.in); // Using Scanner class, you can accept input
		System.out.println(hr); // Print Horizontal Line
		System.out.println("Question: " + question); // You can use '+' to concatenate strings
		for (int i = 0; i < carBrands.values().length; i++) {
			System.out.printf("#%d: %s\n", i + 1, carBrands.values()[i]);
		}
		System.out.print("Answer: ");
		String answer = in.nextLine();
		System.out.println(hr);
		return answer;
	}
	/*
	 * Tips: 
	 * Unlike C++, String in Java is not series of characters.  Therefore, you cannot refer to a letter by position (Exception of substring) like an array.
	 * Also, in Java, Strings are immutable, which means, you cannot change value or position of letters in String directly.  There are methods (split, replace.. etc)
	 * that will help you to achieve the goal.  There are many other String methods that I cannot cover all.  Please look at String API for more details (https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
	 * There is huge difference between a string being null versus "".  Later is just string with length 0, whereas null means String object (variable) has no value associated.
	 */
}
