package JAVA25.Level14_Classes.Lecture2_3;

public class Counter {
    int currentValue;

    int increment() {
        return currentValue += 1;
    }
    void printValue() {
        System.out.println(currentValue);
    }
}
