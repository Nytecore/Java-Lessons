import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Bora", "Sanat Tarihi", 140923023);


        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream
                ("JavaInputOutput/Serialization-III/src/ogrenci.bin"))) {


            out.writeObject(ogrenci1);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }
}