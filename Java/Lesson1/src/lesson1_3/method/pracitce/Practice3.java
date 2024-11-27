package lesson1_3.method.pracitce;
/*
 * メソッド練習問題2
 */
public class Practice3 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		int length = calculateStringLength("Hello");
		System.out.println("文字列の長さ: " + length);
	}
	
	// 文字列の長さ返却メソッド
	public static int calculateStringLength(String word) {
		return word.length();
	}

}
