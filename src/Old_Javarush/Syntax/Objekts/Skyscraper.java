package Old_Javarush.Syntax.Objekts;

public class Skyscraper {
    private int floorsCount;
    private String developer;

    Skyscraper() {
        this.floorsCount = 30;
        this.developer = "Aston";
    }

    Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }
    public static void skyScraperInfo(Skyscraper skyscraper) {
        System.out.println("Строим небоскреб " + skyscraper.floorsCount + " этажей. Застройщик - " + skyscraper.developer);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperunknow = new Skyscraper(20, "Неизвестно");
        Skyscraper.skyScraperInfo(skyscraper);
        Skyscraper.skyScraperInfo(skyscraperunknow);
    }
}
