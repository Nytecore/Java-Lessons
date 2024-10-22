import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {


        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();


            // HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Java Script");
        set1.add("Php");

            // LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("Java Script");
        set2.add("Php");

            // Treeset
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("Java Script");
        set3.add("Php");


            // Bir elementten birden fazla depolamak için bir ekleme yapalım
        set3.add("C++");
            // Görüldüğü gibi ekleme yapılamadı. Bunun sebebi HashSet - LinkedHashSet ve
                // TreeSet gibi classlara aynı elemanı birden çok kez depolayamazlar.

        System.out.println("************** HashSet **************");
        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("************** LinkedHashSet **************");
        for (String s : set2) {
            System.out.println(s);
        }
        System.out.println("************** TreesSet **************");
        for (String s : set3) {
            System.out.println(s);
        }


        /*
        HashSette bu girilen elementler sırasıyla depolanmadığı için karışık olarak
        ekrana yazdırılır.
        LinkedHashSette girilen elementler görüldüğü gibi girildiği sıraya göre
        ekrana yazdırılır.
        TreeSette ise girilen elementler, alfabetik olarak ekrana yazdırılırlar.
         */

            /* "contains" adlı bir metodumuz vardır. Bu metod, yanına gelen referansın
            gösterdiği set'in içerisinde, contains'e girdiğimiz elementin o sette olup
            olmadığını kontrol eder. Eğer kotrol ettirdiğimiz element o sette var ise
            true, yoksa da false değer döndürür. */

        System.out.println("\n************* 'contains()' Kontrolü *************");
        System.out.println("set1 (HashSet) içerisinde 'Go' var mı? :  " + set1.contains("Go"));
        System.out.println("set1 (HashSet) içerisinde 'Java' var mı? :   " + set1.contains("Java"));
        System.out.println("*************************************************");

        // Yukarıda set1 (HashSet) içerisinde "Go" ve "Java" elemnentrinin olup olmadığı kontrol ediliyor.

        /* Başka bir metodumuz olan "isEmpty()" ise, girilen sette eleman
        olup olmadığını kontrol eder. Eleman yoksa true, varsa false döner. */

        System.out.println("\n*************** 'isEmpty()' Kontrolü **************");
        System.out.println("set1 (HashSet) içerisinde eleman yok mu? :  " + set1.isEmpty());
        System.out.println("***************************************************");

        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();


        s1.add("Java");
        s1.add("C++");
        s1.add("Python");
        s1.add("Javascript");
        s1.add("Php");

        s2.add("Go");
        s2.add("Java");
        s2.add("CSS");

        Set<String> fark = new HashSet<String>(s2);

        System.out.println("\n********** FARK KÜMESİ **********");
        System.out.println(fark.removeAll(s1));
        System.out.println(fark);

        System.out.println("\n********** KESİŞİM KÜMESİ **********");

        Set<String> kesisim = new HashSet<String>(s2);
        System.out.println(kesisim.retainAll(s1));
        System.out.println(kesisim);


        /* NOT: Sıralı değerler eklendiğinde, performans olarak TreeSet
        daha hızlı çalışırken, ancak farklı ve karışık değerler eklenirse
        HashSet daha hızlı olacaktır. */





    }
}
