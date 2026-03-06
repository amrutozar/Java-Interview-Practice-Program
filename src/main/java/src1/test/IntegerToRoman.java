package src1.test;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();
        int i = 0;

        while (num > 0) {
            int quotient = num / values[i];
            num %= values[i];
            for (int j = 0; j < quotient; j++) {
                romanNumeral.append(symbols[i]);
            }
            i++;
        }

        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 58;
        int num3 = 1994;

        System.out.println(num1 + " -> " + intToRoman(num1));
        System.out.println(num2 + " -> " + intToRoman(num2));
        System.out.println(num3 + " -> " + intToRoman(num3));
    }
}

