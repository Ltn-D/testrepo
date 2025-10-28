package JAVA25.Level16_Inner_Nested;

public class Lecture5_1 {
    static void main(String[] args) {
        StorageBox box = new StorageBox();
        box.put("Привет из прошлого");
        Object content = box.retrieve();
        System.out.println(content);
    }
}

class StorageBox {
    private Object object;

    public void put(Object object) {
        this.object = object;
    }

    public Object retrieve() {
        return object;
    }
}