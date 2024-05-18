import java.util.ArrayList;
import java.util.List;

public class Present {
    private List<Sweet> sweets;

    public Present() {
        sweets = new ArrayList<>();
        System.out.println("\n");
    }

    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        List<Sweet> filteredSweets = new ArrayList<>();
        if (sweets != null) {
            for (Sweet sweet : sweets) {
                if (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight) {
                    filteredSweets.add(sweet);
                }
            }
        }

        return filteredSweets.toArray(new Sweet[filteredSweets.size()]);
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += (sweet.getWeight() > 0) ? sweet.getWeight() : 0;
        }
        return totalWeight;
    }

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
        System.out.println(sweet.getSweetName() + "Sweet is added to the present.");
    }

    public Sweet[] getSweets() {
        System.out.println("\n\n++++++PRESENTLIST+++++++\n");
        if (sweets != null) {
            for (Sweet sweet : sweets) {
                System.out.println(sweet.getSweetName().toUpperCase() + "\n" + sweet.getWeight() + " grams | "
                        + sweet.getSugarWeight() + "gr. of sugar\n");
            }
            return sweets.toArray(new Sweet[sweets.size()]);
        }
        return new Sweet[0];
    }

}
