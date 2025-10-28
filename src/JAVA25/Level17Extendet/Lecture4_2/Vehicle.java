package JAVA25.Level17Extendet.Lecture4_2;

public class Vehicle {
    void move() {
        System.out.println("Транспорт движется.");
    }
}

class Car extends Vehicle{
    void beep() {
        System.out.println("Машина сигналит: Бип-бип!");
    }
}
