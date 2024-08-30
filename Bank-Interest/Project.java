import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediğnin
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz oranı.
        */

        /*
        int anapara, vade;

        System.out.println("\n*************************************************");
        System.out.println("\t\t\t\tFAİZ HESAPLAYICI");
        System.out.println("*************************************************");

        System.out.print("\nAnapara Miktarınızı Giriniz : ");
        anapara = scanner.nextInt();

        System.out.print("Anaparanız Kaç Yıl Vadede Kalsın : ");
        vade = scanner.nextInt();

        int faiz = anapara / 100 * 6;

        int toplam = anapara + faiz * vade;

        System.out.println("\nAnaparanıza her yıl %6 faiz gelecek ve her yıl anaparanız " + faiz + "TL artacak.\n" +
                                         vade +" Yıl sonunda anaparanız :  "+ toplam +" TL olacak.");


                                         // Yukarıdaki program bebim yaptığım programdır.
         */

        int anapara , vade;

        System.out.println("\n*************************************************");
        System.out.println("\t\t\t\tFAİZ HESAPLAYICI");
        System.out.println("*************************************************");

        System.out.print("\nAnapara Miktarınızı Giriniz : ");
        anapara = scanner.nextInt();

        System.out.print("Anaparanız Kaç Yıl Vadede Kalsın : ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizOrani = 0.06;

        for (int i = 1 ; i <= vade ; i++) {
            toplampara += toplampara * faizOrani;
            System.out.println( i + ". yılın sonunda toplam para : " + (int)toplampara);
        }
    }
}
