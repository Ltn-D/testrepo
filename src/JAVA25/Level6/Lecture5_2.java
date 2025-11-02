package JAVA25.Level6;

public class Lecture5_2 {
    public static void main(String[] args) {
        // Исходный символ агента — часть шифра
        char secretAgentLetter = 'G';
        int numericCode = secretAgentLetter;
        // Явно приводим char к int, получаем числовой код символа
        System.out.println(numericCode);
        char decodedAgentLetter = (char) numericCode;
        // Явно приводим int обратно к char, восстанавливаем символ
        System.out.println(decodedAgentLetter);
    }
}
