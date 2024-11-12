import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Bora", "Sanat Tarihi", 140923023);
        Ogrenci ogrenci2 = new Ogrenci("Mustafa Murat", "Bilgisayar Mühendisliği", 900434028);
        Ogrenci ogrenci3 = new Ogrenci("Aydın", "Sanat Tarihi", 28342923);
        Ogrenci ogrenci4 = new Ogrenci("Berkan", "Sanat Tarihi", 434923942);
        Ogrenci ogrenci5 = new Ogrenci("Hasan", "Hukuk", 70433883);

        Ogrenci[] ogrenci_array = {ogrenci1, ogrenci2, ogrenci3, ogrenci4, ogrenci5};
            // Ogrenci array'ı oluşturuldu ve içerisine objeler eklendi.

        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));
            // Ogrenci objesini içeren bir ArrayList oluşturuldu.
            /* Yukarıdad yer alan Constructor ilk kez kullanıldı. (Arrays.asList(ogrenci_array)
            Bu constructor; "Arrays" classından .asList() metodunu çağırıyor. İçerisine de oluş-
            turulan ogrenci_array ekleniyor.    */


        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream
                ("JavaInputOutput/Serialization-II/src/ogrenciler.bin"))) {

            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }
}