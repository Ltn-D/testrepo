package Old_Javarush.Syntax.String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class lecture6_1 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens (String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);// создаем объект класса StringTokenizer
        String[] result = new String[tokenizer.countTokens()]; // создаем массив строк в который
        // будем копировать токены и который быдем возвращать по итогам метода
        //countTokens() - встроенный в StringTokenizer метод, который поссчитывает возможное количество токенов
        int i = 0;// счетчик индексов строк в массиве
        while (tokenizer.hasMoreTokens()) { // пока есть следующий разделитель (можно создать токен)
            String token = tokenizer.nextToken();//создаем токен встроенным в класс StringTokenizer методом
            result[i] = token; //добавляем полученную строку (токен) в массив
            i++;
        }
        return result;
    }
}
