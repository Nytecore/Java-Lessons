import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("\nBir sayı giriniz : ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayısınız giriniz : ");
        int basamak_sayisi = scanner.nextInt();

        int gecici = sayi;
        int toplam = 0 ;

        do {
            int basamak_degeri = gecici % 10;
            gecici /= 10;
            toplam += (int) Math.pow(basamak_degeri,basamak_sayisi);

        } while (gecici > 0); {
            if (toplam == sayi){
                System.out.println("Girdiğiniz sayı bir armstrong sayısıdır." + "(" +toplam+ ")");
            } else {
                System.out.println("Girdiğiniz sayı bir armstrong sayısı değildir." + "(" +toplam+ ")");
            }
        }

    }
}

 /*
 Armstrong Sayısı Nedir?
 Bir sayının her basamağının, o sayının basamak sayısı kadarki kuvvetlerinin birbirleriyle toplanması sonucu elde
 edilen sayı, o sayının kendisine eşit ise o sayı armstrong sayısı oluyor.
 Örneğin: [1634] sayısı. (4 basamaklı bir sayıdır.)
 1 x 1 x 1 x 1 = (1) ~ 6 x 6 x 6 x 6 = (1296) ~ 3 x 3 x 3 x 3 = (81) ~ 4 x 4 x 4 x 4 = (256)
 256 + 81 + 1296 + 1 = [1634]   ------> Armstrong sayısıdır.

 Yukarıdaki örnekte öncelikle kullanıcıdan int değişkenli bir sayı istendi, buna "sayi" adı verildi. Daha Sonra
 kullanıcıdan bir de int değişkenli bir basamak sayısı istendi ve "basamak_sayisi" adı verildi. Altında, "gecici"
 ve "toplam" adlı iki int değişkenler oluşturuldu. Bizim işlemi yaptıracağımız değişken "gecici" olacak bu yüzden
 kullanıcıdan aldığımız sayıyı, gecici'ye eşitledik. (gecici = sayi) Kullanıcıdan aldığımız "sayi"nın bir kenarda
 durması gerekiyor. Aynı zamanda da en sonunda işlem toplam değer üzerinden çıktı alınması gerektiği için bir de
 toplam adlı int değişken oluşturulup onda da "0" değerini atadık. Sonrasında, do döngümüzü yarattık. Burada
 "basamak_degeri" adında int değişkenli bir döngü yarattık ve onu gecici sayımızın 10'a bölümünden kalanına eşit-
 ledik. (basamak_degeri = gecici % 10) Bu işlem bize kullanıcıdan aldığımız sayının birler basamağına ulaşmamızı
 sağladı ve değeri de tek sayı olarak "basamak_degeri"'ne atamamızı sağladı. Sonrasında da gecici sayısını tekrar
 10'a böldük ve geciciye eşitledik. Bu sayede de kullanıcıdan aldığımız sayının bir basamağını atmış olduk.
 (gecici /= 10). Daha sonra bu alınan sayıların da kuvvetini almak için Java kütüphanesinde bulunan
 "Math.pow("a sayisi yada degeri","b sayısı yada degeri")" işlem tipini aldık. Bu işlem şu işe yarar, sağda yazılan
 değer sağdaki değerin kuvveti olacak örn: Math.pow(2,4) = iki sayısının 4. kuvveti  (2 x 2 x 2 x 2). Bunu da toplam
 sayı ile toplayarak eşitlememiz gerekiyor. (toplam += Math.pow()). Bu arada Java kütüphanesinden aldığımız Math.pow()
 işlemi "double" değer döndürür. Biz burada iki değeri öğrenmiş olduk bunlardan biri, basamak değeri ve diğeri de
 basamak sayısı. Bu sayılar bizim Math.pow() ile yapacağımız kuvvet alma işleminde şu şekilde kullanılacak :
 Math.pow(basamak_degeri,basamak_sayisi). Bu sayede o basamak sayısının kuvvetini almış olduk. Sonrasında da aşağıya
 bir while döngüsü oluşturduk burda da kullanıcıdan alıp gecici'ye atadığımız değer 0'dan büyük olduğu sürece döngü
 true olarak tekrar etsin koşulu verip, koşul bittiği taktirde de aşağı if koşulu oluşturduk. Burda da kullanıcıdan
 aldığımız "sayi" ve en sonra "toplam" değer birbiri ile eşit ise bu sayı Armstrong sayısı olmuş oldu ve program bize
 sayının armstrong olduğunu belirtti. Aksi halde de (else) armstrong olmadığını belirtti.

 Program çalıştı, biz ona bir sayı ve sayının basamak sayısını verdik. Verdiğimiz sayının önce son basamağı alındı ve
 bu basamak değeri oldu. Sonrasında verilen sayıdan bir basamak atıldı. Az önce aldığımız son basamak ile başta vermiş
 olduğumuz basamak sayısı değerinin kuvvetleri hesaplandı. Bu işlem, sayımız sıfır olana kadar döngüde devam ederek
 bizi sonuca kadar götürdü. Program çalıştı.
 */
