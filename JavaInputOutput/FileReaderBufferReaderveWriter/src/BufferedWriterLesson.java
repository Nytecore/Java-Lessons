import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterLesson {
    public static void main(String[] args) {

                /* BufferedWriter mantığı da aynı şekildedir. Bizim yazmak istediğimiz değerler
                bir Buffer'a koyulur ve biz o şekilde dosyaya yazmış oluruz. Biz onun yerine bir
                FileWriter kullanırsak dosyaya tek tek gidip yazmamız gerekir ve bu performans
                kaybına yol açar. Bunu nasıl kullanırız :       */


        try (BufferedWriter writer = new BufferedWriter(new FileWriter
                ("JavaInputOutput/FileReaderBufferReaderveWriter/src/ogrenciler-writer.txt"))) {

            writer.write("*** Programlama Dilleri ***\n");
            writer.write("Java\n");
            writer.write("Php\n");
            writer.write("JavaScript\n");
            writer.write("Kotlin\n");
            writer.write("C++\n");
            writer.write("C#\n");
            writer.write("Go");

            /* Biz, performans açısından bu dosyanın okunmasını artırmak için BufferedReader, eğer
            dosyamızın okunma süresini de kısaltmak için BufferedWriter kullanabiliriz.     */


        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu (IOException) ");
        }
    }
}