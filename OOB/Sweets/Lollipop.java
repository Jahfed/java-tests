public class Lollipop extends Sweet {

    Lollipop(String name, double weight, double sugarWeight) {
        super(name, weight, sugarWeight);
    }

    Lollipop(double weight, double sugarWeight) {
        super("Lollipop", weight, sugarWeight);
    }

    @Override
    public void displaySweetDetails() {
        System.out.println("name: " + getSweetName());
        System.out.println("weight: " + getWeight());
        System.out.println("sugar weight: " + getSugarWeight());
    }
}
