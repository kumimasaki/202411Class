package lesson2_4.copy;

public class Ex1 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] a = {1, 1};
		int[] b = {2, 2};
		
//		a = b;
//		System.out.println(a[0]);
//		System.out.println(b[0]);
		
		// bの内容をaにコピーする（ディープコピー）
		// 配列の中身だけコピーする
//		a = b.clone();
		
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		
		a[0] = 100;
		System.out.println(a[0]);
		System.out.println(b[0]);

	}

}
