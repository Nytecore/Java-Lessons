import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream
                ("JavaInputOutput/Serialization-III/src/ogrenci.bin"))) {

            Ogrenci ogrenci1 = (Ogrenci) in.readObject();
            System.out.println(ogrenci1);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Böyle bir sınıf bulunamadı.");
        }
    }
}