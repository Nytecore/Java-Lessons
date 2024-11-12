import java.io.*;

public class SaveGame {

    public static void oyunKaydet(Card[][] kartlar) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream
                ("JavaInputOutput/SaveMemoryGame/src/kayit.bin"))){



            System.out.println("Oyun kaydediliyor..");
            out.writeObject(kartlar);



        } catch (IOException e) {
            System.out.println("IOException oluştu.");
        }
    }

    public static Card[][] kayittanAl() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream
                ("JavaInputOutput/SaveMemoryGame/src/kayit.bin"))) {

            Card[][] cikti = (Card[][]) in.readObject();
            return cikti;




        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı..");
        } catch (IOException e) {
            System.out.println("IOException oluştu..");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı..");
        }
        return null;
    }
}
