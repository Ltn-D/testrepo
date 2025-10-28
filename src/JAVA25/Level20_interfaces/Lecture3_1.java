package JAVA25.Level20_interfaces;

public class Lecture3_1 {
    public static void main(String[] args) {
        // Создаём универсальный объект, который умеет выполнять оба контракта
        Sketch sketch = new Sketch();

        // Демонстрация работы: сначала рисуем, затем стираем
        sketch.draw();
        sketch.erase();
    }

    interface Drawable {
        void draw();
    }

    interface Erasable {
        void erase();
    }

    static class Sketch implements Drawable, Erasable {
        @Override
        public void draw() {
            System.out.println("Рисунок создан");
        }

        @Override
        public void erase() {
            System.out.println("Рисунок стёрт");
        }
    }
}
