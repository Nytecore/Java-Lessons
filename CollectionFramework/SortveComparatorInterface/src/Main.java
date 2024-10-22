import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

        /* (1) küçükten büyüğe dışında yapılacak olan işlemler için bir sınıf
        oluşturarak o sınıfı da Comparator sınıfından implemente ederiz ve
        yapılacak olan işlemi bu sınıfın içerisinde implement method ile
        nasıl bir işlem yaptıracağımızı yazarak işlemi yaparız..        */

class BuyuktenKucugeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }

    /* (2) Yukarıda yapılan işlem @Override olarak geçer fakat implement edilen
    metoddur. Classı oluşturmak için implementasyonu yapmamız gerekir. Burada
    yapılan işlem de şudur:

    Soldaki değer sağdaki değerden büyükse - bir (negatig) değer döndürmesi gerekiyor.
    Soldaki değer sağdaki değerden küçükse + bir değer (pozitif) değer döndürmesi gerekiyor.
    Soldaki değer ile sağdaki eşit ise de 0 (nötr) değer döndürmesi gerekiyor.

    "-o1.compareTo(o2);"    ---->
    •	Eğer o1 < o2 ise negatif bir değer döner.
	•	Eğer o1 == o2 ise 0 döner.
	•	Eğer o1 > o2 ise pozitif bir değer döner.
    •	"-" işareti, compareTo metodunun sonucunu tersine çevirir. Yani:
	•	o1 < o2 olduğunda normalde negatif sonuç döner, fakat başına - koyarak bu pozitif hale gelir.
	•	o1 > o2 olduğunda normalde pozitif sonuç döner, ama - ile bu negatif hale gelir.
	•	Bu, String’leri ters sırada karşılaştırmamızı sağlar.

	SONUÇ OLARAK :

	•	-o1.compareTo(o2): Normalde compareTo, iki String’i alfabetik sırada karşılaştırır.
	    Başındaki - işareti bu sıralamayı tersine çevirir, yani büyük olan önce gelir.

     */
}

class Player {
    private String isim;
    private int id;
    // Özellikler eklendi.

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }
        // Constructor'lar yazıldı.

    @Override
    public String toString() {
        return "--> ID : " + id + " || İsim : " + isim;
    }
    // Bastırmada görünecek olan işlemi yukarıda kodladık.


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

        // (5) PEKİ BİZ KENDİ CLASSLARIMIZDAN ÜRETTİĞİMİZ OBJELERİ KARŞILAŞTIRMAK İSTERTSEK???

class kucuktenBuyugePlayer implements Comparator<Player> {

        /* (6) Yukarıda sıralama yapılacak olan classı oluşturduk. Normalde String sınıfı için
        sadece "compareTo" metodu kullanılabilirdi fakat burada o metodu çağıramayız. Sebebi ise
        burada kendi oluşturduğumuz sınıfın referansı ile oluşturulan değerleri sıralamak isteme-
        mizdir diyebiliriz. Burada bu durumu ayrıca kendimiz belirtmemiz gerekir.
         */

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;

        } else if (o1.getId() > o2.getId()) {
            return 1;

        }
        return 0;
    }

    // (7) Yukarıda implemente edilen (override), String sınıfında compareTo metodunun
        // (7) Class referansına göre kullanımının uyarlanılışıdır.
            // (8) Bu classta küçükten büyüğe sıralama yaptırırma işlemi oluşturuldu.
}

class buyuktenKucugePlayer implements Comparator <Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return 1;

        } else if (o1.getId() > o2.getId()) {
            return -1;

        }
        return 0;
    }

    // (9) Bu classta da büyükten küçüğe sıralama yapacağımız işlem oluşturuldu.
        // (10) Kodlamanın neredeyse tamamı aynı sadece dönen değerin pozitif
            // (10) ya da negatif dönen değeri güncellendi, bu sayede sıralama
                // (10) büyükten küçüğe şeklinde yapılmış oldu.
}

class kucuktenBuyugeStringPlayer implements Comparator <Player> {
    // (11) Yukarıdaki sınıf oluşumu, oluşturulmuş olan objenin sıralanışının
        // (11) String değerlerine göre sıralanması durumunun kodlanışıdır.
            // (11) Sıralama küçükten büyüğe alfabetik olarak değerlerin sıralanması şeklinde olacaktır.

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
        // (12) Normalde if ve else ile kendimiz yazdığımız küçükten büyüğe ya da büyükten küçüğe
            // (12) kontrol durumu, string sınıflarda otomatik olarak "compareTo" metodu ile
                // (12) kontrol edilebildiği için, bu şekilde yazılarak kolaylıkla kontrol sağlanabildi.
}

class buyuktenKucugeStringPlayer implements Comparator <Player> {
    // (13) Yukarıdaki sınıf oluşumu, oluşturulmuş olan objenin sıralanışının
        // (13) String değerlerine göre sıralanması durumunun kodlanışıdır.
            // (13) Sıralama büyükten küçüğe alfabetik olarak değerlerin sıralanması şeklinde olacaktır.

    @Override
    public int compare(Player o1, Player o2) {
        return -o1.getIsim().compareTo(o2.getIsim());
    }
        // (14) Normalde if ve else ile kendimiz yazdığımız küçükten büyüğe ya da büyükten küçüğe
            // (14) kontrol durumu, string sınıflarda otomatik olarak "compareTo" metodu ile
                // (14) kontrol edilebildiği için, bu şekilde yazılarak kolaylıkla kontrol sağlanabildi.
}


        // (3) Kodun çaıştırılacağı alan olan main class ve method oluşturuluyor:
