package JAVA25.Level26;

public class Lecture5_2 {
    static class UniversalChest<T>{
        private T value;

        public void put(T value) {
            this.value = value;
        }

        public T take() {
            T item = value;
            value = null;
            return item;
        }
    }

    static void main(String[] args) {
        UniversalChest<String> messageChest = new UniversalChest<>();
        messageChest.put("Тайное послание: «Да пребудет с тобой Java!»");
        UniversalChest<Integer> numberChest = new UniversalChest<>();
        numberChest.put(777);
        String secretMessage = messageChest.take();
        Integer magicNumber = numberChest.take();

        // Выводим содержимое на экран
        System.out.println(secretMessage);
        System.out.println(magicNumber);
        //System.out.println(messageChest.take());

    }

}
