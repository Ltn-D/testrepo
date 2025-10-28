package Old_Javarush.Syntax.Level19_Lambda;

import java.util.Optional;
import java.util.stream.Stream;

public class Lecture6_3 {
    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car1("Model S", 94_490),
                new Car1("Model 3", 50_690),
                new Car1("Model X", 99_690),
                new Car1("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car1("X5", 110_000),
                new Car1("X3", 54_000),
                new Car1("X7", 143_000),
                new Car1("X6", 125_000)
        );

        Optional<Car1> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);


        Optional<Car1> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car1> getMostExpensiveCar(Stream<Car1> cars) {
        //напишите тут ваш код
        return cars.max((car11, car12) -> car11.getPrice() - car12.getPrice());
    }

    public static Optional<Car1> getMoreExpensiveCar(Stream<Car1> cars, Car1 mostExpensiveCar) {
        return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice()).findFirst();
    }
}

class Car1 {
    private String name;
    private Integer price;

    public Car1(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
