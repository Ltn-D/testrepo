package JAVA25.Level17Extendet;

public class Lecture1_3 {
    static void main(String[] args) {
        // Создаем автомобиль, который наследует поведение от Vehicle
        Car car = new Car();

        // Указываем модель автомобиля
        car.vehicleModel = "Lada";

        // Запускаем автомобиль: должно вывести "Lada заводится."
        car.start();
    }
}

class Vehicle {
    String vehicleModel;
    void start() {
        System.out.println(vehicleModel + " заводится.");
    }
}

class Car extends Vehicle {

}
