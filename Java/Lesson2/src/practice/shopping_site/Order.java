package practice.shopping_site;

public class Order {
    private static int nextId = 1;
    private int orderId;
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.orderId = nextId++;
        this.product = product;
        this.quantity = quantity;
    }

    public void processOrder() {
        if (product.getStock() >= quantity) {
            double totalCost = product.getPrice() * quantity;
            System.out.println("Order ID: " + orderId + ", Product: " + product.getName() + ", Quantity: " + quantity + ", Total Cost: " + totalCost);
            product.decreaseStock(quantity);
        } else {
            System.out.println("Insufficient stock for order ID: " + orderId + ", Product: " + product.getName());
        }
    }
}