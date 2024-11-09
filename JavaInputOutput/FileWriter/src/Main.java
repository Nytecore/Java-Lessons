import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /* Normalde biz bir dosyaya yazma işlemş yaptırtmak için FileInputStream ya da FileOutputStream
        classlarını kullanırdık. Fakat bir txt dosyası ise eğer yazacağımız dosya, normalde o classlara
        ayrıca ASCII karakterlerini aldırıp onları döngü içerisinde char veri tipine dönüştürüp onları
        okuma ve okunanı yazdırma işlemi yaptırırdım. Burada o işlemleri yapmadan kolaylıkla .write(str:)
        metodu ile direkt olarak verdiğimiz stringi dönüştürmeden direkt olarak yazdırma ve okuma işlemi
        yaptırtabiliyoruz. Bu yöntem txt gibi dosyalarda çok kolaylık sağlar fakat FileInputStream ve
        FileOutputStream'in de okuma ve yazma yapmak için çok iyi olduğu alanlar tabi ki var. Bunlar txt
        gibi değil de daha çok .mp4 .mp3 gibi içerisinde byte cinsinden veri barındıran dosyalardır. O
        dosyalarda FileInputStream ve FileOutputStream kullanılır..     */

        FileWriter writer = null;

        try {
            writer = new FileWriter("JavaInputOutput/FileWriter/src/ dosya.txt", true);

            writer.write("Bora Yıldırım\n");
            writer.write("Mesut Çelik\n");
            writer.write("Kaan Mesci");


        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu: 'IOException'");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya kapatılırken bir hata oluştu: 'IOException'");

                }
            }
        }
    }
}