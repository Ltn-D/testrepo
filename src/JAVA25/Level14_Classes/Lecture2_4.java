package JAVA25.Level14_Classes;

public class Lecture2_4 {
    static class BankAccount {
        private String accountOwner;
        private int accountBalance;

        public BankAccount(String accountOwner, int accountBalance) {
            this.accountOwner = accountOwner;
            this.accountBalance = accountBalance;
        }

        public BankAccount(String accountOwner) {
            this.accountOwner = accountOwner;
            accountBalance = 0;
        }

        public void deposit(int amount) {
            this.accountBalance = amount;
        }


        public void printInfo() {
            System.out.println("Владелец: " + accountOwner + ", баланс: " + accountBalance);
        }
    }
    public static void main(String[] args) {
        // Открываем счёт с заданным начальным балансом
        BankAccount ivan = new BankAccount("Иван", 1000);

        // Открываем счёт только с именем (баланс будет установлен в 0)
        BankAccount fedor = new BankAccount("Федор");

        // Пополняем второй счёт на 500 единиц
        fedor.deposit(500);

        // Выводим информацию о каждом счёте
        ivan.printInfo();
        fedor.printInfo();

    }
}
