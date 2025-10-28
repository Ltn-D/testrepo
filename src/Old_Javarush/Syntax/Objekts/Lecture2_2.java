package Old_Javarush.Syntax.Objekts;

public class Lecture2_2 {
    public static final String KLASS_WAS_CREATE = "Класс создан";
    public static final String KLASS_WAS_CREATE_POLE_COUNT = "Класс создан. Переменных (полей) - ";
    public static final String KLASS_WAS_CREATE_CREATER = "Класс создан. Создатель - ";

    Lecture2_2() {
        System.out.println(KLASS_WAS_CREATE);
    }

    Lecture2_2(int x) {
        System.out.println(KLASS_WAS_CREATE_POLE_COUNT + x);
    }

    Lecture2_2(String name) {
        System.out.println(KLASS_WAS_CREATE_CREATER + name);
    }

    public static void main(String[] args) {
        Lecture2_2 klass = new Lecture2_2();
        Lecture2_2 klass1 = new Lecture2_2(3);
        Lecture2_2 klass2 = new Lecture2_2("LTN_D");
    }
}
