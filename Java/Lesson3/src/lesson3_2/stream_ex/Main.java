package lesson3_2.stream_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// リストの宣言（ソース配布）
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("satou", 61));
		list.add(new Student("suzuki", 19));
		list.add(new Student("tanaka", 45));
		list.add(new Student("kojima", 68));
		list.add(new Student("sasaki", 10));
		list.add(new Student("nakajima", 59));

		// スコアが60点より小さい人を抽出
		// スコアが小さい⇒大きい順に並び替え
		// 結果をリストにまとめて表示
		System.out.println(
				// ラインを作る
				list.stream()
						.filter(e -> e.getScore() < 60)
						.sorted((s1, s2) -> s2.getScore() - s1.getScore()) // 小⇒大
						.collect(Collectors.toList()));

		// forEachで表示する場合の方法
		list.stream()
				.filter(e -> e.getScore() < 60)
				.sorted((s1, s2) -> s2.getScore() - s1.getScore()) // 大⇒小
				.forEach(a -> System.out.println("名前：" + a.getName() + " 点数：" + a.getScore()));

		// 最大値の求め方
		System.out.println(
				// ラインを作る
				list.stream()
						.max((m1, m2) -> m1.getScore() - m2.getScore()));
		
		// メソッド参照は、既存のメソッドを簡単に呼び出すための書き方
		// ラムダ式の短縮形として使える
		list.forEach(s -> System.out.println(s));
		list.forEach(System.out::println);
	}

}
