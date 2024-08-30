import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("i : "+ i);
        }

        Yukarıda olduğu gibi for döngüsünde i'yi 10'a kadar artırmak
        için yukarıdaki gibi bir döngü hazırlanır. Fakat While döngüsünde
        döngü içerisinde yalnızca koşul yer alır. Koşul true olduğunda
        yapmak istediğimiz döngüyü ve değişkeni döngü dışında belirtmeliyiz.
        (Kod bloğunda yaptırmak istenen ve döngüye başlamadan da değişken
        atamaları yapılabilir.)

        int i = 0;
        while (i<10){
            System.out.println("i :" + i);
            i++;
        }
        */

        /*
        int i = 10;
        while (i < 100) {
            System.out.println("i : " + i);
            i+=5;
        }

        Yukarıdaki alıştırmada while döngüsü ile bir çalışma yapıldı. Çalışmada,
        öncelikle döngü başlamadan "i" olarak bir int değişkeni (i = 10) verildi.
        ve değer atandı. Sonra döngü yaratıldı ve döngü içerisine sadece koşul
        girildi. ( i < 100 ) Koşul sağlandı ve blok içi çalışmaya başladı; i'yi 100
        olana dek 5'er 5'er artır. "i += 5"

         */

        /*
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        while ( sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Girilen değerin Faktöriyeli : " + faktoriyel);

        Yukarıda while döngüsü ile faktöriyel hesaplaması yapılmıştır. Anlatım:
        Öncelikle kullanıcıdan bir int değeri belirlenmesi için scanner açıldı.
        Bu değere "sayi" adı verildi. Sonrasında bir de "faktoriyel" adında int
        değişkeni tanımlandı. Sonrasında da while döngüsü yaratıldı ve buna göre
        koşul olarak sadece kullanıcının verdiği değer yani "sayi değişkeni"
        sıfırdan büyük olduğu sürece, koşul sağlanacak (true) ve blok çalışacak.
        Blok içerisine faktöriyel hesaplanması için işlem yapıldı. Bu işlem şu;
        ilk önce "1" değer verilen faktoriyel değişkeni kullanıcının verdiği değer
        ile çarpılacak ve faktoriyel değerine eşitlenecek. (faktoriyel *= sayi;
        Sonrasında da kullanıcı verdiği değer bir azaltılacak ve bu döngü kul-
        lanıcının verdiği değer sıfır olana kadar tekrar edecekti. Her tekrarda
        faktoriyel değişkeni değeri güncellendi ve kullanıcı değeri azaldı. Sıfıra
        gelene kadar kullanıcının verdiği değer, kendinden bir küçük değer ile
        sıfıra kadar çarpıldı ve sayının faktöriyeli bulundu.
         */


    }
}

