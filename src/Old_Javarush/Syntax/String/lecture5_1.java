package Old_Javarush.Syntax.String;

public class lecture5_1 {
    public static void main(String[] args) {
        String[] urls = {"htdtps://javarush.ru", "https://google.coma", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        int indexProtocol = url.indexOf("://");
        if (indexProtocol > 0 && indexProtocol <=5) {
            return url.substring(0, indexProtocol);
        }  else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        int indexDot = url.lastIndexOf('.');
        int l = url.length();
        int indexEnd = l - 4;
        if (indexDot > 0 && indexDot >= indexEnd) {
            return url.substring(indexDot);
        } else {
            return "неизвестный";
        }
    }
}
