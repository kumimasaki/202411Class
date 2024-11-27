package practice.shopping_site;

public class Main {
    public static void main(String[] args) {
        // 商品の作成
        Product product1 = new Product("Laptop", 999.99, 10);
        Product product2 = new Product("Smartphone", 499.99, 20);

        // 顧客の作成
        Customer customer1 = new Customer("John Doe", "john@example.com", "123 Main St");

        // 注文処理
        customer1.placeOrder(product1, 3); // Laptopを3つ注文
        customer1.placeOrder(product2, 5); // Smartphoneを5つ注文
        customer1.placeOrder(product1, 8); // Laptopを8つ注文 (在庫不足)

        // 注文処理後の商品の在庫を確認
        System.out.println("Remaining stock for Laptop: " + product1.getStock());
        System.out.println("Remaining stock for Smartphone: " + product2.getStock());
    }
}
