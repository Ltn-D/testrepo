package Old_Javarush.Core.Level5_overload.Lecture8_2;

public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем молоко с пенкой");
    }

    void pour() {
        System.out.println("Заливаем кофе");
    }
}
