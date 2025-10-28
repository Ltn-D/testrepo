package JAVA25.Level19_Abstract;

public class Lecture4_4 {
    public static void main(String[] args) {
        // Создаем массив базового типа Order — он может хранить объекты любых подклассов
        Order[] orders = {
                new OnlineOrder(100.0),
                new OfflineOrder(50.0),
                new OnlineOrder(299.99),
                new OfflineOrder(75.5)
        };

        // Полиморфизм: для каждого заказа вызывается его вариант метода process()
        for (Order order : orders) {
            order.process();
        }
    }

    static abstract class Order {
        double amount;

        public Order(double amount) {
            this.amount = amount;
        }
        public abstract void process();
    }

    static class OnlineOrder extends Order{
        public OnlineOrder(double amount) {
            super(amount);
        }
        @Override
        public void process() {
            System.out.println("Обработка онлайн-заказа на сумму " + amount);
        }
    }

    static class OfflineOrder extends Order {
        public OfflineOrder(double amount) {
            super(amount);
        }

        @Override
        public void process() {
            System.out.println( "Обработка оффлайн-заказа на сумму " + amount);
        }
    }
}
