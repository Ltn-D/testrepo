package JAVA25.Level16_Inner_Nested;

public class Lecture3_4 {
    static void main(String[] args) {
        SecureLab lab = new SecureLab();
        lab.revealSecret();

    }
}

class SecureLab {
    private String classifiedSecret = "Секрет раскрыт!";

    void revealSecret() {
        Runnable secretOpen = new Runnable() {
            @Override
            public void run() {
                System.out.println(classifiedSecret);
            }
        };
        secretOpen.run();
    }
}
