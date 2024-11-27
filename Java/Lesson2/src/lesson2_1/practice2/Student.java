package lesson2_1.practice2;

public class Student {
	// メンバ変数
	String name;
	int score;
	
	// コンストラクタ
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	// オーバーロード
	public Student(String name) {
		this.name = name;
	}

	void showScore() {
		System.out.println(this.name + "さんの得点は" + score + "点です。");
	}
	
}
