package Old_Javarush.Core.Level4_instanseof.Lecture6;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        String newDescription = String.format("%s Моя страна - %s. Я несу %d яиц в месяц", super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());
        return newDescription;
    }
}
