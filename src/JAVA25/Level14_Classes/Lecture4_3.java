package JAVA25.Level14_Classes;

class Carss {
    String carBrand;
    String carModel;
    int productionYear;
    public Carss(String carBrand, String carModel, int productionYear) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.productionYear = productionYear;
    }

    public Carss(String carBrand, String carModel) {
        this(carBrand, carModel, 2024);//вызывает первый конструктор
    }

    public Carss() {
        this("Unknown", "Unknown");//вызывает второй конструктор
    }
}

public class Lecture4_3 {
    static void main(String[] args) {
        // 1) Сборка автомобиля с указанием всех параметров
        Carss fullConfigured = new Carss("Toyota", "Camry", 2022);
        printCar(fullConfigured);

        // 2) Сборка автомобиля с маркой и моделью, год автоматически станет 2024
        Carss brandModelOnly = new Carss("Tesla", "Model 3");
        printCar(brandModelOnly);

        // 3) Сборка автомобиля без параметров: "Unknown", "Unknown", 2024
        Carss defaults = new Carss();
        printCar(defaults);
    }

    // Удобный метод для вывода значений всех полей автомобиля
    private static void printCar(Carss carss) {
        System.out.println(carss.carBrand + " " + carss.carModel + " " + carss.productionYear);
    }
}
