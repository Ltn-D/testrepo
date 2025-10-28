package Old_Javarush.Syntax.Objekts;

public class Lecture3_1 {
    public final String manufacturer = "Lamba";
    public  final String model;
    public final int year;
    public final String color;

    public Lecture3_1(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Lecture3_1(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "orange";
    }

    public Lecture3_1(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "orange";
    }
}
