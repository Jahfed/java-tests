public class Demo {
    public static void main(String[] args) {
        Present present = new Present();

        Lollipop lollipop = new Lollipop(50.0, 25.0);
        Lollipop chupaUltra = new Lollipop("Chupa Ultra", 70.0, 65.0);
        Cookie cookie = new Cookie(40.0, 20.0);
        Candy candy = new Candy(10, 4.4);
        present.addSweet(lollipop);
        present.addSweet(chupaUltra);
        present.addSweet(cookie);
        present.addSweet(candy);
        present.addSweet(candy);

        present.getSweets();

        System.out.println("\n" + present.calculateTotalWeight() + " GR TOTAL present-weight\n");
        Sweet[] filteredSweets = present.filterSweetsBySugarRange(20, 50);

        System.out.println("Sweets between 20 and 50 grams of sugar:");
        for (Sweet sweet : filteredSweets) {
            System.out.println(sweet.getSweetName());
        }
        System.out.println("\n");
    }
}
