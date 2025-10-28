package Old_Javarush.Core.Level4_instanseof.Lecture8_9;

public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
