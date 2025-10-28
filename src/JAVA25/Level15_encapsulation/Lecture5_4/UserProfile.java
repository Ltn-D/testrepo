package JAVA25.Level15_encapsulation.Lecture5_4;

public class UserProfile {
    private String userIdentifier;
    private String initialName;
    {
        userIdentifier = "DEFAULT_REG_ID";
        System.out.println("Временный ID пользователя присвоен.");
    }

    public UserProfile(String initialName) {
        this.initialName = initialName;
        System.out.println("Создан профиль с именем: " + initialName);
    }

    public UserProfile() {
        System.out.println("Создан профиль без имени.");
    }
}
