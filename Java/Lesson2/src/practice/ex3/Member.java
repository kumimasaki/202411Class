package practice.ex3;

public class Member {
    private String name;
    private int monthlyFee;

    public Member(String name) {
        this.name = name;
        this.monthlyFee = 8000;
    }

    public String getName() {
        return this.name;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public boolean isUseable(int hour) {
        return true;
    }
}