import java.util.*;

public class Main {

            // Burada yazdırma işlemi yapılması için çağıracağımız bir metod yaratalım :
    public static void mapYazdir (Map<Integer,String> map) {


        /* Yarattığımız metodda metod içerisine constructor olarak bir
        Map sınıfı ekledik ve adını map yaptık, mecburen burada map'e
        çağırdığımız yerde bir işlem yaptırmamız gerekecek...

        Öncelikle biz map.put() metoduyla 6 rastgele değer ekledik.
        Bunların hangi sınıftan olduğunu main metodda çağırırken
        söyleyeceğiz..      */

        map.put(20,"Java");
        map.put(10,"CSS");
        map.put(50,"C++");
        map.put(45,"Php");
        map.put(60,"Kotlin");
        map.put(30,"C#");

        /* Daha sonra da bu çağrılan sınıfların yazdırılması için
        alt alta yazdırma işlemini entrySet'e dönüştürerek yapalım.
         */

        /* for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println("--> Key " + entry.getKey() + " Value : " + entry.getValue());
        }   */

        // Alt alta yazdırma işlemini şu şekilde forEach döngüsü ile de yapabiliriz daha kolay olur :

        for (Integer key: map.keySet()) {
            System.out.println("Key : " + key + " Value : " + map.get(key));
        }

        /* Yukarıdaki şekilde yazılan kod yine alt alta satır olarak yazdırır.
        Bunun anlamı şudur : ".keySet()" metodu, sadece keyleri görür ve yazdırır.
        Sonrasında map.get() metodu ile de değer çağırma metodu çağrılır fakat
        burada değer çağrılırken normalde çağırdığımız değerin yani valuenin
        hangisini çağırdığımızı belirtmek için, o value'nin key'ini girmek gerekirdi.
        Burada biz şöyle yaptık; keySet metodu ile sadece keyler yazdırılacak ve
        o yazdırılan keyler, get() metodu içinde olacağı için tüm keyler ve tüm
        valueler aslında yazdırılmış olacaktır. Bu mantıkta çalışırlar.
         */

    }

    public static void mapValues (Map<Integer,String> map) {

        Collection<String> values = map.values();

        for (String s: values) {
            System.out.println("Value (Değer) : " + s);
        }

        // Main metod içerisinde anlatılanı burada yaptık.
    }

    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();

        /*
        Karşılaştırmaları örneklendirmek için 3 adet obje yaratıldı.
        Bu objelerden biri HashMap, diğeri LinkedHashMap, diğeri de
        TreeMap türünden yaratıldı.

        Bu türlerden objeler yaratılırken, öncelikle Map yazarak map
        sınıfı eklemek istediğimizi sonrada HashMap, TreeMap gibi
        spesifik olan sınıfları eklemek istediğimizi söyleriz. Çünkü
        "Map" sınıfı; "HashMap" - "LinkedHashMap" ve "TreeMap" sınıf-
        larının her birini implemente eder. Bu yüzden öncelikle genel
        olan sınıfı sonra o sınıfın implemente ettiği sınıfları yazarız.

        Map sınıfında da önemli olan şey şudur; bir key olmalı ve bu
        key'e karşılık gelen bir de value yani değer olmalıdır. Bunların
        yazılmadan önce belirtilmesi gerekir. "<Integer,String>" gibi.
         */


        // Yukarıda oluşturduğumuz metodu çağırp burada kullanarak yazdırma işlemini yapalım ----


        System.out.println("\n********************************************");
        System.out.println("        HashMap (Random Yazdırılır)");
        System.out.println("*********************************************\n");

        mapYazdir(hashMap);

        System.out.println("\n******************************************************");
        System.out.println("   LinkedHashMap (Eklenme Sırasına Göre Yazdırılır)");
        System.out.println("******************************************************\n");

        mapYazdir(linkedHashMap);

        System.out.println("\n********************************************************");
        System.out.println("  TreeMap (Alfabetik olarak Tree Yapısıyla Yazdırılır");
        System.out.println("********************************************************\n");

        mapYazdir(treeMap);

        /* Biz javada şöyle bir işlem de yapabiliriz : ".values()" adlı bir metodumuz vardır.
        Bu metod, bize alınan referansın olduğu classa bağlı olarak, velue (değer)' nun
        olduğu bir collection döner. Yani buradan dönen değeri bir referansa atayabilir ve o
        referans ile işlemler yapabilir ya da direkt o işlemi yazrıdabiliriz. Bu yalnızca
        value yani değer (String) döner. key ataması yapamayız. Örneği yapalım :          */

        // Bunu yukarıdaki "mapValues" metodu içerisine yazalım: Aşağıya da onu çağıralım:

        System.out.println("\n********************************************************");
        System.out.println("       HashMap'i .values() metodu ile yazdıralım");
        System.out.println("********************************************************\n");

        mapValues(hashMap);

        System.out.println("\n********************************************************");
        System.out.println("     LinkedHashMap'i .values() metodu ile yazdıralım");
        System.out.println("********************************************************\n");

        mapValues(linkedHashMap);

        System.out.println("\n********************************************************");
        System.out.println("        TreeMap'i .values() metodu ile yazdıralım");
        System.out.println("********************************************************\n");

        mapValues(treeMap);

        // Yukarıdaki işlemler ile, bu sınıfların sadece value'ları yazdırılır.
                // Keyler görmezden gelinir...

        /* Not: Bu yapılarda aslında keyler görmezden gelinir doğru fakat
        görmezden gelinseler dahi, java, bu durumda keylergörünüyor gibi
        algılar, yazdırma sırasını yine sınıfın tipine göre yapar yani
        LinkedHashMap ise mesela eklendiği sıraya göre, TreeMap ise key
        sırasına bakarak küçükten büyüğe göre sıralayarak yazdırma yapar.
         */





    }
}