import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışalım.

        İşlemler
        1. İşlem: Bakiye Öğrenme
        2. İşlem: Para Çekme
        3. İşlem: Para Yatırma
        Çıkış : q

         */
        System.out.println("\n*********************************");
        System.out.println("    Bankamatiğe Hoşgeldiniz");
        System.out.println("*********************************");
        System.out.println("\n1. Bakiye Öğrenme" +
                "\n2. Para Çekme" +
                "\n3. Para Yatırma" +
                "\nq = Çıkış");

        System.out.print("\nYapmak İstediğiniz İşlemi Tuşlayınız: ");
        int bakiye = 15000;

        while (true) {

            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("ATM'den çıkış yapıldı. İyi günler dileriz...");
                break;

            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + bakiye + " TL'dir.");
                System.out.println("Yapmak istediğiniz işlemi tuşlayınız : ");

            } else if (islem.equals("2")) {
                System.out.print("Çekim yapmak istediğniniz tutarı giriniz : ");
                int cekim = scanner.nextInt();

                if (cekim > bakiye) {
                    System.out.println("Yetersiz Bakiye. Bakiyeniz : " + bakiye);
                } else {
                    System.out.println("\nİşlem tamamlandı. Güncel bakiyeniz : " + (bakiye -= cekim) + " TL'dir.");
                    System.out.println("Yapmak istediğiniz işlemi tuşlayınız : ");
                    scanner.nextLine();
                }
            } else if (islem.equals("3")) {
                System.out.print("Yatırmak istediğniniz tutarı giriniz : ");
                int yatirim = scanner.nextInt();
                System.out.println("\nİşlem tamamlandı. Güncel bakiyeniz : " + (bakiye += yatirim) + " TL'dir.");
                System.out.println("Yapmak istediğiniz işlemi tuşlayınız : ");
                scanner.nextLine();

            } else {
                System.out.println("Hatalı tuşlama yaptınız. Lütfen tekrar tuşlama yapınız : ");

            }
        }
    }
}






