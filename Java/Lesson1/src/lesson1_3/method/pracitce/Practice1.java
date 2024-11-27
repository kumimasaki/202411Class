package lesson1_3.method.pracitce;
/*
 * 講義資料内練習問題
 */
public class Practice1 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		System.out.println(checkParity(3));
		String result = checkParity(2);
		System.out.println(result);
		
		checkParity(2);
	}
	
	// 整数のパリティを確定するメソッド
	public static String checkParity(int num) {
		// 偶数か奇数化を判定
		if(num % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

}
