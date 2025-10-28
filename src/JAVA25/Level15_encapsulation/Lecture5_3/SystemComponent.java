package JAVA25.Level15_encapsulation.Lecture5_3;

public class SystemComponent {
    static {
        System.out.println("Глобальная инициализация: Шаг 1");
    }

    static{
        System.out.println("Глобальная инициализация: Шаг 2");
    }
    {
        System.out.println("Инициализация компонента: Шаг А");
    }
    {
        System.out.println("Инициализация компонента: Шаг Б");
    }

    public SystemComponent() {
        System.out.println("Компонент полностью настроен и готов!");
    }
}
