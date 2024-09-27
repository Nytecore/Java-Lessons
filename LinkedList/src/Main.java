import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void ozellikleri_bastir (LinkedList<String> yeni_ozellikler) {

        /*
        System.out.println("\n  --- Öncelikle özellikleri bastırma işlemi yapacağız ---\n");

        for ( String s: yeni_ozellikler) {
            System.out.println(s);

                // iterator oluşturalım :
            ListIterator <String> iterator = yeni_ozellikler.listIterator();
                // "iterator" referansında "<String>" tipinde yeni.ozellikler'i gösteren bir iterator oluşturduk.

        }

         */

        ListIterator <String> iterator = yeni_ozellikler.listIterator();
                // "yeniAraba_ozellikleri" LinkedList'ine bağlı bir iterator oluşturduk. Metodu ona bağladık.


        /*
                         -----------------    ListIterator'ın Javadaki Metodları    -----------------

                    ---> .hasNext()         = listenin belirlenen elementinden sonra bir element varsa true döner.
                    ---> .hasPrevious()     = listenin belirlenen elementinden önce bir element varsa true döner.
                    ---> .next()            = Listedeki bir sontaki objenin referansına geçer.
                    ---> .previous()        = Listedeli bir önceki objenin referansına geçer.
                    ---> .add()             = Listeye spesifik bir element ekler.
                    ---> .remove()          = Listeden spesifik bir elementi çıkarır, siler.
         */

        // System.out.println("\n   ----- Buradan sonra ListIterator ile bastıracağız -----\n");

        System.out.println(" ");            // Boş bir satır.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

    /*
    LinkedList'ler yapı itibarı ile ArrayList'lere benzerler. Normalde bir ArrayList oluştururken
    sıralı olarak 4 indeksi olan bir arraylist oluşturulur ve bu arraylistin 2. indeksine bir array
    eklemek istediğimizde bu arraylist içerisinde bellekte gösterilen yere bir yer daha eklenir ve
    2. indeksten sonraki indeksler bir sonraki indekslere kaydırma yapılarak tek tek sonraki indeks-
    lere taşınır ya da örneğin 4 indeksli bir arrayde 2. indeksi sildiğimizde 3 ve 4. indeksteki
    değer bir önceki indekse geçer ve yine kaydırma yapılmış olur. Bu kaydırma olayı çok maliyetli
    ve sıkıntılı bir durumdur. Bu şekilde olduğunda örneğin 200 tane indeksi olan bir projenin bir
    indeksinin silinmesi demek, sonrası indekslerinin değerlerinin bir aşağı kayması ve kaydırma
    dolayısıyla bütün projedeki indeks alınan değerlerin değiştirilmesi gerekliliğini doğurur. Bu da
    hem zamandan hem de maliyetten büyük bir sıkıntı yaşattırır. İşte LinkedList'ler tamda bu durumda
    bizim buradaki sorunumuzu ortadan kaldırarak bizim oluşturduğumuz değerleri arka planda aynı obje
    içerisinde değil de farklı objelere referans olarak atama yaparlar ve birbirlerine tek tek bağlanır
    ve birbirlerine referans gösteren objeler haline gelirler. Bu sayede örneğin 200 indeksi olan bir
    projenin 40. indeksine başka bir değer eklemek istediğimizde sadece 39 ve 40. indeksin referansları
    için değişiklik yapmamız gerekir. Geri kalan tüm indeksler sabit bir şekilde kalırlar. Bunların
    arasındaki farklılık şu sebepten dolayıdır : ArrayList oluşumunda değerler bellekte aynı yeri gös-
    terirler. Aynı yerde olduğundan, yeni eklenen bir değer sonrası değerlerin kaymasına ya da silinen
    bir değer kendinden sonraki değerlerin kaymasına yol açarken, LinkedList içerisindeki değerler,
    bellekte farklı yerleri gösteren farklı objelerin referansları olarak görünürler. Bu yüzden
    birbirlerini takip eden referanslar değişmezken, birbirlerini takip eden değerler değişebileceği
    için, LinkedList kullanımı çok daha kolay ve çok daha az maliyetli olacaktır. Bu anlatılanlara
    aşağıda örnekler verelim :
     */

    public static void sirali_ekle (LinkedList <String> gidilecek_yerler, String yeni) {

            /* Biz burada LinkedList üzerinde gezineceğiz ve eğer LinkedList'in
               üzerinde bulunduğumuz eleman yukarıda yazılan "String yeni" içinde
               'yeni' referansından büyük ise biz sonradan girilen değeri önceye
               alacağız, yani sıralı bir şekilde eklemeye çalışacağız.
             */

        ListIterator <String> iterator = gidilecek_yerler.listIterator();
            // (1) Buraya yine bir iterator oluşturuldu.

            // (2) Burada bir döngü başlatıldı. Bu döngü şunu söylüyor :
                // (3) iterator'den sonra bir değer varsa ("gidilecek_yerler" bir referans gösteriyorsa)

        while (iterator.hasNext()) {

                // (5) içeri değer girdikten sonra sonraki girilen değer, içerdeki değer ile karşılaştırılacak.
                    // (Not) Sonraki girilen değer = .next()
                        // (Not) Karşılaştırma metodu = .compareTo()
                            // (Not) Karşılaştırmanın sonraki girilen değer üzerinden yapılması = "yeni"
                                // (Not) iterator = gidilecek_yerler


            int karsilastir = iterator.next().compareTo(yeni);
                // Yukarıdaki ".compareTo()" fonksiyonu iterator.next(yani iteratorden sonraki değer ile)
                    // "(yeni)" değeri olarak girilen değerde, yeni girilen değeri alarak
                        // Bu iki değeri karşılaştırıyor. Karşılaştırma alfabetik olarak yapılıyor.
                            // Yazılan koddaki "if" durumuna göre de belirlenen durum sağlandığında
                                // "iterator.previous()" metodu ile iterator bir önceye alınıyor.
                                    // yeni yazılan değer ise iterator'un olduğu yere koşul sağlanırsa giriyor.


            /*  (6)
            iterator'umuzun gösterdiği değer ile bizim gönderdiğimiz değer kıyaslanır.
            Eğer değerler eşit ise değerimiz = 0 çıkar, yukarıdaki "karsilastir = 0" olur.
            Eğer yeni girdiğimiz değer, iterator'un gösterdiği değerden daha büyük ise "karsilastir = -1" olur.
            Eğer yeni girilen değer, iterator'un gösterdiği değerden daha küçük ise de "karsilastir = > 0" olur.
             */

            if (karsilastir == 0) {
                // iki değer eşitliği durumu:
                System.out.println("Listenizde bu eleman zaten var.");
                return;
                
            } else if (karsilastir < 0) {

                // Yeni değer iterator.next()'den daha büyük.
            } else if (karsilastir > 0) {

                // Yeni değer, iterator'un gösterdiği değerden küçük ise:
                    // Bu durumda iterator'u bir geri almamız gerekiyor.
                        // Yani bu değerden önceye eklememiz gerekiyor.
                            // Bunun için şu metod ".previous()" kullanılır ve aşağıdaki işlem kullanılır:

                iterator.previous();
                    // iterator bir geri gelecek ve yeni değer iteratorun çıktığı yere eklenecek.
                iterator.add(yeni);

                /*
                Java burada arkaplanda çok kasıntı işlemler yapar. Fakat biz
                bu işleri görmeyiz. Java arkaplanda o işleri halleder ve bizi
                istediğimiz sonuca gönderir.
                 */

                return; // Metod sonlandırıldı. Main metodda bunu kullanalım..
            }

        }
            // (4) Değer yoksa döngü dışına çıkılacak, alttakai kod ile girilen değer listeye eklenecek.
        iterator.add(yeni);
    }
    public static void main(String[] args) {

        /*
        ArrayList <String> araba_ozellikleri = new ArrayList<String>();

        araba_ozellikleri.add("Kırmızı");                   // 0. index
        araba_ozellikleri.add("1.6 TDI Motor");             // 1. index
        araba_ozellikleri.add("Masajlı Koltuklar");         // 2. index
        araba_ozellikleri.add("Elektronik Klimalı");        // 3. index
        araba_ozellikleri.add("4 Kapılı");                  // 4. index
        araba_ozellikleri.add("Cam Tavanlı");               // 5. index

        // Yukarıda 5 indeki olan bir arraylist oluşturduk.
            // Bu ArrayList içerisine 3. indekse farklı bir özellik eklemek istiyoruz.

        araba_ozellikleri.add(3, "Sunroof");


        işte bu şekilde bir işlem yapıldığında burda yukarıda anlatılan olay olur. 3. indexin olduğu yere
        "Sunroof" değeri eklenir fakat bellekte yeni bir yer açılır, 3 ve sonraki tüm değerler 4-5-6-...
        gibi bir sonraki indekse taşınır. İşte bu işlem sıkıntılıdır bunun yerine LinkedList kullanılır :


        LinkedList <String> yeniAraba_ozellikleri = new LinkedList<String>();
                // Oluşumu, ArrayList oluşumunun aynısıdır.

        yeniAraba_ozellikleri.add("Siyah");                       // 0. index
        yeniAraba_ozellikleri.add("2.0 FSI Motor");               // 1. index
        yeniAraba_ozellikleri.add("Masajlı Koltuklar");           // 2. index


        yeniAraba_ozellikleri.add("Manuel Klima");                // 5. index
        yeniAraba_ozellikleri.add("5 Kapılı");                    // 6. index
        yeniAraba_ozellikleri.add("Açılır Cam Tavanlı");          // 7. index

                // 5 indeksi olan bir LinkedList oluşturuldu.
                    // Bu Linkedlist içerisinde 3. indekse farklı bir özellik eklemek isteyelim :

        yeniAraba_ozellikleri.add(3, "Hız Sabitleme");  // 4. index artık bu


        Buradaki işlem de LinkedList içerisinde olduğu için, bellekte yeni yer açılmayacaktır. sırasıyla;

        "yeni_ozellikler" ---> "siyah"
        "siyah" ---> "2.0 FSI Motor"
        "2.0 FSI Motor" ---> "Masajlı Koltuklar"
        "Masajlı Koltuklar" ---> "Manuel Klima"
        "Manuel Klima" ---> "5 Kapılı"
        "5 Kapılı" ---> "Açılır Cam Tavanlı"

        yukarıdaki gösteridiği şekilde bir referans gösterimi ile hepsi tek tek objeleştirilecek ve bu objelere
        java otomatik bir referans atayacak. her bir referans da kendinden sonraki gelen objenin refertansını
        göstereceği için burada yapılacak olan bir değişmede, örneğin yukarıdaki gibi bir değişiklikte,

        3. indexe "Hız Sabitleme" ekleyeceksek, 2. indeksin objesinin referansı artık "Masajlı Koltuklar"
        objesinin referansını göstermek yerine "Hız Sabitleme" nin referansını gösterecek ve yine "Hız Sabitleme"
        objesinin referansı "Masajlı Koltuklar" objesinin referansını gösterecek. Özet olarak sadece 2 referans
        değişikliği yaparak her bir indeksin bir sonraya atlaması işlemini yaptırmamış oluruz ve bu sayede çok
        daha kolay ve çok daha az maliyet ile kod yazılmış olacaktır. Fakat her kolaylığın bir dezavantajı
        olduğu gibi LinkedListlerin de bir dezavantajı vardır. ArrayListte olduğu gibi bellekte bir yer değil
        pek çok obje olacağı için bellekte objelerin gösterildiği yer kadar yani oluşturulan LinkedListlerin
        indexi kadar bir yer oluşur ve bellekte daha çok yer kaplanır. Bellekte yeteri kadar yer yoksa da sıkıntı
        olur, yani o zaman da yine mecburen ArrayListlerin kullanılması gerekecektir.


        // Yukarıda yapılan durumları yazdırmak istersek bunu LinkedList ve ArrayList için metodlar içerisinde yazalım..

            // Metod yazıldı.

        ozellikleri_bastir(yeniAraba_ozellikleri);

         Bu şekilde kullanım da olur fakat bu
        sadece yazdırmamıza yarar. Az sonraki
        göreceğimiz kullanımda LinkedListleri tam
        anlamıyla kullanabileceğiz.. Bunun için:


         // BURADA ----------  "ListIterator"  -------- DEVREYE GIRECEK

        Burada oluşturulacak olan Iterator,
        LinkList'ler üzerinde bizim gezinmemizi,
        istediğimiz gibi hareket etmemizi ve daha
        kompleks işlemler yapmamızı sağlayacak.


        Biz listemize yeni bir değer eklemek istiyoruz, örneğin 3. indexin yerine
        başka bir özellik daha eklemek istiyoruz bunu şu şekilde yaparız :


        yeniAraba_ozellikleri.add(3, "Klimalı");        // 3. index artık bu

        System.out.println("\n---------------- YENİ ÖZELLİK GELDİ -----------------\n");

        ozellikleri_bastir(yeniAraba_ozellikleri);


        İşte bu yapılan işlemlerde java burada sadece referanslar ile oynuyor ve hiç bir
        genişletme işlemi yapmıyor. ŞİMDİ bunların tümünü yoruma alalım ve bir tane boş
        başlattığımız LinkedList'e sıralı değer eklemeye çalışalım. Bunun için bir class
        oluşturalım ::
         */

        LinkedList <String> gidilecek_yerler = new LinkedList<String>();

        sirali_ekle(gidilecek_yerler, "Postane");
        sirali_ekle(gidilecek_yerler, "Market");
        sirali_ekle(gidilecek_yerler, "Ev");

                // Sıralı bir şekilde bunlar eklenecek mi bakalım :::

        ozellikleri_bastir(gidilecek_yerler);

                // Yukarıda oluşturulan .compareTo() fonksiyonu, alfabetik olarak sıralatır.




    }
}
