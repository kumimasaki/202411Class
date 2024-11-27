package lesson1_3.method;

public class Ex4 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		int result = calculatingChange(2000, 1000);
		System.out.println(result);
		
		System.out.println(calculatingChange(2000, 1000));
	}

	// お釣りの計算をするメソッド
	public static int calculatingChange(int payment, int totalPrice) {
//		int chage = payment - totalPrice;
//		return chage;
		return payment - totalPrice;
	}
}
