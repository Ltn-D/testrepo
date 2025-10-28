package JAVA25.Level16_Inner_Nested;

class DataPair <T>{
    private T firstElement;
    private T secondElement;

    public DataPair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }
}

public class Lecture5_3 {
    static void main(String[] args) {
        DataPair<String> pair = new DataPair<>("Hello", "World");
        System.out.println(pair.getFirstElement() + " " + pair.getSecondElement());
    }

}
