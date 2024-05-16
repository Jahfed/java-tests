import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter length of initial array: ");
        int baseArrayLength = sc.nextInt();
        int[] arr = generateRandomArray(baseArrayLength);
        int[] extendedArray = extendArray(arr);
        System.out.println("*** Initial array ***");
        System.out.println(Arrays.toString(arr));
        System.out.println("*** Extended array ***");
        System.out.println(Arrays.toString(extendedArray));

    }

    public static int[] extendArray(int[] arr) {
        int lengthInitialArray = arr.length;
        int lengthExtendedArray = arr.length * 2;
        int[] initialRandomArray = arr;
        int[] extendedRandomArray = new int[lengthExtendedArray];
        Random r = new Random();

        for (int i = 0; i < lengthExtendedArray; i++) {
            extendedRandomArray[i] = (i < lengthInitialArray) ? initialRandomArray[i] : (r.nextInt(100) + 1);
        }

        return extendedRandomArray;
    }

    public static int[] generateRandomArray(int amountOfElements) {
        // <write your code here>
        int[] randomArray = new int[amountOfElements];
        Random r = new Random();
        for (int i = 0; i < amountOfElements; i++) {
            randomArray[i] = r.nextInt(100);
        }

        return randomArray;
    }
}