public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("--> Java");
        list.add("--> C++");
        list.add("--> Python");
        list.add("--> Php");
        list.add("--> Go");

        Collections.sort(list, new BuyuktenKucugeString());
            /* (4) (NORMALDE) Yukarıda Collections sınıfı içerisindeki sort metodu çağrıldı ve sıralama yapıldı.
            Burada yer alan Collection.sort metodu, listlerimizi sadece küçükten büyüğe doğru sıra-
            lama yapar. Bunun başka bir yolu olan Comparator sınıfının sort metodunu kullanarak biz
            hem küçükten büyüğe, hem büyükten küçüğe hem de farklı şekillerde sıralama yaptırabiliriz.

            (BURADA) yukarıda comparator sınıfını kullandık ve compareTo metodunu implemente ederek
            sıralamayı tersten yapacağımızı başına "-" koyarak belirttik. Burada da sıralama yapılacak
            objenin referansını (list), (new BuyuktenKucugeString) kullanarak ona göre sıralama yapmasını
            istediğimizi ayrıca özel olarak belirttik. Orada yazılmış olan ve implemente (override)
            edilen metodda da sıralamanın tersten yapılmasını istediğimizi özel olarak belirttiğimiz için
            sıralama, BuyuktenKucugeString sınıfına bakılarak yapılacak ve tersten yani büyükten küçüğe
            doğru sıralamayı yaptırtmış olacağız.
             */

        System.out.println("\nAşağıdaki işlem String sınıfında comparator metodu kullanılarak sıralandı--");
        System.out.println("Sıralama işlemi, ters olarak -BÜYÜKTEN KÜÇÜĞE- şeklinde yapıldı.\n");
        for (String s: list) {
            System.out.println(s);
        }

            System.out.println("\n*************************************************************");

            List<Player> playerList = new ArrayList<Player>();
                // "Player" classından "playerList referansı ile ArrayList objesi oluşturuldu.

            playerList.add(new Player("Bora" , 5));
            playerList.add(new Player("Kaan" , 2));
            playerList.add(new Player("Mesut" , 7));
            playerList.add(new Player("Bilal" , 3));
            playerList.add(new Player("Salih" , 9));
                // Yukarıdaki işlemde, oluşturulmuş olan objeye referansı ile değerler eklendi.


            Collections.sort(playerList, new kucuktenBuyugePlayer());
                // Sıralama işleminin yapılacağı burada belirtildi ve sıralamanın, kucuktenBuyugePlayer
                    // sınıfına göre yapılacağı vurgulandı.

            System.out.println("\nAşağıdaki işlem, kendi oluşturduğumuz classda " +
                    "comparator metodu kullanarak sıralandı:");

        System.out.println("İşlem, ID'nin -KÜÇÜKTEN BÜYÜĞE- sıralandırılması ile oluşturuldu.\n");
            for (Player p : playerList) {
                System.out.println(p);
            }
        // Yukarıda da yazdırma işlemi yapıldı.
        System.out.println("\n*************************************************************");

            Collections.sort(playerList, new buyuktenKucugePlayer());
                // Sıralama işleminin yapılacağı burada belirtildi ve sıralamanın, buyuktenKucugePlayer
                    // sınıfına göre yapılacağı vurgulandı.

        System.out.println("\nAşağıdaki işlem, kendi oluşturduğumuz classda " +
                "comparator metodu kullanarak sıralandı:");

        System.out.println("İşlem, ID'nin -BÜYÜKTEN KÜÇÜĞE- sıralandırılması ile oluşturuldu.\n");

            for (Player p: playerList) {
                System.out.println(p);
            }
            // Yukarıda da yazdırma işlemi yapıldı.
        System.out.println("\n*************************************************************");

        System.out.println("\nAşağıdaki işlem, kendi oluşturduğumuz classda " +
                "comparator metodu kullanarak sıralandı:");

        System.out.println("İşlem, Isim'in -KÜÇÜKTEN BÜYÜĞE- sıralandırılması ile oluşturuldu.\n");

        Collections.sort(playerList, new kucuktenBuyugeStringPlayer());
            // Sıralama işleminin yapılacağı burada belirtildi ve sıralamanın, kucuktenBuyugeStringPlayer
                // sınıfına göre yapılacağı vurgulandı. Burada String değerler sıralandı.

        for (Player p: playerList) {
            System.out.println(p);
        }
        // Yukarıda da yazdırma işlemi yapıldı.
        System.out.println("\n*************************************************************");

        System.out.println("\nAşağıdaki işlem, kendi oluşturduğumuz classda " +
                "comparator metodu kullanarak sıralandı:");

        System.out.println("İşlem, Isim'in -BÜYÜKTEN KÜÇÜĞE- sıralandırılması ile oluşturuldu.\n");

        Collections.sort(playerList, new buyuktenKucugeStringPlayer());
            // Sıralama işleminin yapılacağı burada belirtildi ve sıralamanın, buyuktenKucugeStringPlayer
                // sınıfına göre yapılacağı vurgulandı. Burada String değerler sıralandı.

        for (Player p: playerList) {
            System.out.println(p);
        }
        // Yukarıda da yazdırma işlemi yapıldı.
        System.out.println("\n*************************************************************");



            /* NOT : Bilindiği üzere ArrayList sıralaması, değerlerin karşılaştırılıp
            küçüklük ve büyüklük durumuna göre öne veya arkaya bir yer açılıp önceki
            değerin büyüklük ve küçüklük durumuna göre öne veya arkaya bir yer açılıp,
            sorgulanan değerin öne kaydırılması ya da yeni değerin sonraki açılan yere
            eklenmesi biçiminde oluşturulur. forEach döngüsü kullanmamızın sebebi budur

            Döngü her seferinde değerleri kontrol eder ve bellekte yer ayırarak yeni
            gelen değeri ekleyeceği yeri belirleyerek taşıma durumuna girer...
             */
    }
}