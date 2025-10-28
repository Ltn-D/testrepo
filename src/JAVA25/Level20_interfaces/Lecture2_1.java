package JAVA25.Level20_interfaces;

public class Lecture2_1 {
    public static void main(String[] args) {
        Movable car = new Car(); // полиморфный тип: обращаемся через интерфейс
        car.move();              // вывод: Машина едет
    }

    interface Movable {
        void move();
    }

    static class Car implements Movable {
        @Override
        public void move() {
            System.out.println("Машина едет");
        }
    }
}
