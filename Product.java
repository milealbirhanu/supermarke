public class Product {

    private String name;
    private double price;
    private int daysToExpire;

    public Product(String name, double price, int daysToExpire) {
        this.name = name;
        this.price = price;
        this.daysToExpire = daysToExpire;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {

        if (daysToExpire <= 5) {
            return price * 0.8;
        }

        return price;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    @Override
    public String toString() {

        String status = (daysToExpire <= 5)
                ? "🔥 DISCOUNT ITEM"
                : "Normal";

        return name + " - " + getPrice() + " birr | " + status;
    }
}
