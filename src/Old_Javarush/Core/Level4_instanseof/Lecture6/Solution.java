package Old_Javarush.Core.Level4_instanseof.Lecture6;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case Country.RUSSIA -> hen = new RussianHen();
                case Country.BELARUS -> hen = new BelarusianHen();
                case Country.MOLDOVA -> hen = new MoldovanHen();
                case Country.UKRAINE -> hen = new UkrainianHen();
                }
            return hen;
        }
    }
}
