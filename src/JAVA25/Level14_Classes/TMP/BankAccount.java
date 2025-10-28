package JAVA25.Level14_Classes.TMP;

public class BankAccount {
    String accountOwner;
    int accountBalance;
    String currency;


    public BankAccount(String accountOwner, int accountBalance, String currency) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
        this.currency = currency;
    }

    public BankAccount(String accountOwner,int accountBalance) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountOwner) {//здесь перегружаем не каждую переменную а первый консруктор сразу передав в него значения "по умолчанию" для некоторых полей
        this(accountOwner, 0, "RUB");
    }

    public BankAccount() {

    }

    int deposit(int amount) {
        return accountBalance += amount;
    }

    void printInfo() {
        System.out.println("Владелец " + accountOwner + " баланс: " + accountBalance + " евро.");
    }
}
