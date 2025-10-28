package JAVA25.Level24_Exception;

public class Lecture5_2 {
    static class MagicArtifact implements AutoCloseable{

        @Override
        public void close() {
            // Сообщение, подтверждающее автоматическое отключение артефакта
            System.out.println("Магический артефакт безопасно отключён");
        }
    }
    public static void main(String[] args) {
        // try-with-resources гарантирует автоматический вызов close()
        // даже если внутри блока произойдет исключение
        try (MagicArtifact artifact = new MagicArtifact()){
            System.out.println("Идёт работа с магическим артефактом");
        }


        // Здесь могла бы быть любая логика работы с артефактом

        // К этому моменту артефакт уже закрыт, сообщение выведено
    }
}
