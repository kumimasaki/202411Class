package practice.ex3;

public class LimitedMember extends Member {
    private int startTime;
    private int endTime;

    public LimitedMember(String name, int startTime, int endTime) {
        super(name);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int getMonthlyFee() {
        return (int) (super.getMonthlyFee() * 0.6);
    }

    @Override
    public boolean isUseable(int hour) {
        // 通常の場合: 利用可能開始時間が終了時間よりも前または同じ日
        if (startTime <= endTime) {
            // 利用可能時間帯内であれば true を返す
            if (startTime <= hour && hour <= endTime) {
                return true;
            }
            // それ以外の場合は利用不可
            return false;
        } 
        // 日またがりの場合: 利用可能開始時間が終了時間よりも遅い場合
        else {
            // 利用可能時間帯が以下のどちらかの場合 true を返す:
            // 1. 開始時間から23時までの間
            // 2. 0時から終了時間までの間
            if ((startTime <= hour && hour <= 23) || (0 <= hour && hour <= endTime)) {
                return true;
            }
            // それ以外の場合は利用不可
            return false;
        }
    }
}