import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Beyblade Programına Hoşgeldiniz!");
        System.out.println("Çıkış işin 'q' ya basınız.");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nHangi beyblade'i üretmek istiyorsunuz ? : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Çıkış yapılıyor...");
                break;

            }
            else {

                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (islem == null) {
                    System.out.println("Hatalı giriş yaptınız...");
                }
                else {

                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();

                }
            }
        }
    }
}
