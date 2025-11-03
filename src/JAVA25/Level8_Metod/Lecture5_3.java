package JAVA25.Level8_Metod;

public class Lecture5_3 {
    static class FactoryBox {
        // Публичное поле для хранения размера коробки
        public int boxSize;

        // Публичный метод для установки размера коробки
        public void setDimensions(int boxSize) {
            // Используем ключевое слово this, чтобы указать, что изменяем поле класса
            this.boxSize = boxSize;

        }
    }
    public static void main(String[] args) {
        // Создаем объект класса FactoryBox
        FactoryBox productBox = new FactoryBox();
        productBox.setDimensions(10);
        // Устанавливаем размер коробки с помощью метода setDimensions
        System.out.println(productBox.boxSize);

        // Выводим на экран текущий размер коробки

    }


}

