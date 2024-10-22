import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\t----- KUMANDA PROGRAMINA HOŞGELDİNİZ -----");

        Scanner scanner = new Scanner(System.in);

        String islemler1 = "\n-- İşlemler --" +
                "\n1: İşlemleri Göster" +
                "\n2: Kanalları Göster" +
                "\n3: Kanal Ekle" +
                "\n4: Kanal Sil" +
                "\n5: Kanal Sayısı Öğren" +
                "\n-- Çıkış için 'q' basınız --";

        String islemler2 = "\n -- GİRİŞ --" +
                "\n1. İşlemleri Göster" +
                "\n'q' Çıkış yap";

        Kumanda kumanda = new Kumanda();

        System.out.println(islemler2);

        while (true) {
            System.out.print("\nYapmak istediğiniz işlemi giriniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;

            } else if (islem.equals("1")) {

                System.out.println(islemler1);

            } else if (islem.equals("2")) {

                kanallariGoster(kumanda);

            } else if (islem.equals("3")) {

                System.out.print("Eklenecek Kanal : ");
                String kanal_ismi = scanner.nextLine();

                kumanda.kanalEkle(kanal_ismi);
                System.out.println("Kanal Eklendi : " + kanal_ismi);

            } else if (islem.equals("4")) {

                System.out.print("Silinecek kanal : ");
                String kanal_ismi = scanner.nextLine();

                kumanda.kanalSil(kanal_ismi);


            } else if (islem.equals("5")) {

                System.out.println("Kanal Sayısı : " + kumanda.kanalSayisi());

            } else {
                System.out.println("Geçersiz bir işlem yaptınız...");

            }
        }
    }

    public static void kanallariGoster (Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Hiç bir kanal bulunmuyor....");

        } else {
            for (String kanal: kumanda) {
                System.out.println("Kanal : " + kanal);

            }
        }
    }
}
