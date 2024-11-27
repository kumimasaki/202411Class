package lesson1_3.method;

public class Ex3 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		greeting("Aさん", 20);
		// Bさんこんにちは！私の年齢は30歳です
		greeting("Bさん", 30);
	}

	// 挨拶をするメソッドの作成
	public static void greeting(String name, int age) {
		// Aさんこんにちは！私の年齢は20歳です。
		System.out.println(name + "こんにちは！私の年齢は" + age + "歳です。");
	}
}
