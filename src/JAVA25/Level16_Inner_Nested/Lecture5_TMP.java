package JAVA25.Level16_Inner_Nested;

public class Lecture5_TMP {
    static void main(String[] args) {
        Pair<Integer> number = new Pair<>(10, 20);
        System.out.println(number.getFirst() + number.getSecond());
        Pair <String> strings = new Pair<>("Ghbdtn", "10");
        System.out.println(strings.getFirst() + " " + strings.getSecond());
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}