package section2.ex1;

public class Calculator {
    public static void main(String[] args) {
    }
		/**
		 * 2つの整数の合計を返すメソッド。
		 * 
		 * 【機能概要】
		 * 引数として渡された2つの整数を足し合わせ、その結果を返す。
		 * 
		 * 【引数】
		 * @param a 1つ目の整数
		 * @param b 2つ目の整数
		 * 
		 * 【戻り値】
		 * @return 2つの整数の合計値
		 * 
		 * 【処理の流れ】
		 * 1. 引数`a`と`b`を取得する。
		 * 2. `a`と`b`を加算する。
		 * 3. 加算結果を戻り値として返す。
		 *  
		 */
    public int add(int a, int b) {
        return a + b;
    }

		/**
		 * 2つの整数の差を返すメソッド。
		 * 
		 * 【機能概要】
		 * 引数として渡された2つの整数の差を計算し、その結果を返す。
		 * 
		 * 【引数】
		 * @param a 1つ目の整数（被減数）
		 * @param b 2つ目の整数（減数）
		 * 
		 * 【戻り値】
		 * @return 2つの整数の差（`a - b`の結果）
		 * 
		 * 【処理の流れ】
		 * 1. 引数`a`と`b`を取得する。
		 * 2. `a`から`b`を減算する。
		 * 3. 減算結果を戻り値として返す。
		 * 
		 */
    public int subtract(int a, int b) {
        return a - b;
    }
    
}