/* Class that takes input from user and counts the number
 * of words and characters (including spaces) and outputs it.
 * 
 * This class is standard input and output of the project.
 */

// Imports

import java.util.Scanner;

// Main class
public class WordCharacterCounter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner class to take input from user
		
		System.out.println("Enter a sentence:"); // User enters input
		
		String text = sc.nextLine(); // Input from user
		
		String words[] = text.split(" "); // Sentence gets split by space to recognize number of words
		int numberCharacters = text.length(); // Number of characters in the input
		int numberWords = words.length; // Number of words in the array of strings
		
		System.out.println("Number of words is " + numberWords + " & number of characters is " + numberCharacters + " including spaces."); // Output
	}
}