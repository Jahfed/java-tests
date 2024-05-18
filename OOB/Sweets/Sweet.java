
abstract class Sweet {

    private String name;
    private double weight;
    private double sugarWeight;

    public Sweet(String name, double weight, double sugarWeight) {
        this.name = name;
        this.weight = (weight > 0) ? weight : 0.1;
        this.sugarWeight = (sugarWeight <= weight) ? sugarWeight : weight;
    }

    public String getSweetName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarWeight() {
        return sugarWeight;
    }

    public abstract void displaySweetDetails();

}