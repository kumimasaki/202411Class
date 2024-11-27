package lesson1_3.if_statement;
/*
 * if文練習問題2
 */
public class Practice1 {

	public static void main(String[] args) {
		int a = 5, b = 8;
		
		if(a > b) {
			 System.out.println(a + "が大きいです");
		} else if(b > a) {
			 System.out.println(b + "が大きいです");
		} else {
			System.out.println("2つの数は等しいです");
		}
	}

}
