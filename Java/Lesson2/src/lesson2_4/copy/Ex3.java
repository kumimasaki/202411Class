package lesson2_4.copy;

public class Ex3 {

	public static void main(String[] args) {
		// 文字列の比較
		String a = "Hello";
		String b = new String("Hello");
		
		System.out.println(a == b);      // 住所の比較
		System.out.println(a.equals(b)); // ★値の比較
		
		String name = "Taro";
		String userName = "Taro";
		// 住所の比較
		System.out.println(name == userName);
		// 値の比較
		System.out.println(name.equals(userName));
		
//		if(name.equals(userName)) {
//			
//		}
	}

}
