package JAVA25.Level24_Exception;

public class Lecture2_TMP {
    static class ScoreLimitExceededException extends Exception {
        public ScoreLimitExceededException(String message) {
            super(message);
        }
    }

    static class User {
        private String name;
        private int score;

        public User(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public void addScore(int points) throws ScoreLimitExceededException {
            if (score + points > 100) {
                throw new ScoreLimitExceededException("Превышен лимит баллов (не может быть больше 100)! Попытка добавить: " + points);
            }
            score += points;
        }
    }

    static void main(String[] args) {
        User user = new User("Boris", 40);
        try {
            user.addScore(20);
            user.addScore(50);
        } catch (ScoreLimitExceededException e) {
            System.out.println("Ошибка. " + e.getMessage());;
        }

    }
}
