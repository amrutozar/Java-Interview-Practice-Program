package src1.StringProgram;

public class ReverseString {
    public static void main(String[] args) {
        String input = "JavaInterview";
        
        // Reverse the string using streams
        String reversed = new StringBuilder(input)
                            .reverse()
                            .toString();
                            
        System.out.println("Reversed String: " + reversed);
    }
}

