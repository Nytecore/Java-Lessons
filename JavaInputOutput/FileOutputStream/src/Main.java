import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        // File file = new File("dosya.txt");
            // Yukarıdaki şekilde yazılan kod da yine aşağıdakinin aynısı sayılır.
        try {
            fos = new FileOutputStream("JavaInputOutput/FileOutputStream/src/dosya.txt",true);

            fos.write(65);
            fos.write(74);

                /* Yukarıdaki "fos.write(65)" metodu ile, oluşturulan dosya.txt'yi yazmak
                için oluşturulan bir metoddur. Bu metod ile, dosya.txt'miz bir text dosyası
                olacaktır ve o dosya içerisine '65' değer gönderdiğimizde bu sayı değeri
                aslında bir ASCII karakteri karşılığı gelen bir harf oluşturur (65 = A) bu
                değer, bu sayede text dosyamızın içerisine 'A' olarak en başa yazılır. Aynı
                zamanda yazma işlemini de yaparken yine bir exception ile karşılaşılır ve bunu
                yine handle etmemiz gerekir bunu da zaten try bloğu içinde olduğumuz için
                aşağıya catch bloğu içerisine eklediğimiz kod ile handle etmiş oluruz.
                "catch (IOException ex)" ---> IOException.  */

                /* Ancak yukarıdaki anlatılan işlem, FileOutputStream oluşturulurken belirtilmediği
                sürece, oradaki write() metodları silinip başka bir şey yazıldığında ya da her
                çalıştırmada, önceki karakteri silecektir ya da yeni karakteri eklemeyecektir.
                Bunu düzeltmek için de --fos = new FileOutputStream("dosya.txt");-- içerisine
                ekstra bir "true" eklememiz gerekir. Bu yazılanları tekrar tekrar üst üste
                yazılmasını ve önceki yazılanların biz belirtmediğimiz sürece silinmemesini sağlar.
                 */

                /* Bu sayede de 65 ve 74 olan ASCII karakterleri ( A ve J ) her çalıştırılmada
                birer tane daha eklenmeye başlayarak devam eder. Her çalıştırılmada AJ - AJ
                eklenir */

            byte[] array = {101,75,66,68};  // Bu sayede bu sayıların ASCII karakterleri bir
                                                // byte array'ine atılmış olur.

            fos.write(array);

                /* Yukarıdaki işlem ile yine (fos.write(array)) onun da üstünde bir byte arrayi
                oluşturmuştuk. Bunun içine 101 - 75 - 66 - 68 ASCII karakter değerleri vermiştik.
                o değerleri array referansı ile byte[] arrayine atamıştık. İşte bu işlemi yapıp
                sonrasında da array referansını fos.write(array) kodlamasını yazarak 'fos' referanslı
                new FileOutputStream içerisine gönderiyoruz ve aslında şunu demiş oluyoruz:
                "new FileOutputStream içine byte[] arrayi içindeki ASCII karakterlerini yaz."
                sonrasında da text dosyası içerisine o rakamlara karşılık gelen 'e' 'K' 'B' 'D'
                ASCII karakterleri eklenmiş olur ve yukarıda true dediğimiz için önceki eklenen
                karakterlerin yanına eklenmiş olur.
                 */

            String s = "Bora Yıldırım"; // Buradaki her bir karakterimiz ASCII rakamlarına
                                            // dönüştürülüp sonrasında byte arreyine direkt
                                                // olarak o rakamlar gönderilip dosyaya
                                                    // yazılabilir. Bunu nasıl yaparız ?

            byte[] s_array = s.getBytes();  // Bu kodlama ile String karakterlerimiz s_array
                                                // referansı ile byte[] arrayine dönüştürülmüş
                                                    // olur.

            fos.write(s_array);     // Bu kodu kullanarak da dönüştürülen String arrayini text
                                        // dosyasına yazmış oluruz. Yine yukarıda true değer
                                            // olduğu için (FileOutputStream içerisinde)
                                                // dönüştürülen byte arrayindeki ASCII
                                                    // karakterleri öncekilerin yanına eklenir.



        } catch (FileNotFoundException ex) {
            System.out.println("Dosya oluşturulurken bir hata oluştu: 'FileNotFoundException'");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazarken bir hata oluştu: 'IOException'");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu: 'IOException'");
                    /* Biz burada dosya açsak da herhangi bir exception olsa ya da olmasa da
                    Finally bloğu ile bu dosyamızın arkaplandaki kaynaklarını gereksiz yere
                    kullanmamak adına, dosyayı kapatmamız gerekir. Bunun için .close() metodu
                    finally bloğu içerisinde yazılır. Burada yine bir exception görülür ve
                    bunu da tekrar handle etmemiz gerekir.  */



            }
        }
    }
}