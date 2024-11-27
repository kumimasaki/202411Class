package practice.shopping_site;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void decreaseStock(int amount) {
        if (stock >= amount) {
            stock -= amount;
            System.out.println("Stock decreased by " + amount + " for product: " + name + ". Remaining stock: " + stock);
        } else {
            System.out.println("Insufficient stock for product: " + name);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}