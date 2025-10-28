package Old_Javarush.Syntax.Collections;

public class Lecture2_3 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                count += 1;
            }
        }      //напишите тут ваш код
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {//
            if (Character.isLetter(c)) {
        /* ну или так:
        for (int i =0; i < string.length(); i++){
            if (Character.isLetter(string.charAt(i))){ - здесь обращаемся к символу строки по его индексу
        */
                count += 1;
            }
        }

        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (Character.isWhitespace(c)) {
                count += 1;
            }
        }
        return count;
        //напишите тут ваш код
    }
}
