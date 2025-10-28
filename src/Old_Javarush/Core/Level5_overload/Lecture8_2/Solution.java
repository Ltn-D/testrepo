package Old_Javarush.Core.Level5_overload.Lecture8_2;

public class Solution {


    static void main(String[] args) {
        DrinkMaker tea = new TeaMaker();
        DrinkMaker latte = new LatteMaker();
        tea.makeDrink();
        latte.makeDrink();
    }

}
