import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");

        String[] inputArray = sc.next().split(" ");
        int length = inputArray.length;
        int[] intArray = new int[length];

        int maxInt = findMaxIntInArray(intArray);

        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(maxInt);

        sc.close();
    }

    private static int findMaxIntInArray(int[] intArray) {
        int max = 0;
        for (int i : intArray) {
            max = i > max ? i : max;
        }
        return max;
    }
}
