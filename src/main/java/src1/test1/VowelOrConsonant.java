package src1.test1;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is a vowel or consonant
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid letter.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Convert the character to lowercase to handle both uppercase and lowercase inputs
        ch = Character.toLowerCase(ch);
        
        // Check if the character is one of the vowels (a, e, i, o, u)
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
