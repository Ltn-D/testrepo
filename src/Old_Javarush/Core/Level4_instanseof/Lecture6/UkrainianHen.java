package Old_Javarush.Core.Level4_instanseof.Lecture6;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 90;
    }

    @Override
    public String getDescription() {
        String newDescription = String.format("%s Моя страна - %s. Я несу %d яиц в месяц", super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
        return newDescription;
    }

}
