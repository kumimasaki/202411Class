package lesson2_2.extends_ex;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		Cat alice = new Cat("Alice", 5, "black");
		System.out.println(alice.name);
		alice.eat("キャットフード");
		alice.sounds();
		
		// Dogクラスのインスタンスを作成
		Dog bob = new Dog("Bob", 10, "white");
		// Animalクラスの振る舞い(eatメソッド)を呼び出し
		bob.eat("ドッグフード");
		// Dogクラスの色を表示
		System.out.println(bob.color);
		
		// ポリモーフィズム（多態性）
		Animal kitty = new Cat("Kitty", 2, "red");
		// Animalしか見れない + 猫独自のものなので使うことはできない
//		System.out.println(kitty.color);
		
		System.out.println(kitty.name);
		kitty.sounds();
		
		// ポリモーフィズムのメリット
		Animal[] animals = {
				new Cat("alice", 1, "red"),
				new Dog("bob", 2, "black")
		};
		
		// for-each(拡張for文)
		for(Animal a : animals) {
			a.sounds();
		}
		
		// toStringの必要性
		System.out.println(alice);
		
		// インターフェースはインスタンス化できない
//		Runnable run = new Runnable();
		alice.run();
		bob.run();
	}

}
