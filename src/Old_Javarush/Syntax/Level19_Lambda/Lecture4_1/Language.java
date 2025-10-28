package Old_Javarush.Syntax.Level19_Lambda.Lecture4_1;

public class Language {
    private String name;
    private Double ranking;

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    public String toString() {
        return "Язык программирования - " + name + ", рейтинг  - " + ranking + "% опрошенных.";
    }

    public Language(String name, Double ranking) {
        this.name = name;
        this.ranking = ranking;
    }
}
