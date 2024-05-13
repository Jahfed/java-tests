public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 200; i += 20) {
            if (i >= 50) {
                break;
            }
            System.out.println(i);
        }
    }
}
