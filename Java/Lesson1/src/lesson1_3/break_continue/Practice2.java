package lesson1_3.break_continue;
/*
 * 動作を読み解く練習
 */
public class Practice2 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			if (i == 2) {
				continue;
			}
			i++;
			System.out.println(i);
		}
	}

}
