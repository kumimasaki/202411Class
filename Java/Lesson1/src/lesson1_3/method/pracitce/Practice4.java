package lesson1_3.method.pracitce;
/*
 * メソッド練習問題3
 */
public class Practice4 {

	public static void main(String[] args) {
		int[] array = { 5, 10, 15, 20 };
		// メソッドの呼び出し
		double average = calculateAverage(array);
		System.out.println("平均値: " + average);
	}

	// 配列内の全ての要素の平均値を計算するメソッド
	public static double calculateAverage(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return (double) sum / array.length;
	}
	
}
