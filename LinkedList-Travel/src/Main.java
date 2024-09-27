import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

            // (3) İşlemlerin bastırılmasını sağlayan metod oluşturuldu.
    public static void islemkleri_bastir () {

        System.out.println("\n0 - İşlemleri Görüntüle");
        System.out.println("1 - Bir Sonraki Şehre Git");
        System.out.println("2 - Bir Önceki Şehre Git");
        System.out.println("3 - Uygulamadan Çık");

    }

            // (4) İleri - geri yapabileceğimiz ve asıl işlerimleri yapacağımız alanı oluşturlım.
    public static void sehirleri_turla (LinkedList<String> sehirler) {

            // (5) İleri ve geri gelebileceğimiz bir ListIterator oluşturalım:
        ListIterator<String> iterator = sehirler.listIterator();

            // (6) Öncelikle ileride kullanıcıdan int veri tipinde değer alabileceğimiz bir referans oluşturalım.
        int islem;

            // (7) Yukarıda metodda okuşturulan, işlemleri bastırma metodunu çağıralım.
        islemkleri_bastir();

        Scanner scanner = new Scanner (System.in);

            // (8) iterator içerisinde bi değer yok ise ;
        if (!iterator.hasNext()) {
            System.out.println("Herhangi bir şehir bulunmuyor...");
        }

            // (9) programdan çıkmak için gerekli olan boolean komutu oluşturuyoruz.
        boolean cikis = false;
            // (10) ileri - geri gelme durumunda aynı değer verilmesi durumunu ortadan
            // kaldırmak için bir boolean oluşturuyoruz
        boolean ileri = true;

            // (11) İşlemleri başlatmak için bir döngü oluşturalım;
        while (!cikis) {
            System.out.print("Bir işlem seçiniz : ");
            islem = scanner.nextInt();

                // (12) Kullanıcıdan alınan değerler ( 1 - 2 - 3 ) için switch oluşturalım.
            switch (islem) {
                case 0:
                    islemkleri_bastir();
                    break;

                case 1:

                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Gidilen şehir : " + iterator.next());

                    } else {
                        System.out.println("Gidilecek Şehir Kalmadı...");
                        ileri = true;
                    }
                    break;

                case 2:
                        /*      (13)
                        Aşağıda "ileri" koşulu ile geri gelmesini istediğimiz iterator, öncesinde
                        ileri götürülmüş mü diye kontrol yaptırtıyoruz: Yani burada "2" ye basarak
                        önceki şehre gideceğiz fakat önceki şehre gitme yaptırtmadan önce, kullanıcı
                        sonraki şehre gönderme yapmış mı (iterator.next()) bu kontrol ediliyor. Çünkü
                        ileri komutumdan sonra geri komutu çalıştırıldığında, ekrana mevcut olan değer
                        tekrar yazdırılıyor, amaç bunun önüne geçmektir. Yani detaylı açıklamak gerek-
                        irse; 1'e basıp ankaraya gidiyoruz, tekrar 1e basıp izmire gidiyoruz. İşte
                        bu durumda arkaplanda iterator (LinkedList) değeri aslında İzmir'de falat
                        gösterdiği yer yani referans'ı biz görmüyoruz ama İstanbulu göstermektedir.
                        Biz "2" ya basarak geri dediğimizde izmirden ankaraya dönmek istiyor olacağız
                        fakat referans istanbulda olduğundan bizim iterator.previous() komutumuz
                        bizi tekrar izmire götürecek yani geri gitmek istedğimizde İzmir > İzmir >
                        Ankara gibi bir değer görmüş olacağız. İşte oradaki 2 izmir değeri geri dönüşü
                        işllemini ortadan kaldırmak için burada if (ileri) altında bir sorgulama
                        yaptırıyoruz. Bu saue
                         */
                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Gidilen Şehir : " + iterator.previous());

                    } else {
                        System.out.println("Başlangıç Şehrindesiniz...");
                    }
                    break;

                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkış yapılıyor...");
                    break;

            }
        }
    }

    public static void main(String[] args) {


                // (1) Linkedlist oluşturuldu.
        LinkedList<String> sehirler = new LinkedList<String>();


                // (2) Linkedlist'e değerler eklendi.
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("İstanbul");

        sehirleri_turla(sehirler);

    }
}