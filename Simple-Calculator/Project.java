import java.util.Scanner;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String islemler = "\t1. Toplama İşlemi\n" +
                "\t2. Çıkarma İşlemi\n" +
                "\t3. Çarpma  İşlemi\n" +
                "\t4. Bölme   İşlemi";

        System.out.println("\n***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        System.out.print("\nYapmak istediğiniz işlemi tuşlayınız : ");

        int a = scanner.nextInt();

        if (a >= 5) {
            System.out.println("Geçersiz İşlem");
        }

        else {

            System.out.print("\nBirinci Sayıyı Giriniz: ");
            double d = scanner. nextDouble();
            System.out.print("İkinci Sayıyı Giriniz: ");
            double dd= scanner.nextDouble();

            switch (a) {
                case 1:
                    System.out.println("\nSonuç : " + (d + dd));
                    break;
                case 2:
                    System.out.println("\nSonuç : " + (d - dd));
                    break;
                case 3:
                    System.out.println("\nSonuç : " + (d * dd));
                    break;
                case 4:
                    System.out.println("\nSonuç : " + (d / dd));
                    break;
                default:
                    System.out.println("Geçersiz İşlem.");
                    break;
            }
        }

    }
}

