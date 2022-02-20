public class Main {
    public static void main(String[] args) {
        int minAmount = 1000; // минимальная сумма внесения для получения бонусов
        int bonusPrice = 100; // стоимость 1 бонуса
        int balance = 100; // текущий баланс
        int amount = 1001; // сумма пополнения
        int bonus = amount > minAmount ? amount / bonusPrice : 0;
        int newBalance = balance + amount + bonus;
        System.out.println("New balance: " + newBalance + "; bonus: " + bonus);
    }
}

