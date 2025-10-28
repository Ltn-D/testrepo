package JAVA25.Level17Extendet.Lecture4_1;

public class Solution {
    static void main(String[] args) {
        Dog bobik = new Dog();

        // Задаём имя питомца, присваивая значение полю petName
        bobik.petName = "Бобик";

        // Просим питомца поесть — метод унаследован от Animal
        bobik.eat();
    }
}
