package JAVA25.Level20_interfaces;

public class Lecture5_2 {
    public static void main(String[] args) {
        // Внедряем реализацию EmailSender в Notification
        MessageSender emailSender = new EmailSender();
        Notification notification = new Notification(emailSender);

        // Тестируем отправку уведомления
        notification.notifyUser("Привет!"); // Ожидаемый вывод: "Email отправлен: Привет!"
    }

    static interface MessageSender {
        void send(String text);
    }

    static class EmailSender implements MessageSender {
        @Override
        public void send(String text) {
            System.out.printf("Email отправлен: %s", text);
        }
    }

    static class Notification {
        private MessageSender messageSender;

        public Notification(MessageSender messageSender) {
            this.messageSender = messageSender;
        }

        public void notifyUser(String text) {
            messageSender.send(text);
        }
    }

}
