package JAVA25.Level25_Git.Lecture3_2;

public class EmailClient {
     class Email {
        private String content;
        public Email(String content) {
            this.content = content;
        }
         public String getContent() {
             return content;
         }
     }public Email composeEmail(String messageContent) {
        return new Email(messageContent);
    }
    public static void main(String[] args) {

        // Создаем почтовый клиент
        EmailClient client = new EmailClient();

        // Составляем тестовое письмо через метод composeEmail
        Email mail = client.composeEmail("test message");
        // Проверяем, что письмо создано: выводим его содержимое
        System.out.println(mail.getContent());

    }
}
