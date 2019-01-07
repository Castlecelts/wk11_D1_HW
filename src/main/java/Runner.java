public class Runner {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(55, 8);
        int answerAdd = (int) calc1.add();
        System.out.println(answerAdd);
    }
}
