import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();

        int sumOfDigits = sumDigitsInNumber(number);
        System.out.println(sumOfDigits);

        sc.close();
    }

    public static int sumDigitsInNumber(int number) {
        String numberString = Integer.toString(number);
        int sum = 0;

        for (int i = 0; i < numberString.length(); i++) {

            if (numberString.charAt(i) == '-') {
                sum *= -1;
            } else {
                sum += Character.getNumericValue(numberString.charAt(i));
            }
        }

        return sum;
    }
}
