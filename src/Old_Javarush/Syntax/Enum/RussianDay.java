package Old_Javarush.Syntax.Enum;

public enum RussianDay
{
    MONDAY("Понедельник"),// пока не понятно, но вроде как здесь сразу идет присвоение константам значений (поля класса)
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String russianName;//вводится переменная

    RussianDay(String russianName) {
        this.russianName = russianName;}// конструктор к котором, как я думаю переменной russianName присваивается значение из перечисления
// метод для получения значения переменной russianName:
    public String getRussianName() {
        return russianName;
    }
}


