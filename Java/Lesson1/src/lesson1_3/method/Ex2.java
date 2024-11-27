package lesson1_3.method;

public class Ex2 {

	public static void main(String[] args) {
		// ②メソッドを呼び出す
		greeting("Aさん");

	}

	// ①挨拶をするメソッドの作成
	public static void greeting(String name) {
		// 挨拶を表示
		System.out.println(name + "こんにちは！");
	}
}
