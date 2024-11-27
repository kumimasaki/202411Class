package lesson1_3.foreach_statement;

public class Ex1 {

	public static void main(String[] args) {
		// 整数型の配列を初期化
		int[] array = {20, 30, 40};

		// 拡張for文
		for(int a : array) {
			System.out.println(a);
		}
		
		String[] test = {"AA", "BB", "CC"};
		
		for(String a : test) {
			System.out.println(a);
		}
		
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
	}

}
