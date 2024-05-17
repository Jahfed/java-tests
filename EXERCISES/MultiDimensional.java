import java.util.ArrayList;

public class MultiDimensional {
    public static void main(String[] args) {

        int[][][] arr = {
                {
                        { 1, 5, 3, 6, 4 },
                        { 1, 2, 5, 4, 6 }
                },
                {
                        { 2, 6, 35, 46, 35 },
                        { 25, 25, 46, 46, 35 }
                }
        };
        int sum = 0;
        sum = sumOfArray(arr);
        System.out.println(sum);
    }

    public static int sumOfArray(Object obj) {
        if (obj instanceof int[]) {
            int[] arr = (int[]) obj;
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
                sum += num;
            }
            System.out.println(list);
            return sum;
        } else if (obj instanceof Object[]) {
            int sum = 0;
            for (Object subArray : (Object[]) obj) {
                sumOfArray(subArray);
            }
            return sum;
        } else {
            // Handle other types if needed
            return 0;
        }
    }
}