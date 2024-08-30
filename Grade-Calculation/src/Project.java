import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

           /*
           Kullanıcıdan Vize1 , Vize2 , Final notlarını alarak bir harf notu hesaplayalım.
           Ayrıca kullanıcının okuldaki genel ortalamasını alarak DD alma ve
           2.50 altında olma koşuluna göre bir tavsiye mesajı yazdılarım..

           Vize 1 = Toplam notun %30'una etki edecek.
           Vize 2 = Toplam notun %30'una etki edecek.
           Final  = Toplam notun %40'una etki edecek.
           */

        System.out.println("\n\t******************************************************");
        System.out.println("\t\tÜniversite Not Hesaplama Aracına Hoşgeldiniz...");
        System.out.println("\t******************************************************");


        int v1;
        int v2;
        int f;
        double hesaplanan;

        System.out.print("\nLütfen Vize 1 Notunuzu Giriniz : ");
        v1 = scanner.nextInt();
        System.out.print("Lütfen Vize 2 Notunuzu Giriniz : ");
        v2 = scanner.nextInt();
        System.out.print("Lütfen Final Notunuz Giriniz : ");
        f = scanner.nextInt();

        hesaplanan = (v1 / 100d * 30d) + (v2 / 100d * 30d) + (f / 100d * 40d);

        if (hesaplanan >= 90) {
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: AA ");
        }
        else if (hesaplanan <= 89 && hesaplanan >= 85 ){
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: BA ");
        }
        else if (hesaplanan <= 84 && hesaplanan >= 80 ){
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: BB ");
        }
        else if (hesaplanan <= 79 && hesaplanan >= 70 ){
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: CB ");
        }
        else if (hesaplanan <= 69 && hesaplanan >= 60 ){
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: CC ");
        }
        else if (hesaplanan <= 59 && hesaplanan >= 55 ){
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: DC ");
        }
        else if (hesaplanan <= 54 && hesaplanan >= 50 ){
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: DD ");
            System.out.println("Biraz Daha Çalışmalısın...");
        }
        else if (hesaplanan <= 49 && hesaplanan >= 40 ){
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: FD ");
            System.out.println("Daha Çok Çalışmalısın...");
        }
        else {
            System.out.println("\nNot Ortalamanız : " + hesaplanan + "\nHarf Notunuz: FF ");
            System.out.println("Çok Daha Fazla Çalışmalısın...");
        }

    }
}
