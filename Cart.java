import java.util.ArrayList;

public class Cart {
    //ArrayList<Product>
   // a list that stores many Product objects 
    //items
    //name of the list (like cart name)
    //new ArrayList<>()
    //creates an empty list in memory
    ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product p) {
        items.add(p);
        System.out.println("Added: " + p);
    }

    public void showCart() {

        if (items.isEmpty()) {
            System.out.println("Cart is empty   ");
            return;
        }

        for (Product p : items) {
            System.out.println(p);
        }
    }

    public double getTotal() {

        double total = 0;

        for (Product p : items) {
            total += p.getPrice();
        }

        return total;
    }

    public void showTotal() {
        System.out.println("TOTAL = " + getTotal() + " birr");
    }
}
