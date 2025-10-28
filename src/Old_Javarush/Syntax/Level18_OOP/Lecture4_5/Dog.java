package Old_Javarush.Syntax.Level18_OOP.Lecture4_5;

public class Dog extends Pet{
    public static final String DOG = "Я люблю людей.";

    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
}
