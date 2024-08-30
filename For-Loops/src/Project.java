import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Aşağıda "int i;" şeklinde bir değişken oluşturduk. Sonrasonda
        for döngüsü içerisinde "i" değişkenine "0" değerini verdik.
        Sonrasında da koşul belirttik yani "i, 5'den küçük ise" dedik.
        Sonrasında da i'den yapmasını istediğimiz komutu verdik ve i'nin
        artırılmasını istedik. Sonrasında da i'nin çıktısını aldık.

        int i;
        for ( i=0; i < 5; i++){
            System.out.println("i : " + i);
        }
        */


        /*
        Aşağıda olduğu gibi for döngüsü içerisinde de değişken ataması
        yapılabilir. (Sadece Java & C++) Burada da for döngüsü içerisinde
        i değişkeni oluşturuldu, değer verildi ve sıfırdan büyük ve eşit ise
        koşulu oluşturuldu. i = 10 olduğu için koşul sağlandı. (True) ve
        verdiğimiz komuta göre i, sıfıra kadar azaltıldı. (i--)

        for (int i = 10; i >= 0; i--){
            System.out.println("i: " + i);
        }
        */

        /*
        Aşağıda olduğu gibi değişken ve değişkenin ataması döngü dışında
        da verilebilir. Fakat döngü içerisinde (for (*burada*)) değişken
        ataması yapılmış gibi başlarken yine de ";" ile başlanılır ve diğer
        ifadeler (koşul ve komut) verilir. Koşul sağlanırsa, bloktaki komut
        çalıştırılır, ve çalışır.

        int i = 0;
        for (; i < 5; i++){
            System.out.println("Java Öğreniyorum...");
        }
        */

        /*
        Aşağıda olduğu gibi döngü dışarısında iki adet değişken ve atamaları
        yapılabilir. (a = 0 ve b = 10) Sonrasında döngü içerisine iki değişken de
        alınır (; )ve aşağıdaki gibi 2 adet koşul verilebilir. ( a<10 && b>0 )
        Burada && (and) operatörü olduğundan döngüdeki tüm koşullar true olmalı ki
        döngü çalışsın, iki koşuldan da true değeri alınır ve komut verilir (komutlar
        iki adet olduğundan komutlar arası virgül ile ayrılır) : a'yı arttır ve b'yi
        azalt. Sonrasında çıktı alınır. Koşullar sağlanır, çalışır...

        int a = 0;
        int b = 10;
        for (; a < 10 && b > 0; a++,b--) {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
        */

        /* Aşağıda olduğu gibi, döngü içerisinde çarpım da yapılabilir. Döngü içinde
        i'ye değer verdik, (i=2) sonrasında bir koşul sunduk, (i, 100'den küçük ise)
        koşulumuz "True" oldu ve program kodumuzu okudu. (i, 100'e gelene kadar; i'yi 2
        ile çarparak i'ye eşitle) komutumuz okundu ve koşul sağlandı, blok okundu, kod
        çalıştırıldı.

        !!!! Bu arada "*=" bunun anlamı çarp ve eşitle. Örneğin "i *= 2" ---> i'yi 2 ile
        çarp ve i'ye eşitle.

        for (int i = 2; i < 100; i *= 2){
            System.out.println("i: " + i);
        }
        */

        System.out.println("Bir Sayı Giriniz : ");

        int faktoriyel = 1;

        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++){
            faktoriyel *= i;

            System.out.println( i + " Faktöriyel : " + faktoriyel);

        }



    }
}
