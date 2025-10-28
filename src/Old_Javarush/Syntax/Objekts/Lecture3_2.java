package Old_Javarush.Syntax.Objekts;

public class Lecture3_2 {
    private String type;

    public Lecture3_2(String type) {
        this.type = type;
    }

    public  void initialize(String newType) {
        this.type = newType;
    }

    public static void main(String[] args) {
        Lecture3_2 building = new Lecture3_2("Ресторан");
        building.initialize("Барбершоп");
        System.out.println(building.type);
    }
}
