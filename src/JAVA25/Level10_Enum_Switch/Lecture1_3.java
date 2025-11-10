package JAVA25.Level10_Enum_Switch;

public class Lecture1_3 {
    public static void main(String[] args) {
        // Исходная цена товара (примитивный тип double)
        double productPrice = 3.14;
        // Автоматическая упаковка (autoboxing) в объект типа-обёртки Double
        Double wrappedPrice = productPrice;

        // Автоматическая распаковка (unboxing) обратно в примитивный тип double
        double finalCalculatedPrice = wrappedPrice;
        // Вывод финального "разупакованного" значения на экран
        System.out.println(finalCalculatedPrice);

    }
}
