package JAVA25.Level19_Abstract.Lecture1_4;

public class PaypalPayment extends Payment {
    @Override
    void process() {
        System.out.println("Обработка платежа через PayPal");
    }
}
