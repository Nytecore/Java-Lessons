public class Project {
    public static boolean asalMi (int sayi) {

        for (int i = 2 ; i < sayi ; i++) {
            if (sayi % i == 0){
                return false;
            }
        }       return true;
    }
    public static void main(String[] args) {

        for (int i = 2 ; i < 1000 ; i++) {
            if (asalMi(i)) {
                System.out.println(i);
            }
        }
    }
}



/*
Programın Ana Parçaları

asalMi Metodu:

Bu metod, bir sayının asal olup olmadığını kontrol eder.
Bir sayının asal olup olmadığını anlamak için, 2'den başlayarak o sayıdan küçük olan
tüm sayılarla bölünüp bölünmediğine bakar. Eğer sayı herhangi birine tam bölünüyorsa,
asal değildir (return false döndürür).Eğer hiçbirine tam bölünmüyorsa, asal demektir
(return true döndürür).

main Metodu:
main metodu, programın çalıştığı yerdir.
Bu kısımda, 2'den başlayarak 1000'e kadar olan tüm sayılar arasında bir döngü başlatılır.
Her sayı için asalMi metoduna gidilip o sayının asal olup olmadığı kontrol edilir.
Eğer sayı asal ise, bu sayı ekrana yazdırılır.
Kodun Çalışma Mantığı

for Döngüsü (main metodu):
2'den başlayarak 1000'e kadar olan sayıları sırayla alır.
Her bir sayı için asalMi metodunu çağırır ve sayının asal olup olmadığını kontrol eder.
Eğer sayı asalsa, System.out.println(i); ile sayı ekrana yazdırılır.

asalMi Metodu:
Örneğin, i = 29 için:
2'den başlayarak 28'e kadar tüm sayılarla 29'u böler.
Eğer 29, 2, 3, 4, ..., 28'e tam bölünmezse, return true döner, yani 29 asal sayıdır.
Eğer tam bölünseydi, return false dönerdi ve sayı asal olmazdı.

Özet:
Bu program, her bir sayıyı 2'den başlayarak kendisinden bir eksik sayıya kadar olan tüm sayılarla bölüp,
asal olup olmadığını kontrol eder. Eğer bir sayı sadece 1 ve kendisiyle tam bölünebiliyorsa, asal sayı
olduğu tespit edilir ve ekrana yazdırılır. Bu şekilde, 1'den 1000'e kadar olan asal sayılar bulunur ve
listelenir.
*/