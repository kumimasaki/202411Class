package lesson2_4.copy;

public class Ex2 {

	public static void main(String[] args) {
		// 二次元配列の宣言
		int[][] a = {{1, 2}, {3, 4}};
		int[][] b = a.clone();
 
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i].clone();
		}
		
		a[0][0] = 100;
		System.out.println(a[0][0]);
		System.out.println(b[0][0]);
		
//		// 2重for文によるdeepコピー
//      int[][] c = { { 1, 2 }, { 3, 4 } };
//      // コピー先であるint型の2次元配列dを宣言し、上位配列のみを生成します。
//      int[][] d = new int[c.length][];
//      //cの内容をｄに正しくコピーするにはどうすれば良いかを
//      //cloneメソッドを使わないで正しいコピー
//
//      for(int i = 0; i < c.length; i++) {
//          d[i] = new int[c[i].length];
//          for(int j = 0; j < c[i].length; j++) {
//              d[i][j] = c[i][j];
//          }
//      }
//      c[0][0] = 300;
//      System.out.println(c[0][0]); // 300が出力される
//      System.out.println(d[0][0]); // 1が出力される

	}

}
