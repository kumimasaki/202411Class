package lesson1_2.cast;

public class Ex1 {

	public static void main(String[] args) {
		// 小さい型を大きい型に入れる
		int a = 20;
		double b;
		// double型のbに int型のaを代入
		b = a;
		System.out.println(b);

		// 大きい型を小さい型に入れる
		double c = 10.5;
		// int型のdに double型のcを代入
		int d = (int)c;
		System.out.println(d);
	}

}
