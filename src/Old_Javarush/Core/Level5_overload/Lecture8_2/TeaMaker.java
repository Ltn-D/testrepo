package Old_Javarush.Core.Level5_overload.Lecture8_2;

public class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");

    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");

    }
}
