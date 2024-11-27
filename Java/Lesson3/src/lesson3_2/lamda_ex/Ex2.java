package lesson3_2.lamda_ex;

public class Ex2 {

	public static void main(String[] args) {
//		// 省略しないラムダ式の書き方
//		Introduce i = (String name, String hobby) -> {
//			String hello = "name：" + name + " hobby：" + hobby;
//			return hello;
//		};
		
//		int age = 0;
		// 省略したラムダ式の書き方
		Introduce i = (name, hobby) -> {
//			age = 2;
//			String name;
			String hello = "name：" + name + " hobby：" + hobby;
			return hello;
		};
		
		System.out.println(i.intro("Alice", "Game"));
	}

}
