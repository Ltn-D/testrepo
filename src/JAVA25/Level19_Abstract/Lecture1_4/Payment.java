package JAVA25.Level19_Abstract.Lecture1_4;

public abstract class Payment {
    void printInfo() {
        System.out.println("Платёж обрабатывается");
    }
    abstract void process();
}
