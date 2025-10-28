package JAVA25.Level19_Abstract;

public class Lecture3_4 {
    public static void main(String[] args) {
        // Создаем массив базового типа Payment: можно хранить любые его наследники
        Payment[] payments = new Payment[] {
                new CashPayment(),    // экземпляр оплаты наличными
                new OnlinePayment()   // экземпляр онлайн-оплаты
        };

        // Полиморфный вызов: для каждого объекта будет вызвана своя реализация process()
        for (Payment payment : payments) {
            payment.process();
        }
    }

    static abstract class Payment {
        public abstract void process();
    }

    static class CashPayment extends Payment{
        @Override
        public void process() {
            System.out.println("Оплата наличными");
        }
    }

    static class OnlinePayment extends Payment {
        @Override
        public void process() {
            System.out.println("Онлайн-оплата");
        }
    }
}
