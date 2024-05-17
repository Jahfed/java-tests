public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
            "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
            "james;Derek James;james@gmail.com" + System.lineSeparator() +
            "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
            "gregory;Mike Gregory;gregory@yahoo.com";

    public static void main(String[] args) {
        System.out.println("===== Convert 1 demo =====");
        System.out.println(convert1(INPUT_DATA));

        System.out.println("===== Convert 2 demo =====");
        System.out.println(convert2(INPUT_DATA));

    }

    public static String convert1(String input) {
        String template = "%s ==> %s";
        String[] inputData = input.split(System.lineSeparator());
        String convertedData = "";
        int init = 1;
        for (String data : inputData) {
            if (init != 1) {

                String[] dataElements = data.split(";");
                convertedData += String.format(template, dataElements[0], dataElements[2]) + System.lineSeparator();
            }
            init++;
        }

        return convertedData;

    }

    public static String convert2(String input) {
        String template = "%s (email: %s)";
        String[] inputData = input.split(System.lineSeparator());
        String convertedData = "";
        int init = 1;
        for (String data : inputData) {
            if (init != 1) {

                String[] dataElements = data.split(";");
                convertedData += String.format(template, dataElements[1], dataElements[2]) + System.lineSeparator();
            }
            init++;
        }

        return convertedData;

    }

}