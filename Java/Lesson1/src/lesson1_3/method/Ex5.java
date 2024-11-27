package lesson1_3.method;
/*
 * 一緒に解く　戻り値Stringの練習。パリティの前
 */
public class Ex5 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		System.out.println(checkNameLength("Taro"));
	}
	
	// 名前の長さに応じたメッセージを返すメソッド
	public static String checkNameLength(String name) {
		// 文字の長さを取得
		int length = name.length();
		
		if(length <= 3) {
			return "短い名前ですね";
		} else if(length <= 6) {
			return "ちょうどいい長さの名前ですね";
		} else {
			return "長い名前ですね";
		}
	}
}
