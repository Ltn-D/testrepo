package Old_Javarush.Core.Level4_instanseof.Lecture8_12;

public class Singleton {
    private Singleton() {
    }

    private static Singleton instanse = new Singleton();

    public static Singleton getInstanse() {
        return instanse;
    }
}
