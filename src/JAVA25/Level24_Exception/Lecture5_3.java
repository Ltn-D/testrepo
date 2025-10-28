package JAVA25.Level24_Exception;

/**
 * @throws NumberFormatException если строку не возможно преобразовать в число
 */

public class Lecture5_3 {
        public static void main(String[] args) {
            try {
                parseMeasurementValue("123abc");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования числа: введены некорректные данные");;
            }
        }
        public static int parseMeasurementValue(String measurement) throws NumberFormatException {
            // Стандартный способ преобразовать строку в int; при некорректном формате бросает NumberFormatException
            return Integer.parseInt(measurement);
        }
}
