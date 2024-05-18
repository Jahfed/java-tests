public class Candy
        extends Sweet {

    public Candy(String name, double weight, double sugarWeight) {
        super(name, weight, sugarWeight);
    }

    public Candy(double weight, double sugarWeight) {
        super("Candy", weight, sugarWeight);
    }

    @Override
    public void displaySweetDetails() {
        System.out.println("Name: " + getSweetName());
        System.out.println("Sweet weights: " + getWeight());
        System.out.println("Sugar content: " + getSugarWeight());
    }

}
