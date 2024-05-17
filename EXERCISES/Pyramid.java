import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Give the height of pyramid:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int line = 1; line <= (height * 2 - 1); line++) {
            int sum = Math.abs(line - height);
            String repeater = "*".repeat(height - sum);
            System.out.println(repeater);
        }
        sc.close();

    }
}
