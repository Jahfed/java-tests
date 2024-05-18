public class Cookie extends Sweet {

    Cookie(String name, double weight, double sugarWeight) {
        super(name, weight, sugarWeight);
    }

    Cookie(double weight, double sugarWeight) {
        super("Cookie", weight, sugarWeight);
    }

    @Override
    public void displaySweetDetails() {
        System.out.println("name: " + getSweetName());
        System.out.println("weight: " + getWeight());
        System.out.println("sugar weight: " + getSugarWeight());
    }
}
