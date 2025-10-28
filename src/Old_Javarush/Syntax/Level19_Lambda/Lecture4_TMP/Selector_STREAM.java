package Old_Javarush.Syntax.Level19_Lambda.Lecture4_TMP;

import java.util.List;
import java.util.stream.Collectors;

public class Selector_STREAM {
    static void main(String[] args) {
        Init.initData();
        final List<String> findNames = Init.owners.stream()// открываем поток из листа owners (содержит объеты класса owner)
                .flatMap(owner -> owner.getPets().stream())//переходим на поток питомцев (getPets)
                .filter(pet -> Cat.class.equals(pet.getClass()))// накладываем первый фильр(класс кот)
                .filter(cat -> Color.FOXY == cat.getColor())// для отфильтрованных объектов(cat) накладываем второй фильтр, по цвету
                .sorted((c1, c2) -> c1.getAge() - c2.getAge())//сортируем (с использованием корпоратора)
                .map(Animal::getName)//берем из потока объектов только имена(в потоке у нас объекты Cat, но они же и объекты Animal
                .collect(Collectors.toList());// и наконец отфильтрованный, отсортированный поток имен направляем в список
        findNames.forEach(System.out::println);
    }
}
