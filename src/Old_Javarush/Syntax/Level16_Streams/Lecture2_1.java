package Old_Javarush.Syntax.Level16_Streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Lecture2_1 {
    static void main(String[] args)  {
        try (Scanner scanner = new Scanner(System.in);
        var input = Files.newInputStream(Paths.get(scanner.nextLine()));// создаем входящий поток из файла имя которого вводим в первой строке
        var output = Files.newOutputStream((Paths.get(scanner.nextLine())))){ // создаем исходящий поток в файл имя которого вводим во второй строке
            byte[] bytesIn = input.readAllBytes(); //направляем первый потов в массив байтов
            byte[] byteOut = new byte[bytesIn.length];// создаем массив байт для сохранения в него поменянных местами символов
            for (int i = 0; i < bytesIn.length; i +=2) {
                if (bytesIn.length % 2 ==0 ) {
                    byteOut[i] = bytesIn[i + 1];
                    byteOut[i + 1] = bytesIn[i];
                } else {
                    if (i < bytesIn.length - 1) {
                        byteOut[i] = bytesIn[i + 1];
                        byteOut[i + 1] = bytesIn[i];
                    } else {
                        byteOut[i] = bytesIn[i];
                    }
                }
            }
            output.write(byteOut);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
