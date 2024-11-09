import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream
                ("JavaInputOutput/Serialization-I/src/ogrenci.bin"))) {

            // Okumak istediğimiz dosyayı okutacağımız kodu yazıyoruz ve dosyanın konumunu bleirtiyoruz.
                // Sonra da dosyada oluşacak exceptionları hanle ediyoruz.
                    // Okuma yaparken yine biz nasıl yazma yaptıysak hangi sırayla yaptıysak o sıraya göre
                        // Okuma yaptırmamız gerekiyor.

                /* Aşağıdaki yapıda obje oluşturur gibi oluşum yapıyoruz fakat "= new Ogrenci" yerine,
                "= (in referansından)in.readObject();" şeklinde yazıyoruz. Ancak bi sıkıntı çıkar.
                Ogrenci objelerimiz aslında en üst sınıf olan bir Object classından türedikleri için
                burada writeObject dediğimizde "ogrenci1" bir objeye dönüştürülüyor. Bizim de burada
                objeye dönüştürülmüş halini bu sefer de öğrenciye dönüştürmemiz gereiyor. Yanu birada
                bir tür dönüşümü yapmamız gerekiyor ve (Ogrenci) şeklinde belirtmemiz gerekiyor.
                 */

            Ogrenci ogrenci1 = (Ogrenci) in.readObject();
            Ogrenci ogrenci2 = (Ogrenci) in.readObject();

                    // Okuduklarımızı direkt olarak bir bastıralım....

            System.out.println("********************************************");
            System.out.println("\t\t Okunan Objeler: ");
            System.out.println(ogrenci1);
            System.out.println(ogrenci2);
            System.out.println("********************************************");

                /* İşte serialization tamamıyla bu şekilde yapılacbilmektedir.
                Bunun avantajı da eğer bu öğrenci1 ve öğrenci2 çok uzun sürede
                oluşuyorsa ve bunları tekrar tekrar oluşturmak istemiyorsak biz
                bu objeleri bir kez oluşturucaz, daha sonra bunu bir dosyaya
                yazacağız, sonra da istediğimiz yerde istediğimiz zaman bunları
                kullanabileceğiz. Sterialization mantığı bu şekilde çalışıyor.  */



        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Böyle bir sınıf bulunamadı.");
        }
    }
}