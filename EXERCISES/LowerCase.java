import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();

        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {
        String[] text = string.trim().split("\\s+");
        String formattedString = "";

        for (String word : text) {
            String formattedWord = word.toLowerCase();
            if (!word.isEmpty()) {
                if (word.length() == 1) {
                    formattedWord = formattedWord.toUpperCase();
                } else {
                    formattedWord = formattedWord.substring(0, 1).toUpperCase() + formattedWord.substring(1);
                }
                formattedString += formattedWord + " ";
            }

        }

        return formattedString;
    }
}