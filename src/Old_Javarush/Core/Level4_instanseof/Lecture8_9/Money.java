package Old_Javarush.Core.Level4_instanseof.Lecture8_9;

public abstract class Money {
    private Double amount;
    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


    public abstract String getCurrencyName();
}
