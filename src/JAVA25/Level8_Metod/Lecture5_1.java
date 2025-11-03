package JAVA25.Level8_Metod;

public class Lecture5_1 {
    static class VillageResident {
        public String residentName;
    }
    public static void main(String[] args) {
        // Создаем объект класса VillageResident
        VillageResident newVillager = new VillageResident();

        // Прямо присваиваем значение "Иван" полю residentName
        newVillager.residentName = "Иван";

        // Выводим значение поля residentName на экран
        System.out.println(newVillager.residentName);
    }
}
