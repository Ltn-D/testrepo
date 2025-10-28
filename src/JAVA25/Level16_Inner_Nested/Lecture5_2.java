package JAVA25.Level16_Inner_Nested;
class SmartBox<T> {
    private T item;

    public void store(T item) {
        this.item = item;
    }

    public T getContents() {
        return item;
    }
}
public class Lecture5_2 {


    static void main(String[] args) {
        SmartBox<Integer> intBox = new SmartBox<>();
        intBox.store(42);
        Integer value = intBox.getContents();
        System.out.println(value);
    }

}
