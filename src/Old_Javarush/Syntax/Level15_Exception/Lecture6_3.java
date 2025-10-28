package Old_Javarush.Syntax.Level15_Exception;

import java.util.LinkedList;
import java.util.List;

public class Lecture6_3 {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(s);
        //напишите тут ваш код
    }

    public String pop() {
        return storage.removeLast();//напишите тут ваш код
    }

    public String peek() {
        return storage.getLast();//напишите тут ваш код
    }

    public boolean empty() {
        return storage.isEmpty();//напишите тут ваш код
    }

    public int search(String s) {
        return storage.indexOf(s); //напишите тут ваш код
    }
}
