package JAVA25.Level9_String;

public class Lecture4_4 {
    public static void main(String[] args) {
        // Объявляем две переменные с email-адресами
        String emailOne = "User@Example.com";
        String emailTwo = "user@example.com";

        // Сравниваем email-адреса без учёта регистра
        boolean result1 =  emailOne.equalsIgnoreCase(emailTwo);


        // Создаем сообщение о регистрации пользователя
        String registrationMessage = "user@example.com is registered";

        // Проверяем, содержит ли сообщение подстроку "example"
        boolean result2 = registrationMessage.contains("example");


        // Выводим оба результата в одной строке через пробел
        System.out.println(result1 + " " + result2);

    }

}
