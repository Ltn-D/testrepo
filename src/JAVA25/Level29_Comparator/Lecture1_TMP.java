package JAVA25.Level29_Comparator;

import java.util.Objects;

public class Lecture1_TMP {
    private String name;
    private int age;
    private String pet;

    public Lecture1_TMP(String name, int age, String pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPet() {
        return pet;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Lecture1_TMP lecture11 = (Lecture1_TMP) object;
        return age == lecture11.age && Objects.equals(name, lecture11.name) && Objects.equals(pet, lecture11.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet);
    }
}
