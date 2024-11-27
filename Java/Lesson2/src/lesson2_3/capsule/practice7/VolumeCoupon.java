package lesson2_3.capsule.practice7;

public class VolumeCoupon implements Coupon {
	// メンバ変数
	int volume;

	// コンストラクタ
	public VolumeCoupon(int volume) {
		this.volume = volume;
	}

	@Override
	public int discount(int amount) {
		return amount - volume;
	}
}