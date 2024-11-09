import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderLesson {
    public static void main(String[] args) {

        // FileReader
        // BufferReader
        // BufferWriter

        try(Scanner scanner = new Scanner(new java.io.FileReader("JavaInputOutput/FileReaderBufferReaderveWriter/src/ogrenciler.txt"))) {

                /* Yukarıdaki yapı, normalde scanner oluştururken kullanıcıdan veri almak için
                oluştururduk. Yukarıdaki yapıda ise scanner içerisinde oluşturulan ogrenci.txt
                dosyası gönderildiği için bu sefer scanner objesi kullanıcıdan alınan değerleri
                değil, bizim oluşturduğumuz dosyanın içindeki değerleri alacak.

                 FileReader reader = new FileReader (ogrenciler.txt);  ---> Normalde buradaki
                 yapı, dosyayı okutmak için yeterlidir fakat bu yapı içerisinde bir satırı
                 direkt olarak okutamıyoruz. Sadece characteri yani tek bir harfi okutabiliyoruz.
                 Komple bir satırı okutabilmek için de scanner objesinden yardım alıyoruz ve
                 Scanner objesi içerisindeki .nextLine() ve .hasNextLine() metodlarından
                 yararlanacağız...      */

            while (scanner.hasNextLine()) {
                    /* Okuyacak başka satır kaldı mı omnu sorguluyoruz döngüde. Kaldıysa true
                    olacak ve döngü sürekli okuyacak bir şey kalmayana dek (false) devam edecek.

                 System.out.println("Okunan satır : " + scanner.nextLine());
                 Okunacak bir şey kaldıysa, o satırı oku. Şeklinde bir kod yazdık.  */

                // Peki, biz eğer dosya içerisindeki "Sanat Tarihi" okuyanşları ayırmak istersek;
                // Bunun için .split() metodu kulanırız. Bu split metodu içine bir değer göndeririz
                // O string, o değere göre ayrılmış, parçalanmış olur.

                String ogrenci_bilgisi = scanner.nextLine();

                String[] array = ogrenci_bilgisi.split(",");

                // Biz splitten dönen "," değeri, bir array'e atayacağız. Yani şu şekilde olacak;
                // Arrayin birinci elemanı virgülden önce, ikinci elemanı virgülden sonra
                // Örn. I. Eleman: Bora Yıldırım // II. Elaman: Sanat Tarihi gibi..
                // Yani ben array'in birinci indeksini kontrol etmek istersen array 1 şeklimnde yapacağım.

                if (array[1].equals("Sanat Tarihi")) {
                    System.out.println("Öğrenci Bilgisi: " + ogrenci_bilgisi);
                }

                // Yukarıdaki durumda, arrayimizin 1. indeksi eğer "Sanat Tarihi" stringi ile eşitse
                // sadece Sanat Tarihi içeren öğrencilerin bilgilerini yazdır demiş oldum.

            }



        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı: 'FileNotFoundException'");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("'ArrayIndexOutOfBoundsException' hatası.");
        }
    }
}
