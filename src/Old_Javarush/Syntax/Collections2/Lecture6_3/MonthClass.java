package Old_Javarush.Syntax.Collections2.Lecture6_3;

public class MonthClass {
    public static final MonthClass JANUARY = new MonthClass(0);
    public static final MonthClass FEBRUARY = new MonthClass(1);
    public static final MonthClass MARCH = new MonthClass(2);
    public static final MonthClass APRIL = new MonthClass(3);
    public static final MonthClass MAY = new MonthClass(4);
    public static final MonthClass JUNE = new MonthClass(5);
    public static final MonthClass JULY = new MonthClass(6);
    public static final MonthClass AUGUST = new MonthClass(7);
    public static final MonthClass SEPTEMBER = new MonthClass(8);
    public static final MonthClass OCTOBER = new MonthClass(9);
    public static final MonthClass NOVEMBER = new MonthClass(10);
    public static final MonthClass DECEMBER = new MonthClass(11);

    public static final MonthClass[] array = {JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER};

    private final int value;

    private MonthClass(int value) {
        this.value = value;
    }

    public static MonthClass[] values() {
        return array;
    }
    public int ordinal() {
        return this.value;
    }

}
