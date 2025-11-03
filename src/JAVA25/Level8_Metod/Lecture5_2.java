package JAVA25.Level8_Metod;

public class Lecture5_2 {
    static class CustomerBankAccount {
        // Приватное поле — к нему нельзя обращаться напрямую из других классов
        private int accountBalance;

        // Публичный метод для контролируемого пополнения счета
        public void depositMoney(int amountToDeposit) {
            // Увеличиваем баланс на указанную сумму
            accountBalance += amountToDeposit;
        }
    }
    public static void main(String[] args) {
        // Создаем объект класса CustomerBankAccount с именем myPrivateAccount
        CustomerBankAccount myPrivateAccount = new CustomerBankAccount();
        // Пополняем баланс только через публичный метод
        myPrivateAccount.depositMoney(1000);
        // Попытка прямого доступа к приватному полю извне класса:
        System.out.println(myPrivateAccount.accountBalance);

    }

}
