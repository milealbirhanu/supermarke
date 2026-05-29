import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        boolean running = true;

        String name;

        while (true) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();

            if (!name.trim().isEmpty()) {
                break;
            }

            System.out.println("Name cannot be empty!");
        }

        while (running) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Food Product");
            System.out.println("2. Add Electronic Product");
            System.out.println("3. Show Cart");
            System.out.println("4. Show Total");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("\nFOOD WE HAVE:");
                System.out.println("banana");
                System.out.println("apple");
                System.out.println("bread");
                System.out.println("coconut");

                System.out.print("Enter food name: ");
                String foodName = sc.nextLine();

                double price = 0;
                int days = 0;
                String category = "Food";

                if (foodName.equalsIgnoreCase("banana")) {
                    price = 20 + Math.random() * 20;
                    days = 5;
                } else if (foodName.equalsIgnoreCase("apple")) {
                    price = 10 + Math.random() * 20;
                    days = 3;
                } else if (foodName.equalsIgnoreCase("bread")) {
                    price = 5 + Math.random() * 10;
                    days = 2;
                } else if (foodName.equalsIgnoreCase("coconut")) {
                    price = 30 + Math.random() * 30;
                    days = 7;
                } else {
                    System.out.println("Not available!");
                    continue;
                }

                price = Math.round(price);

                Product p = new FoodProduct(foodName, price, days, category);
                cart.addProduct(p);
            }

         
            else if (choice == 2) {

                System.out.println("\nELECTRONICS WE HAVE:");
                System.out.println("phone");
                System.out.println("laptop");
                System.out.println("tv");
                System.out.println("headphones");

                System.out.print("Enter electronic name: ");
                String eName = sc.nextLine();

                double price = 0;
                int days = 365;
                int warranty = 0;

                if (eName.equalsIgnoreCase("phone")) {
                    price = 15000;
                    warranty = 12;
                } else if (eName.equalsIgnoreCase("laptop")) {
                    price = 50000;
                    warranty = 24;
                } else if (eName.equalsIgnoreCase("tv")) {
                    price = 30000;
                    warranty = 18;
                } else if (eName.equalsIgnoreCase("headphones")) {
                    price = 2000;
                    warranty = 6;
                } else {
                    System.out.println("Not available!");
                    continue;
                }

                Product p = new ElectronicProduct(eName, price, days, warranty);
                cart.addProduct(p);
            }

            // 🛒 CART
            else if (choice == 3) {
                System.out.println("\nYOUR CART:");
                cart.showCart();
            }

            
            else if (choice == 4) {
                cart.showTotal();
            }

            
            else if (choice == 5) {
                System.out.println("Thank you " + name + " for shopping!");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }

            
            if (choice >= 1 && choice <= 4) {

                System.out.print("\nDo you want anything else? (yes/no): ");
                String again = sc.nextLine();

                if (again.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for buying!");
                    running = false;
                }
            }
        }

        sc.close();
    }
}
