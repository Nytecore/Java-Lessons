import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);




        /*

        // BREAK


        System.out.print("Bir değer girin : ");

        while (true) {
            int islem = scanner.nextInt();
            if (islem < 0 ) {
                System.out.println("Girilen değer yanlış verildi: " + islem +"\nİşlem sonlandırılıyor....");
                break;
            }
            System.out.println("İşlem : " + islem);
        }

         */

        // CONTUNIE

        for (int i = 0; i < 10; i++) {
            if ( i == 3 || i == 5) {
                continue;
            }
            System.out.println("i : " + i);
        }

        /* yukarıda olduğu gibi for döngüsü içerisinde i değişkeni oluşturulur.
        Değişkene değer atanır, koşul girilir, komut verilir. Sonrasında altına
        bir de if koşulu açılır ve burada eğer değişken değeri belirtilen durum-
        larda "True" olur ise aşağıdaki kodu görme ve döngüye tekrar başla dedik.
        (Continue) o değerler true olmadığı taktirde döngü verilen işlem tamamlanana
        kadar çalışmaya devam eder ve sonrasında durur.
         */

        int i = 0;

        while (i < 10) {
            if (i == 3 || i == 5) {
                i++;
                continue;
            }
            System.out.println("i : " + i);
            i++;
        }

        /*
        while döngüsü içerisinde eğer contunue kullanılırsa bu tehlikelidir. Çünkü
        bazı durumlarda bazı işlemleri yapmaz isek, sonsuz döngüye yol açabilir.
        Yukarıdaki örnekte bir while döngüsü çalıştırdık. Bir değişken oluşturup
        değer verdik, (int i = 0) döngüyü açtık ve i, 10 sayısından küçük
        ise (i < 10) koşulunu oluşturup, i'yi arttır (i++) komutunu verdik. Aslında
        0'dan 10a kadar say işlemi... Fakat döngü içerisinde ayrı bir koşul daha
        kullanarak koşulda da değişken 3 olursa (i == 3) or (|| ---> 1 true all true)
        ya da değişken 5 olursa (i == 5) koşulunu verdik ve döngüyü tekrar başa sar
        (continue) komutunu verdik fakat, verdiğimiz komut, değişkeni artır (i++)
        komutundan önce olduğundan o komut görülmeden program sürekli olarak aynı
        yerde çalışıp kalacak ve sonsuz döngüye girecektir. Bu yüzden biz, (break)
        komutunu verdiğimiz satırdan önceki satıra da değişkeni bir artır (i++)
        komutunu verirsek, değişken artırıla artırıla gidileceğinden, girilen koşul
        görülecek fakat tekrar başa sarıldığında değişken artırılacağı için döngü loopa
        girmeyecek, işlem bitene kadar program sağlıklı çalışacak ve sonra duracaktır.
         */



    }
}
