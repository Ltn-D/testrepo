package Old_Javarush.Core.Level4_instanseof.Lecture8_9;

public class Ruble extends Money {


    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
