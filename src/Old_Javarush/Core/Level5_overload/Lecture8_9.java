package Old_Javarush.Core.Level5_overload;

public class Lecture8_9 {
    static {
        init();
    }
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";



    public Lecture8_9() {
        System.out.println("Lecture8_9 constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Lecture8_9 s = new Lecture8_9();
    }

    public static void printAllFields(Lecture8_9 obj) {
        System.out.println("static void printAllFields");
                System.out.println(obj.i);
                System.out.println(obj.name);
    }
}
