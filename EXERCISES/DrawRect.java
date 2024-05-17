import java.util.Scanner;

public class DrawRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
        sc.close();
    }

    public static void drawRectangle(int height, int width) {
        for (int h = 1; h <= height; h++) {

            for (int w = 1; w <= width; w++) {
                String c = (h == 1 || h == height || w == 1 || w == width) ? "*" : " ";
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
