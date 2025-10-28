package Old_Javarush.Syntax.Collections2.Lecture5_2;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        Node currentElement = first.next;
        if (index <= 0156) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.next;
            if (currentElement == last) {
                return null;
            }


        }
        return currentElement.value;//напишите тут ваш код
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}



