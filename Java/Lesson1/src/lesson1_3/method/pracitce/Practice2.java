package lesson1_3.method.pracitce;
/*
 * メソッド練習問題1
 */
public class Practice2 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		int result = calculateSum(5, 3);
		System.out.println("合計：" + result);
	}
	
	// 合計計算メソッド
	public static int calculateSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
