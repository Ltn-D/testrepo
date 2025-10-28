package Old_Javarush.Syntax.Level19_Lambda.Lecture4_TMP;

public abstract class Animal {
    private String name;
    private Color color;
    private int age;

    public Animal(int age, Color color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
