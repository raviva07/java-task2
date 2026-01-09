
import java.util.Scanner;

public class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        System.out.println("Enter 5 products: pid price quantity (space-separated)");
        for (int i = 0; i < 5; i++) {
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        int maxPricePid = products[0].pid;
        double maxPrice = products[0].price;
        for (Product p : products) {
            if (p.price > maxPrice) {
                maxPrice = p.price;
                maxPricePid = p.pid;
            }
        }
        System.out.println("Pid with highest price: " + maxPricePid);

        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent: " + totalAmount);

        sc.close();
    }

    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }
}
