package JAVA25.Level16_Inner_Nested;

public class Lecture2_1 {
    static void main(String[] args) {
        // Создаём экземпляр статического вложенного класса
        // Важно: объект внешнего класса Spellbook не нужен
        Spellbook.BasicCharm charm = new Spellbook.BasicCharm();

        // Активируем заклинание
        charm.castSpell();
    }
    public static class Spellbook{
        static class BasicCharm{
            public void castSpell() {
                System.out.println("Hello from static basic charm!");
            }
        }
    }
}
