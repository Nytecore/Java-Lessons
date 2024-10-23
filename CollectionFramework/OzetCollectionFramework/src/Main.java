public class Main {
    public static void main(String[] args) {

        /*
        ----------------------------------------------------------------------------------------------------------------
        ## List Interface'i Implement'e Eden Classlar ##

        Elementleri liste halinde depolar.
        Bir element birden fazla depolanabilir.
        Elementler index ile tutulur.
        Elementler eklenme sırasını korur.
        Bir elemanı aramak çok yavaştır.
        Bir elemana index değeri ile ulaşmak hızlıdır.
        Listeler Collections.sort() metoduyla sıralanabilirler.


        -- Thread İşlemlerinde Kullanılacak Veri Yapısı --
        * Vectorler ----> Çünkü bazı metodları "Synchronized" anahtar kelimesiyle yazılmıştır.


        -- Elemanı Sadece Sona yada Başa Eklediğimiz Durumlarda --
        * ArrayList ----> Çünkü sadece sona eklemek arraylistlerde daha hızlıdır.


        -- Elemanı Ortalara Ekleyeceğimiz Durumlar Varsa --
        * LinkedList ----> Çünkü sadece o bölgenin referansları üzerinde işlem yapılır.
 -----------------------------------------------------------------------------------------------------------------------

        ## Set Interface'ini Implemente Eden Classlar ##

        Bir elemanı sadece bir defa depolar.
        Bir elemanın sadece bir defa depolanmasını istiyorsak Listler(ArrayList,LinkedList vs.) yerine kullanılır.
        Elemanlar Listler gibi indexlenmezler.
        Bir elemanın setlerde olup olmadığını sorgulama listlere göre oldukça hızlıdır.

        -- Elemanların Sırası Önemli Değilse ve Sorgulama İşlemlerinin Hızlı Olması İsteniyorsa --
        * HashSet ----> Elemanları ekleme sırasına göre depolamaz ve bir elemanın olup olmadığını sorgulama hash
            fonksiyonuyla yapıldığı için her zaman hızlı ve sabit zamanda çalışır.

        -- Elemanların Eklenme Sırası Önemliyse ve Sorgulama İşlemlerinin Hızlı Olması İsteniyorsa --
        * LinkedHashSet ----> LinkedList ve HashSet implementasyonu gibi çalıştığı için değerleri ekleme
            sırasına göre depolar. Ayrıca elemanları sorgulama çok hızlıdır ve sabit zamanda çalışır.

        -- Elemanların Sıralanması Önemliyse --
        * TreeSet ----> Verileri ağaç yapısında depoladığı için veriler her zaman sıralıdır. Ancak bir elemanın var
            olup olmadığını sorgulama zamanı içindeki eleman sayısıyla doğru orantılıdır. (0(login))

        NOT: Eğer kendi objelerimizi setlerde kullanmak istiyorsak sadece
            hashCode() ve equals() metodları override etmeliyiz.
------------------------------------------------------------------------------------------------------------------------

        ## Map Interface'ini Impelement Eden Classlar ##

        Veriler Key-Value (anahtar-değer) ilişkisiyle depolanır.
        Bir key'e karşılık gelen yalnızca bir değer bulunur.
        Bir key birden fazla bulunamaz.
        Bir değere bir key üzerinden erişmek çok hızlıdır.
        Değerlerin üzerinde tek tek gezinmek çok yavaştır.
        Eğer kendi objelerimizi maplerde kullanmak istiyorsak hasCode() ve equals() metodlarını override etmeliyiz.


        -- HashMap --
        * keyler ve Value'lar sıralı değildir.

        -- LinkedHashMap --
        * Keyler ve Value'lar eklenme sırasına göre depolanır.

        -- TreeMap --
        * Keyler ve Value'lar "KEYLERE GÖRE" sıralı depolanır.
------------------------------------------------------------------------------------------------------------------------

        ## Queue Interface'ini Implement Eden Classlar ##

        -- LinkedList --
        * Eğer Queue Interface'inden bir referans ile LinkedList oluşturulursa bu LinkedList,
            aynı zamanda bir Queue gibi davranır.
        * First In First Out (F.I.F.O.) --> İlk giren ilk çıkar mantığına göre çalışır.

        -- Priority Queue --
        * Queue Interface'ini implemente etmesine rağmen First In First Out mantığıyla çalışmaz.
        * Değerler öncelik sırasına göre kuyruğun başına geçer.
                --> Integer : Büyükten küçüğe / ilk öncelik en küçükte.
                --> String : Alfabetik olarak / ilk öncelik sözlükte gelen en önceki harfte.
------------------------------------------------------------------------------------------------------------------------

        ## Vector Vlassından Extent Eden Stackler ##

        * L.I.F.O. (Last In First Out) / son giren ilk çıkar mantığıyla çalışır.
            Bilgisayarlarda Recursif Fonksiyonlar çalıştırılırken kullanılır.
------------------------------------------------------------------------------------------------------------------------

        ## Kendi Objemizle Oluşturduğumuz Bir Veri Yapısını Sıralamak ##

        * Collection.sort() metoduyla kendi objelerimiz ile oluşturduğumuz bir veri yapısını sıralamak için
            ya Comparable Interface'ini ya da Comparator Interface'ini implemente etmek zorundayız.

        ## Comparable ve Comparator Farkı ##

        * Comparable metoduyla obje üzerinde eklenen elemanlar içinde sadece ileri gidebilirken yani
            sadece .next() metodu kullanabiliriz.
        * Comparator metodunda ise obje üzerinde eklenen elemanlar içinde ileri geri ve
            diğer işlemleri de yapabiliriz. Yani .next() , .previous() metodları kullanılabilir.
------------------------------------------------------------------------------------------------------------------------

        ## Iterator ve Iterable ##

        * Bir veri yapısından Iterator oluşturarak veri yapısının elemanları üzerinden kolayca gezinebiliriz.
                --->> iterator.hasNext() ya da iterator.next() ile.
        * forEach döngüsü, aslında kendi içinde Iterator kullanır.

        * Bu yüzden bizim de bir classımızdan oluşturduğumuz objelerin üzerinde gezinebilmemiz için,
            Iterable sınıfını implemente etmemiz ve classlarımıza ait bir tane iterator class
            yazmamız gerekmektedir.

        * Bu yolla forEach metoduyla direkt olarak bastırma işlemini yapabiliriz.


         */
    }
}
