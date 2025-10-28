package JAVA25.Level14_Classes;

public class Lecture5_3 {
    static void main(String[] args) {
        Car newCar = new Car();
        System.out.println(newCar.count);
        Car newCar2 = new Car();
        Car newCar3 = new Car();
        Car newCar4 = new Car();

    }
}

class Car {
    String carModel = "Неизвестно";
    static int count;

    public Car() {
        this.count += 1;
        System.out.println("Создаётся объект Car, model =" + carModel + " "+count);
    }

}

