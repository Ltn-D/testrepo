package JAVA25.Level10_Enum_Switch;

public class Lecture5_2 {
    public static void main(String[] args) {
        // Объявляем переменную droneCommand и присваиваем ей значение "pause"
        String droneCommand = "pause";
        String droneStatusMessage = switch (droneCommand)
        {
            case "start" -> "Запуск!";
            case "stop" -> "Остановка!";
            case "pause" -> "Пауза...";
            default -> "Неизвестная команда";
        };
        // Используем современное switch-выражение для определения статуса дрона
        // Выводим сообщение о статусе дрона на экран
        System.out.println(droneStatusMessage);

    }
}
