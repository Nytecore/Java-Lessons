import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Bora", "Sanat Tarihi", 140923023);
        Ogrenci ogrenci2 = new Ogrenci("Mustafa Murat", "Bilgisayar Mühendisliği", 100434028);
            // Yukarıdaki oluşturulan objeleri de binary dosyasına yazacağız ve serileştireceğiz..

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream
                ("JavaInputOutput/Serialization-I/src/ogrenci.bin"))) {
                    // Burada "out" referanslı bir binary (.bin) dosyası oluşturmak istediğimizi söyledik.


            /* Buradaki "writeObject, gönderdiğimiz objelerini, object'e dönüştürecek. (en üst class)
                bunu da byte dizisine dönüştürüp direkt ogrenci.bin dosyasına bunu yazacak. Aşağıdaki
                gibi dosyamızın en başına ogrenci1 objesi onun altına da ogrenci2 objesi gelecektir.
                Bunu okurken yine bu sıraya göre okumamız gerekecektir. Bu çalıştırıldığında direkt
                olarak objelerimiz yazılmış olacaktır.  */
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);


            // --------------->> PEKİ BUNLARI NASIL OKUYACAĞIZ????? ----> "ObjeyiOku" classına git.
            // --------------->> PEKİ BUNLARI NASIL OKUYACAĞIZ????? ----> "ObjeyiOku" classına git.
            // --------------->> PEKİ BUNLARI NASIL OKUYACAĞIZ????? ----> "ObjeyiOku" classına git.



        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }
}