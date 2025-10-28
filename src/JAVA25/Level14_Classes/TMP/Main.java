package JAVA25.Level14_Classes.TMP;

public class Main {
    static void main(String[] args) {
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
