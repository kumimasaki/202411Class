package lesson2_3.capsule.practice7;

public class PercentageCoupon implements Coupon {
	// メンバ変数
    double rate;

    // コンストラクタ
    public PercentageCoupon(double rate) {
        this.rate = rate;
    }

    @Override
    public int discount(int amount) {
        return (int)(amount * rate);
    }
}