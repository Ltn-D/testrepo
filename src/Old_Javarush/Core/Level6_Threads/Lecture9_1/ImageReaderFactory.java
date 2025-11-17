package Old_Javarush.Core.Level6_Threads.Lecture9_1;

import Old_Javarush.Core.Level6_Threads.Lecture9_1.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {
        if (types == null) {
            throw  new IllegalArgumentException ("Неизвестный тип картинки");
        }
        ImageReader reader = null;

            switch (types) {
                case BMP -> {
                    reader =  new BmpReader();
                }
                case JPG -> {
                    reader =  new JpgReader();
                }
                case PNG -> {
                    reader =  new PngReader();
                }
                default -> {
                    throw  new IllegalArgumentException ("Неизвестный тип картинки");
                }

        }
        return reader;
    }
}
