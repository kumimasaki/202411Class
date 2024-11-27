package lesson2_1.practice4;

public class Main {

	public static void main(String[] args) {
		// 2つインスタンスを作成する。下記を引数として渡す。
		// 1つ目のインスタンス作成：半径 = 2.0
		Circle circle1 = new Circle(2.0);
		// 2つ目のインスタンス作成：半径 = 10.0
		Circle circle2 = new Circle(10.0);
		// それぞれの円の面積を求めた結果をコンソールに表示してください。
		System.out.println(circle1.area());
		double result = circle2.area();
		System.out.println(result);
	}

}
