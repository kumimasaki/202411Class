package lesson3_2.lamda_ex;

public class Ex1 {

	public static void main(String[] args) {
		// ラムダ式の書き方
		//		Color c = (String a) -> {
		//			return a + "色です。";
		//		};

		// 省略したラムダ式の書き方
		Color c = a -> a + "色です。";
		
		// 呼び出し
		System.out.println(c.write("赤"));
	}

}
