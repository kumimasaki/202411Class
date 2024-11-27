package practice.shopping_site;

public class Customer {
    private String name;
    private String email;
    private String address;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void placeOrder(Product product, int quantity) {
        System.out.println("Order placed by customer: " + name);
        Order order = new Order(product, quantity);
        order.processOrder();
    }
}