import java.util.Scanner;

public class ebob {
    public static int ebobBulma (int sayi1, int sayi2) {
        int ebob = 0;

        for (int i = 1 ; i <= sayi1 && i <= sayi2 ; i++) {
            if ((sayi1 % i == 0) && sayi2 % i == 0) {
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Birinci Sayı : ");
        int birinci_sayi = scanner.nextInt();

        System.out.print("İkinci Sayı : ");
        int ikinci_sayi = scanner.nextInt();

        System.out.println("İki Sayının Ebobu : " + ebobBulma(birinci_sayi, ikinci_sayi));
    }
}


/*
1. ebobBulma Metodu:
--> Bu metod, iki sayının EBOB'unu bulmak için tasarlanmış. Girdileri iki sayı (sayi1 ve sayi2), çıktısı
ise bu sayıların EBOB'u (ebob).
--> int ebob = 1; ifadesi ile ebob isminde bir değişken tanımlanır ve başlangıç değeri olarak 1 atanır.
Bu değişken, iki sayının EBOB'unu saklamak için kullanılacaktır.

2. for Döngüsü:
--> Döngüde i değişkeni 1'den başlayarak hem sayi1 hem de sayi2'den küçük veya onlara eşit olduğu sürece
devam eder (i <= sayi1 && i <= sayi2).
--> Bu döngü, her adımda i değişkenini bir arttırır.
--> Döngüde if bloğu ile kontrol edilir: Eğer sayi1 ve sayi2 değişkenleri i sayısına tam bölünebiliyorsa
(sayi1 % i == 0 ve sayi2 % i == 0), bu durumda ebob değişkenine i atanır.
--> Bu şekilde, döngü sona erdiğinde ebob değişkeninde iki sayının ortak bölenlerinin en büyüğü saklanmış
olur.

3. main Metodu:
--> Bu metod programın çalıştırıldığı yerdir. Kullanıcıdan iki sayı alır ve bu sayıları ebobBulma metoduna
gönderir.
--> Scanner sınıfı ile kullanıcıdan veri almak için bir araç tanımlanır. =
System.out.print("Birinci Sayı : "); ve System.out.print("İkinci Sayı : "); komutları ile kullanıcıya
sayıları girmesi söylenir.
--> Kullanıcının girdiği sayılar sırasıyla birinci_sayi ve ikinci_sayi değişkenlerine atanır.
--> ebobBulma metodu çağrılır ve hesaplanan EBOB ekrana yazdırılır.

Programın Çalışma Mantığı:
1- Program, kullanıcıdan iki sayı ister.
2- Bu iki sayının ortak bölenlerinin en büyüğünü bulmak için ebobBulma metodunu kullanır.
3- Bulunan EBOB değeri ekrana yazdırılır.
Örneğin, kullanıcı 12 ve 18 sayılarını girdiğinde, bu sayıların ortak bölenleri 1, 2, 3 ve 6'dır. Bu sayıların en büyüğü olan 6, iki sayının EBOB'u olarak ekrana yazdırılır.
*/