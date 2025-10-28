package JAVA25.Level24_Exception;

public class Lecture2_4 {
    static class StorageCapacityExceededException extends Exception {
        private  int currentItemCount;
        private int maximumCapacity;

        public StorageCapacityExceededException(String message, int currentItemCount, int maximumCapacity) {
            super(message);
            this.currentItemCount = currentItemCount;
            this.maximumCapacity = maximumCapacity;
        }

        public int getCurrentItemCount() {
            return currentItemCount;
        }

        public int getMaximumCapacity() {
            return maximumCapacity;
        }
    }
    public static void tryAddItem(int value, int limit) throws StorageCapacityExceededException {
        if (value > limit) {
            throw new StorageCapacityExceededException("Превышено количество мест хранения!", value, limit);
        } else

        // Формируем понятное сообщение и передаем вместе с деталями


        // Если всё в порядке — просто сообщаем об успехе
        System.out.println("Операция успешна!");
    }

    public static void main(String[] args) {
        try {
            // Симулируем попытку добавить 150 при лимите 100
            tryAddItem(150, 100);
        } catch (StorageCapacityExceededException e) {
            // Перехватываем и выводим сообщение об ошибке и точные детали
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Текущее значение: " + e.getCurrentItemCount());
            System.out.println("Лимит: " + e.getMaximumCapacity());
        }
    }
}
