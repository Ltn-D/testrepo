package JAVA25.Level25_Git;

interface Pressable {
    void activateEngine();
}

public class Lecture2_2 {
    public static void main(String[] args) {
        Pressable pressable = new Pressable() {
            @Override
            public void activateEngine() {
                System.out.println("Двигатели запущены! Мы летим к звёздам!");
            }
        };
        pressable.activateEngine();
    }
}
