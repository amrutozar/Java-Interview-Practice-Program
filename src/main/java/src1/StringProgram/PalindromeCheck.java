package src1.StringProgram;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        
        // Check if the string is a palindrome
        boolean isPalindrome = input.equalsIgnoreCase(
                                new StringBuilder(input)
                                .reverse()
                                .toString());
                                
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

