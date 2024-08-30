import java.util.Scanner;

public class MassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nVÜCUT KİTLE İNDEKSİ HESAPLAMA ARACINA HOŞGELDİNİZ..");
        System.out.println("Lütfen ilk önce kişisel bilgilerinizi doldurunuz.");

        System.out.print("\nLÜTFEN ADINIZI GİRİNİZ : ");
        String name = scanner.nextLine();

        System.out.print("LÜTFEN SOYADINIZI GİRİNİZ : ");
        String surname = scanner.nextLine();

        System.out.print("LÜTFEN YAŞINIZI GİRİNİZ : ");
        int age = scanner.nextInt();

        System.out.print("LÜTFEN BOYUNUZU GİRİNİZ (Örn. 1,65) : ");
        double height = scanner.nextDouble();

        System.out.print("LÜTFEN KİLONUZU GİRİNİZ : ");
        double weight = scanner.nextDouble();

        System.out.println("\n \t Teşekkürler. Vermiş olduğunuz bilgilere göre hesaplama yapılıyor...");

        double veri1 = weight / (height * height);

        System.out.println("\nAdınız : " + name +" "+ surname);
        System.out.println("Yaşınız : " + age);
        System.out.println("Boyunuz : " + height);
        System.out.println("Kilonuz : " + weight);

        System.out.println("\nVücut Kitle indeksiniz : " + veri1);

        if (veri1 <= 18.5){
            System.out.println("\nVücut kitle indeksinize göre zayıfsınız...");
        }

        else if (veri1 >= 18.5 && veri1 <= 24.9){
            System.out.println("\nVücut kitle indeksinize göre normal kilonuzdasınız...");
        }

        else if (veri1 >= 25 && veri1 <= 29.9){
            System.out.println("\nVücut kitle indeksinize göre fazla kilolusunuz...");
        }

        else if (veri1 >= 30 && veri1 <= 34.9){
            System.out.println("\nVücut kitle indeksinize göre obez 1...");
        }

        else if (veri1 >= 35 && veri1 <= 39.9){
            System.out.println("\nVücut kitle indeksinize göre obez 2...");
        }

        else if (veri1 >= 40){
            System.out.println("\nVücut kitle indeksinize göre obez 3...");
        }

    }
}
