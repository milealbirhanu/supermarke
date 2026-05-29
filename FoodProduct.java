public class FoodProduct extends Product {

    private String category;

    public FoodProduct(String name, double price, int daysToExpire, String category) {
        super(name, price, daysToExpire);
        this.category = category;
    }

    @Override
    public String toString() {
        return getName() + " (Food) - " +
                getPrice() + " birr | " +
                getDaysToExpire() + " days left";
    }
}
