import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedReaderLesson {
    public static void main(String[] args) {

        /* BufferReader, FileReader ile aynı işi yapar. Ancak BufferedReader, performans
        açısından çok daha hızlı şekilde dosyayı okuyabilmektedir. Küçük dosyaklarda
        FileReader kullanılabilir fakat çok daha büyük dosyalarda BufferedReader
        kullanılabilir. Bizim kullanacağımız ogrenciler.txt dosyamız bilgisayarın harici
        diskinde bulunur. FileReader kullanırsak sadece şu işi yapar : Bizim Java uygulamamız
        ile bir de harici diskteki ogrenci.txt dosyamız var. FileReader, bu dosyanın hepsini
        hepsini okumak yerine gidip bir karakter okur ve geri gelir bunu sürekli olarak tekrar
        eder. Bu yüzden dosyaya çok erişim yapmış oluruz ve bu gidip gelme sürelerinde çok fazla
        performans kaybı yaşamış oluruz. Ancak biz BufferedReader oluşturursak bu BufferedReader
        kendi içinde buffer yani küme oluşturur ve dosyaya gider. "\n" (satır başı) görene kadar
        bütün karakterleri okur. Daha sonra bu Buffer'a koyar ve bunu java uygulamamıza getirir.
        Sonrasında da biz bıunu direkt olarak alabiliriz. Bu yolla biz dosyamıza daha az erişim
        sağlamış oluruz bu şekilde de performansımız direkt olarak artmış olur. Bunu şu şekilde
        düşünebiliriz: Bizim bir çay ocağımız var. Bir de garsonumuz var. Çay ocağı önünde
        3 tane müşteri beklediğini düşünelim. Her müşteri bir çay istiyor. Bu garsonun tepsisi
        olmasaydı; çay ocağına gidip bir çay doldurup ilk müşteriye, daha sonra tekrar ocağa gidip
        çayı doldurup ikinciye, sonra da tekrar çay ocağına gidip üçüncü müşteriye üçüncü çayı
        doldurup götürecekti. Yani burada aslında 3 çayı doldururken 3 kez gidip gelmiş oluyor.
        Ancak garsonun tepsisi olsaydı, siparişleri aldıktn sonra 3 çauyı doldurup tepsiye
        koyduktan sonra bir kez git gel yaparak müşterilere çayı servis edecektir. İşte tam olarak
        BufferReader buradaki tepsinin gördüğü görevi görür ve bize bu işlemde perfrmans artışı sağlar.*/

        try (Scanner scanner = new Scanner (new BufferedReader(new FileReader
                ("JavaInputOutput/FileReaderBufferReaderveWriter/src/ogrenciler.txt")))) {

            while (scanner.hasNextLine()) {
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(",");

                if (array[1].equals("Sanat Tarihi")) {
                    System.out.println("Öğrenci Bilgisi: " + ogrenci_bilgisi);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.. (FileNotFoundException) ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception oluştu.. (ArrayIndexOutOfBoundsException) ");
        }
    }
}
