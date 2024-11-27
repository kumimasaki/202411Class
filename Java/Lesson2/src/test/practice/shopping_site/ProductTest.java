package test.practice.shopping_site;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practice.shopping_site.Product;

public class ProductTest {
	// 在庫が減る場合のテスト
    @Test
    public void testDecreaseStock_SufficientStock() {
        // Productオブジェクトをテストメソッド内で作成
        Product product = new Product("TestProduct", 100, 100);
        int initialStock = product.getStock();
        int amountToDecrease = 30;

        // メソッド実行前の在庫数
        product.decreaseStock(amountToDecrease);

        // 在庫数が減っているか確認
        assertEquals(initialStock - amountToDecrease, product.getStock());
    }

    // 在庫が足りない場合のテスト
    @Test
    public void testDecreaseStock_InsufficientStock() {
        Product product = new Product("TestProduct", 100, 0);
        int initialStock = product.getStock();
        int amountToDecrease = 200;  // 初期在庫より多く減らそうとする

        // メソッド実行前の在庫数
        product.decreaseStock(amountToDecrease);

        // 在庫数は変わらないはず
        assertEquals(initialStock, product.getStock());
    }

    // 在庫が0の場合のテスト
    @Test
    public void testDecreaseStock_ZeroStock() {
        Product product = new Product("TestProduct", 100, 0);
        product.decreaseStock(100);  // 全ての在庫を減らす
        int amountToDecrease = 10;

        // 在庫がゼロの状態で減らす
        product.decreaseStock(amountToDecrease);

        // 在庫数がゼロのままであるか確認
        assertEquals(0, product.getStock());
    }
}
