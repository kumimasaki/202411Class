package lesson2_4.this_and_super;

public class Person {
	// メンバ変数
	protected String name;
	protected int age;
	
	// コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// コンストラクタ2
	public Person() {
		this("name", 0);
//		System.out.println("person");
	}
	
	// メソッド
	// display 戻り値無し、引数なし
	// 処理内容："person"をコンソールに出力
	public void display() {
		System.out.println("person");
	}
}
