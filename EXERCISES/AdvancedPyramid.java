import java.util.Scanner;

public class AdvancedPyramid {
    public static void main(String[] args) {
        System.out.print("Enter height of pyramid: ");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {

            int height = sc.nextInt();
            int base = (height * 2);

            pyramidBuilder: for (int line = 1; line <= height; line++) {
                if (height > 100 || height < 0) {
                    System.out.println(
                            "Sorry the pyramid will get too height or too low. Enter something between 0-100.");
                    break pyramidBuilder;
                }
                int emptySpace = (base - (line * 2 - 1)) / 2;
                int fillSpace = base - (emptySpace * 2);
                String pyramidLayer = "";
                for (int c = 1; c <= base; c++) {
                    if (c <= emptySpace || c >= emptySpace + fillSpace) {
                        pyramidLayer += " ";
                    } else {
                        pyramidLayer += "*";
                    }
                }
                System.out.println(pyramidLayer);
            }

        } else {
            System.out.println("Please enter a valid integer.");
        }

        sc.close();
    }
}
