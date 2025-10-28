package JAVA25.Level15_encapsulation;

public class Lecture5_2 {
    static void main(String[] args) {
        ShelterPet first = new ShelterPet();
        ShelterPet second = new ShelterPet();

    }
}

class ShelterPet {
    {
        System.out.println("Начинаем регистрацию нового питомца...");
    }

    public ShelterPet() {
        System.out.println("Запись о питомце успешно создана!");
    }
}
