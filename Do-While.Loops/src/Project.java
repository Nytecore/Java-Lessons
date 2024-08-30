import java.util.Scanner;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        /*
        = Çalışma Prensibi =

        do {
               // Koşul doğru olduğu sürece
               // While'dan farkı en az bir kere çalışmasının garanti olmasıdır.

         }while (koşul);

         */


        int i = 0;

        do {
            System.out.println("i : " + i);
            i++;

        } while ( i < 5);
        /*
        Yukarıda olduğu gibi öncelikle "i" adında bir int değişkeni tanımlandı.
        Değişkene 0 değeri verildi. Sonrasında döngü yaratıldı. Bu döngüde do
        içerisinde "i" değişkeni yazdırıldı ve i, 1 birim artırıldı. Sonrasında
        while döngüsüne gidildi ve program koşula baktı, koşul sağlandığı taktirde
        döngü tekrar etmeye devam etti. Eğer while döngüsü içindeki koşul
        sağlanmamış olsaydı, do döngüsündeki blok yine de yazdırılacak ve uygulanacak
        fakat while koşulu sağlanmadığı için tekrar çalışmayacaktı ama sonuç olarak bir
        kez bile olsa do döngüsü çalışacak ve yazdırılacaktı.
         */


        System.out.print("\nGirilen rakamların birbirleriyle toplamını bulmak için bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        int toplamsayi = 0;

        do {
            toplamsayi += sayi % 10;
            sayi /= 10;
            System.out.print(" Sayımız : " + sayi % 10);

        } while (sayi > 0);
        System.out.println(" Girilen sayıdaki rakamların toplamı : " + toplamsayi);

        /*
        Bir sayının rakamlarının toplamı yukarıda olduğu gibi yapılabilir. Yani; ilk önce
        kullanıcıdan bir değer isteriz. Sonraısnda bir de 0 olarak bir deşken değeri tanım-
        larız. Sonrasında döngüyü yaratırız. Do içerisinde öncelikle toplamsayı değişkeni ve
        kullanıcıdan aldığımız değerin 10'a bölümünden kalan değer toplanır, sayı toplamsayı
        olarak adlandırdığımız değişkene atanır. Bir sayının 10'a bölümünden kalan her zaman
        o sayının birler basamağını verir. Sonrasında da tekrar kullanıcıdan alığımız sayıyı
        10'a böleriz ve sayıdan aslında bir basamak atmış oluruz ve bu sayıyı da kullanıcıdan
        aldığımız "sayi" olarak adlandırdığımız değişkene eşitleriz. Sonrasında, while döngüsü
        okunur ve döngüye girdiğimiz koşul true değer verir, (Kullanıcıdan alınan sayı (sayi)
        0'dan küçük ise). True olan koşul, döngüyu en baştan tekrar çalıştıracaktır ve bu
        kullanıcının verdiği değer sıfır olana kadar devam edecek, sayılar tek tek toplanacaktır.
        Koşul durduğunda while döngüsü içerisindeki blok çalışacak ve bize sayıların toplamını
        yazdıracaktır.
         */


    }
}
