import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Mattematik.Factorial factorial = new Mattematik().new Factorial();
        Mattematik.Asal asal = new Mattematik().new Asal();
        Mattematik.Alan alan = new Mattematik().new Alan();
        Mattematik.Alan.DaireAlan daireAlan = new Mattematik().new Alan().new DaireAlan();

        /*
        Burada örneğin Matematik classının içindeki Faktoriyele erişmek istersek,
        direkt olarak "Factorial factorial = new Factorial;" şeklinde erişebilmemiz
        mümkün değildir. Bunun için öncelikle Matematiğe erişeceğiz ve sonra Factorial'e
        erişeceğiz. Şöyle Yaparız Matematik("Matematik" classından).Factorial("Factorial" Classına)
        factorial ("factorial" referansında) = new Matematik ("Matematik" classından)
        .new Factorial ("Factorial" Classına) şeklinde erişim belirleyici yapmamız gerekir.
         */

        Scanner scanner = new Scanner (System.in);

        System.out.print("Asal hesaplama için bir sayı giriniz : ");
        int sayi = scanner.nextInt();


        if (asal.asalMi(sayi)) {    // Burada InnerClass içindeki Asal Classına "asal" referansı ile erişip
            System.out.println("Girilen sayı asaldır.");            // "asalMi" metodunu çağırıyoruz.
        } else {
            System.out.println("Girilen sayı asal değildir.");
        }

        factorial.faktoriyel();     // Burada InnerClass içindeki Factorial classına "factorial" referansı ile eriştik.

        daireAlan.daire_alan(6);
                // Burada da InnerClass içindeki Alan Classı içindeki DaireAlan classına
                        // "daireAlan" referansı ile erişiyoruz.

    }
}