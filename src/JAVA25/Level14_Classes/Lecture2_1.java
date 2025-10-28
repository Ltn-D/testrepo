package JAVA25.Level14_Classes;

public class Lecture2_1 {
    static void main(String[] args) {
        Cars cars1 = new Cars("Honda", 2024);
        cars1.displayDetails();
    }
    }

class Cars {
    private String carBrand;
    private int productionYear;


    public Cars(String carBrand, int productionYear) {
        this.carBrand = carBrand;
        this.productionYear = productionYear;
    }

    public void displayDetails() {
        System.out.printf("Марка: %s, год выпуска: %d",carBrand,productionYear);
    }
}
