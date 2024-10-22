import java.util.PriorityQueue;
import java.util.Queue;

    // (5) Aşağıda kendi yarattığımız objeyi Priority Queue'ya
        // (5) uygulamak için bir class oluşturalım..
class Player implements Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }       // Constructor

        @Override
        public int compareTo(Player player) {
            if (this.id < player.id) {
                return -1;

            } else if (this.id > player.id) {
                return 1;

            }
            return 0;
        }
        /* (6) Yukarıdaki işlemde yine sıralama işlemini nasıl yapılacağı tanımlandı.
        Buna göre buradaki id'nin değeri gönderilen id'nin değerinden küçük ise -
        değer dönecek. buradaki id, gönderilen değerin id'sinden büyükse + değer
        dönecek. Eşitse de 0 değer dönecektir. Yani küçükten büyüğe sıralama şekli
        yapılacaktır. Zaten priority queue'da da integer durumunda küçükten büyüğe
        öncelik sırası vardı.
         */

        @Override
        public String toString() {
            return "Player {" +
                    "isim = '" + isim + '\'' +
                    " , id = " + id +
                    '}';
        }
    }

public class Main {
    public static void main(String[] args) {
        /*

        -----   Priority Interface ve Queue sınıfı dersi   -----

        --> Normal queue mantığı gibi çalışmazlar. Elemanlar öncelik sırasına göre yüksek öncelik
        kazanıp kuyrukta önlere geçerler. (Hastanenin acil servisleri gibi) Önceliği yüksek olan
        değer, kuyruktan daha önce çıkar. Bu öncelik nasıl belirlenir :

        --> Integerlarda: En küçük sayı en yüksek önceliğe, en yüksek sayı ise en küçük önceliğe
        sahip olur. Küçükten byüğe gibi de diyebiliriz...

        --> Stringlerde: Alfabetik olarak diyebiliriz. Alfabede ilk gelen harfe göre yazılan String
        en yüskek önceliğe sahip olur. Sonra gelen harf ile başlayan ise en düşük önceliğe sahiptir.

        -- METODLAR --

        .add() veya .offer() ----> Kuyruğa eleman eklerler. (Normal queue metodundan farklı çalışmaz)
        .clear() metodu      ----> Kuyruğu temizler.
        contains(Object o)   ----> "o" objesi kuyruk içindeyse true değilse false döner.
        .peek() metodu       ----> Kuyruğun başındaki elemanı döner. (Eleman yoksa null döner)
        .poll() metodu       ----> Kuyruğun başındaki elemanı çıkarır ve o elemanın değerini döner. (Eleman yoksa null döner)
        .size() metodu       ----> Kuyruğun içindeki eleman sayısını döner.         */

        Queue<Integer> intQueue = new PriorityQueue<Integer>();
        intQueue.offer(5);
        intQueue.offer(7);
        intQueue.offer(4);
        intQueue.offer(2);
        intQueue.offer(1);
        intQueue.offer(8);
        intQueue.offer(3);
        intQueue.offer(9);
        intQueue.offer(6);



            // (1) Yukarıda PriorityQueue sınıfından bir kuyruk oluşturuldu ve elementler eklendi.
                // (1) Integer üzerinden ekleme yapıldığı için öncelik sırası ona göre olacaktır.

        System.out.println("\n******************************************************");
        System.out.println("--> Integer önceliğine göre : (For ile yapıldı yanlış olabilir)");
        for (Integer i  :intQueue) {
            System.out.println(i);
        }
        System.out.println("******************************************************");
            // (2) Eklenen elementler yukarıdakli kod ile bastırıldı..

        /*  NOT: Bu queue'yu forEach döngüsü ile bastırırsak, bu değerleri öncelik sırasına göre
        göremeyiz. Çünkü priority queue bu değerleri sırasıyla göstermek için tanımlanmamış bir
        veri yapısıdır. Direkt sırasıyla bastıramayız, karışık bir yapıda gelebilir. ANCAK biz
        priority queue'nun en yüksek öncelikli olanın kuyruğun en önüne geçtiğini bilmemiz yeterlidir.
        Bu durumu for döngüsü ile göremeyiz sadece. Görürsek de şansa görmüş oluruz. Bunun için
        yani en yüksek önceliğe göre sıralanışını görmek için while döngüsünü kullanabiliriz.  */

        System.out.println("\n******************************************************");
        System.out.println("Kuyruğun en başındaki eleman : " + intQueue.peek());
            // (3) Yukarıdaki metod ile kuyruğun en başındaki elemanı almış oluruz.
        System.out.println("******************************************************");

        System.out.println("\n******************************************************");
        System.out.println("Kuyruğun içinde '3' elemanı var mı? : " + intQueue.contains(3));
        System.out.println("Kuyruğun içinde '15' elemanı var mı? : " + intQueue.contains(15));
            // (3) Yukarıdaki metod ile kuyruğun içinde olan değerleri sorgulamış oluruz..
        System.out.println("******************************************************");


            // (4) Aşağıdaki işlem while döngüsü ile yapıldı ve queue önceliğine
                // (4) göre eleman çıkarma işlemi yapılacaktır. Doğru işlem bu sayede görülür.
        System.out.println("\n******************************************************");
        System.out.println("Aşağıdaki işlem while döngüsü ile yapıldı ve queue" +
                "\nönceliğine göre eleman çıkarma işlemi yapılacaktır." +
                "\nDoğru işlem bu sayede görülür:");
        while (!intQueue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor : " + intQueue.poll());
        }
        System.out.println("******************************************************");


        /* ÖNEMLİ NOT : BİZ KENDİ OLUŞTURDUĞUMUZ CLASSTAN ÖNCELİK SIRASINA GÖRE SIRALAMA
        YAPMAK İSTERSEK DE DAHA ÖNCE KENDİ YARATTIĞIMIZ OBJELERİ SIRALAMAK İÇİN YAPTIĞIMIZ
        METODUN AYNISINI YAPMAMIZ GEREKİR. YANİ ÖNCE COMPARE YAPMAMIZ GEREKİR VE BUNUN İÇİN
        COMPARABLE INTERFACE'İ IMPLEMENTE ETMEMİZ GEREKECEKTİR. BU SAYEDE PRIORITY QUEUE'YA
        BİZ KENDİ DEĞERLERİMİZİ EKLEMİŞ OLURUZ. BUNU NASIL YAPARIZ ONA BİR BAKALIM :     */

        // Bunun için main class üzerinde bir class oluşturacağız. Yaptıktan sonra obje oluşturacağız...

        Queue<Player> playerQueue = new PriorityQueue<Player>();

        playerQueue.offer(new Player("Bahar" , 5));
        playerQueue.offer(new Player("Eylül" , 7));
        playerQueue.offer(new Player("Bora" , 4));
        playerQueue.offer(new Player("Aydın" , 2));
        playerQueue.offer(new Player("Berkan" , 1));
        playerQueue.offer(new Player("Hido" , 8));
        playerQueue.offer(new Player("Kaan" , 3));
        playerQueue.offer(new Player("Mesut" , 9));
        playerQueue.offer(new Player("Bilal" , 6));

        System.out.println("\n******************************************************");
        System.out.println("Kendi oluşturduğumuz objeye göre öncelik sıralaması yapalım :");
        while (!playerQueue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor : " + playerQueue.poll());
            /* ÖNEMLİ NOT: YUKARIDAKİ "playerQueue.poll()" BİZE PLAYER CİNSİNDEN
            BİR REFERANS DÖNECEK VE BİZ BUNU "System.out.println" İÇERİSİNDE
            BASTIRMAK İSTERSEK MUTLAKA VE MUTLAKA BİR TANE ".toString()" METODUNU
            PLAYER CLASSI İÇERİSİNDE OVERRIDE ETMEM GEREKİYOR. YAZDIRILACAK OLAN
            KODUMUZ ŞU ŞEKİLDE ÇALIŞACAKTIR. ÖNCELİK İÇİN JAVA ID'YE BAKACAK.
            ID'YE GÖRE KÜÇÜKTEN BÜYÜĞE SIRALAMA YAPACAK VE BASITRMA İŞLEMİNİ
            GERÇEKLEŞTİRECEKTİR. TAM TERSİNE YANİ BÜYÜKTEN KÜÇÜĞE BASTIRMA YAPMAK
            İSTERSEK DE YUKARIDA PLAYER SINIFI İÇERİSİNDEKİ IMPLEMENTE EDİLEN
            KODDA DÖNEN DEĞERLERİ TAM TERSİNE ÇEVİRMEMİZ GEREKECEKTİR.
             */
        }
        System.out.println("******************************************************");



    }
}
