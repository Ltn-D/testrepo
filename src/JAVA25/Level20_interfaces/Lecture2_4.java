package JAVA25.Level20_interfaces;

public class Lecture2_4 {
    public static void main(String[] args) {
        // Создаем смартфон и последовательно вызываем его действия
        SmartPhone phone = new SmartPhone();
        phone.turnOn();
        phone.work();
        phone.charge();
    }

    static abstract class Appliance {
        public void turnOn() {
            System.out.println("Устройство включено");
        }
        public abstract void work();
    }

    interface Chargeable {
        void charge();
    }

    static class SmartPhone extends Appliance implements Chargeable {
        @Override
        public void charge() {
            System.out.println("Смартфон заряжается");
        }

        @Override
        public void work() {
            System.out.println("Смартфон работает");
        }
    }
}
