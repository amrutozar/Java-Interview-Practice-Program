package src1.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        String sentence = "java 8 program to capitalize first letter of each word";
        String capitalizedSentence = capitalizeFirstLetterOfEachWord(sentence);
        System.out.println(capitalizedSentence);
    }

    public static String capitalizeFirstLetterOfEachWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        return Arrays.stream(sentence.trim().split("\\s+"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}

