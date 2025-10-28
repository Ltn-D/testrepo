package Old_Javarush.Syntax.Objekts;

public class Lecture4_1 {
    private String Color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public String getBody() {
        return body;
    }

    private void setBody(String newBody) {
        this.body = newBody;
    }

    public static void main(String[] args) {
        Lecture4_1 bugatti = new Lecture4_1();
        System.out.println(bugatti.body);
        bugatti.setBody("Cabriolet");
        System.out.println(bugatti.body);
    }
}
