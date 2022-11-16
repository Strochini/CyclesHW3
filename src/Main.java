public class Main {
    public static void main(String[] args) {

        // Task 1 & 2

        int month = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i ++) {
            total = total + total / 100;
            total = total + month;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }

    }
}