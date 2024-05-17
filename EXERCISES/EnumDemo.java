public class EnumDemo {
    public static void main(String[] args) {
        String input = "HIGH";
        boolean isValid = false;

        for (Priority prior : Priority.values()) {
            if (prior.name().equals(input)) {
                isValid = true;
                break;
            }
        }

        System.out.println(isValid ? "You have high priority." : "You have to select a priority...");
    }
}
