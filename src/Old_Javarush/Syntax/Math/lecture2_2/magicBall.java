package Old_Javarush.Syntax.Math.lecture2_2;

public class magicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определенно да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOG = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO ="Мой ответ - нет";
    private static final String VERY_DOUBTFUL ="Весьма сомнительно";


    public static String getPrediction() {
        int answer = (int) (Math.random() * 8);
        if (answer == 0) {
            return CERTAIN;
        } else if (answer == 1) {
            return DEFINITELY;
        } else if (answer == 2) {
            return MOST_LIKELY;
        } else if (answer == 3) {
            return OUTLOOK_GOOG;
        } else if (answer == 4) {
            return ASK_AGAIN_LATER;
        } else if (answer == 5) {
            return TRY_AGAIN;
        } else if (answer == 6) {
            return NO;
        } else {
            return VERY_DOUBTFUL;
        }

    }
}
