package JAVA25.Level30_Stream;

import java.util.List;

public class Lecture2_tmp {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        // задача создать новый список куда войдут квадраты нечетных чисел
        List<Integer> oddSquares = numbers.stream()//направляет список в поток сразу объявляем что по итогу нужен список(лист)
                .filter(n-> n%2==0)// отбираем нечетные
                .map(n-> n*n)// возводим в квадрат
                .toList(); //формируем новый лист - пока не будет этой строки в остальных будет ругаться, что не тот тип (Stream вместо List
        // отбираем только первые буквы строк
        List<String> names = List.of("Anna", "Boris", "Alex");
        List<Character> firstSimbol = names.stream()//направляем список в поток
                .filter(name-> name!=null && name.isEmpty())//лучше сначала проверить наличие пустых строк
                .map(name-> name.charAt(0))//берем первые буквы
                .toList();//формируем новый список
    }
}
