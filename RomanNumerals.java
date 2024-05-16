import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainLoop: while (true) {
            System.out.print("Please, select mode. If you want to convert Roman "
                    + "numbers to decimal - type 'R2D' and press enter."
                    + System.lineSeparator()
                    + "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

            String mode = sc.next();
            if (mode.equalsIgnoreCase("R2D")) {
                while (true) {
                    System.out.print("Please, enter Roman number you want to convert: ");
                    String romanNumber = sc.next();
                    if (isRomanNumberValid(romanNumber)) {
                        System.out.println(roman2Decimal(romanNumber));
                        break mainLoop;
                    } else {
                        System.out.println("You entered invalid Roman number. "
                                + "Please, try one more time.");
                        continue;
                    }
                }
            } else if (mode.equalsIgnoreCase("D2R")) {
                while (true) {
                    System.out.print("Please, enter decimal number "
                            + "you want to convert: ");
                    int decimalNumber = sc.nextInt();
                    if (isDecimalNumberValid(decimalNumber)) {
                        System.out.println(decimal2Roman(decimalNumber));
                        break mainLoop;
                    } else {
                        System.out.println("Please, enter positive integer from 1 to 100.");
                        continue;
                    }

                }

            }

            System.out.println("Please, enter 'R2D' or 'D2R.");
        }
    }

    public static String decimal2Roman(int number) {

        int[] decimalValues = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanNumerals = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        String romanOutput = "";

        for (int i = 0; i < decimalValues.length; i++) {
            while (number >= decimalValues[i]) {
                romanOutput += romanNumerals[i];
                number -= decimalValues[i];
            }

        }

        return romanOutput;
    }

    public static int roman2Decimal(String romanNumber) {
        int I = countOccurences(romanNumber, 'I');
        int V = countOccurences(romanNumber, 'V');
        int X = countOccurences(romanNumber, 'X');
        int L = countOccurences(romanNumber, 'L');
        int C = countOccurences(romanNumber, 'C');

        int returnDecimal = 0;

        returnDecimal += (I < 4) ? (I * 1) : 0;
        returnDecimal += (V < 2) ? (V * 5) : 0;
        returnDecimal += (X < 4) ? (X * 10) : 0;
        returnDecimal += (L < 2) ? (L * 50) : 0;
        returnDecimal += (C < 2) ? (C * 100) : 0;

        returnDecimal += romanNumber.contains("IV") ? -2 : 0;
        returnDecimal += romanNumber.contains("IX") ? -2 : 0;
        returnDecimal += romanNumber.contains("XL") ? -20 : 0;
        returnDecimal += romanNumber.contains("XC") ? -20 : 0;

        return returnDecimal;
    }

    private static int countOccurences(String input, char charToMatch) {
        int count = 0;
        count = (int) input.chars().filter(ch -> ch == charToMatch).count();
        return count;
    }

    public static boolean isRomanNumberValid(String romanNumber) {
        String romanPattern = "(I|V|L|X|C){0,6}$";
        boolean matchesRomanPattern = romanNumber.matches(romanPattern);
        return matchesRomanPattern;
    }

    public static boolean isDecimalNumberValid(int decimalNumber) {
        boolean isDecimalValid = (decimalNumber > 1 && decimalNumber <= 100);
        return isDecimalValid;
    }
}
