package practice.ex2;

public class Quiz {
    protected String main;

    public Quiz(String main) {
        this.main = main;
    }

    public void displayHeader() {
        System.out.println("「次の問いに答えなさい」");
    }

    public void displayMain() {
        System.out.println(main);
    }
}
