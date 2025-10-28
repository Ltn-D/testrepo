package Old_Javarush.Syntax.Level18_OOP.Lecture4_5;

public class Cat extends Pet{
    public static final String CAT = "Я не люблю людей.";
    public void printInfo() {
        super.printInfo();
        System.out.println(CAT);
    }
}
