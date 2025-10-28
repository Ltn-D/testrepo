package Old_Javarush.Syntax.Collections2.Lecture5_1;


public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && currentElement != last) {
            System.out.print(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();// создали новую ноду
        newNode.value = value;//передали в неё значение
        if (first.next == null) {
            first.next = newNode;
            last.prev = newNode;
        }
        else {
            newNode.prev = last.prev;
            last.prev = newNode;
            newNode.prev.next = newNode;

        }
    }






    public static class Node {
        private Node prev;
        public String value;
        private Node next;

    }

}
