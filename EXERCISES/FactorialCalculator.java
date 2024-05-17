public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));
    }

    private static int calculateFactorial(int x) {
        return (x != 0) ? (x * calculateFactorial(x - 1)) : 1;
    }
}
