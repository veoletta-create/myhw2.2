public class Main {
    public static void main(String[] args) {
        int score = 10;          // было 2
        int depositAccount = 5500; // было 3000

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;
        } else {
            bonus = 0;
        }

        int balance = score + depositAccount + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}
