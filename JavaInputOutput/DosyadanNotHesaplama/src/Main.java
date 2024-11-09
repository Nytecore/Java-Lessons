import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalnot) {
        String cikti = "";
        double toplam_not = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);

        if (toplam_not >= 90) {
            cikti = isim + " ---> Bu derstem AA aldı.";

        } else if (toplam_not >= 85) {
            cikti = isim + " ---> bu fersten BA aldı.";

        } else if (toplam_not >= 80) {
            cikti = isim + " ---> bu fersten BB aldı.";

        } else if (toplam_not >= 75) {
            cikti = isim + " ---> bu fersten CB aldı.";

        } else if (toplam_not >= 70) {
            cikti = isim + " ---> bu fersten CC aldı.";

        } else if (toplam_not >= 65) {
            cikti = isim + " ---> bu fersten DC aldı.";

        } else if (toplam_not >= 60) {
            cikti = isim + " ---> bu fersten DD aldı.";

        } else if (toplam_not >= 55) {
            cikti = isim + " ---> bu fersten FD aldı.";

        } else {
            cikti = isim + " ---> bu fersten FF aldı.";

        }
        return cikti;

    }
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner (new FileReader
                ("JavaInputOutput/DosyadanNotHesaplama/src/dosya.txt")) ;
                        FileWriter writer = new FileWriter
                ("JavaInputOutput/DosyadanNotHesaplama/src/Harf Notları.txt")) {

            while (scanner.hasNextLine()) {
                String ogrenciBilgileri = scanner.nextLine();
                String[] ogrenciArray = ogrenciBilgileri.split(",");

                    // 0. Index = öğrenci isimleri
                    // I. Index = Vize 1 notu
                    // II. Index = Vize 2 notu
                    // III. Index = Final Notu

                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalNot = Integer.valueOf(ogrenciArray[3]);

                String cikti = harfNotuHesapla(ogrenciArray[0], vize1, vize2, finalNot);
                writer.write(cikti + "\n");

            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: 'FileNotFoundException' ");
        } catch (IOException e) {
            System.out.println("Dosya yazılırken bir hata oluştu: 'IOException' ");

        }
    }
}