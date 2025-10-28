package Old_Javarush.Syntax.Objekts;

public class Lecture5_2 {
    private String model;
    private int year;

    public Lecture5_2(String model, int year) {
        this.model = model;
        this.year = year;
    }

    //напишите тут ваш код
    public int hashCode() {
        //Lecture5_2 car = (Lecture5_2) object;
        //System.out.println(model.hashCode());

        return model.hashCode() + year;


    }

    public static void main(String[] args) {
        Lecture5_2 lamborghini = new Lecture5_2("Lamborghini", 2020);
        Lecture5_2 lamborghini1 = new Lecture5_2("Lamborghini", 2020);
        Lecture5_2 ferrari = new Lecture5_2("Ferrari", 2020);
        Lecture5_2 ferrari1 = new Lecture5_2("Ferrari", 2020);
        Lecture5_2 bugatti = new Lecture5_2("Bugatti", 2020);
        Lecture5_2 bugatti1 = new Lecture5_2("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());


    }
}
