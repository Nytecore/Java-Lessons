import java.util.*;

public class Main {

    // Iterator bizim değerler arasında gezinmemizi sağlar.

        /*          ListIterator    VS    Iterator


                = ListIterator =

        * Sadece List Interface'i implemente eden classlarda kullanılır.
        * .next() ve .previous() metodları vardır.
        * ekstradan .add() metodu bulunur.

                 = Iterator =

        * Set, Queue  ve ListInterface'i implement'e eden classlarda kullanılır.
        * .previous() metodu yoktur.

     */

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
                // Hashset sınıfından bir obje oluşturalım, set referansı verelim.

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");
                // Elemanlarını oluşturalım.

        List<String> list = new ArrayList<String>();
                // ArrayList sınıfından bir obje oluşturalım ve set referansı verelim.

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
                // Elemanlarını oluşturalım.


        Iterator<String> iterator1 = set.iterator();
                // Yukarıda, iterator1 referansında bir Iterator oluşturuldu ve
                    // yukarıda oluşturulmuş olan "HashSet"'e eşitlendi.

        Iterator<String> iterator2 = list.iterator();
                // Yukarıda, iterator2 referansında bir Iterator oluşturuldu ve
                     // yukarıda oluşturulmuş olan "ArrayList"'e eşitlendi.

        System.out.println("\n************ Iterator --> HashSet **************");

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
                // Yukarıdaki işlem yapıldığında, döngü içerisinde yazdırma işlemi yapılır.
                    // Döngü içi .hasNext() metodu ile sonraki elemanın olup olmadığına bakılır
                        // Varsa true dönerek döngü devam eder. İçerisinde de yazdırma metodu içinde
                            // iterator.next() metodu yazıldı bu da, bir sonraki elemanı yazdır anlamı taşır.
                            // Tek tek tüm elemanlar yazdırılana kadar döngü devam eder ve sonra döngü durur.
                        // Burada iterator kullanıldığı için biz .next() metodu kullanabiliriz. Fakat
                    // Iterator yapısına göre .previous() metodu kullanılamaz yani önceki elemana
                // Geri dönüş işlemi yaptıramayız.
        }
        System.out.println("************************************************");

        System.out.println("************ Iterator --> ArrayList ************");

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
                // Yukarıdaki işlemde yine iterator2 içerisindeki elemanları yazdırma işlemi
                    // Yapılır. Bu işlem yine yukarıdaki while döngüsü ile aynı mantıkta çalışır.
                        // .next() metodu kullanılabilirken .previous() metodu kullanılamaz.
        }

        System.out.println("************************************************");

        System.out.println("**** ListIterator --> ArrayList --> .next() ****");


        ListIterator<String> listIterator = list.listIterator();
                // Yukarıda, iterator referansında bir ListIterator oluşturuldu ve
                    // yukarıda oluşturulmuş olan "ArrayList"'e (list referansı ile) eşitlendi.

            // ListIterator ekstradan .add() metodu bulunur.
            // .next() ve .previous() metodları vardır.
            // Sadece List Interface'i implemente eden classlarda kullanılır.
                // Burada hem ileri hem de geri gidebiliriz.



        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

                // Yukarıdaki işlemde yine listIterator içerisindeki elemanları yazdırma işlemi
                    // Yapılır. Bu işlem yine yukarıdaki while döngüleri ile aynı mantıkta çalışır.
                        // .next() metodu kullanılabilirken .previous() metodu da kullanılabilir.

        System.out.println("************************************************");

        System.out.println("** ListIterator --> ArrayList --> .previous() **");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("************************************************");

                // Yukarıdaki işlemde az önce yapılan listIterator içindeki elemanların bu sefer
                    // tersten yazdırma işlemi yapıldı. Bu işlem .hasPrevious() ve .previous()
                        // metodları kullanılarak yapıldı. Normalde, iterator yapılarında burada
                            // kullanılan previous metodları kullanılmadığı için bu işlemler
                                // ListIterator oluşumlarında kullanılabilirler. Yapılan işlem de şudur:
                                    // Yukarda hasNext ve next metodları ile ileri doğru giderek bastırma işlemleri
                                // yapılmıştı. Gidilecek yer kalmayınca da döngü durmuştu ve sonrasında artık eleman
                            // yok gibi görülüyordu. Elemanlar geride kalmıştı. hasPrevious() metodu ile geride
                        // elemanın var olup olmadığını döngü içerisinde sorgularız, true dönerse döngü false
                    // dönene kadar çalışır. Bu sefer de tersten bastırma işlemi yapılarak elemanların
                // ilk başındakine doğru gidilir. Gelinen nokta yine ilk eleman olur.


        System.out.println("****** ListIterator --> Listeden çıkarma *******");

        while (listIterator.hasNext()) {
            String value = listIterator.next();     //Iterator'ımızın o an üzerinde bulunduğu karakteri alalım.
            if (value.equals("Go")) {       // Üzerinde bulunduğumuz değer "Go" değerine eşit ise;
                listIterator.remove();              // "Go" değerini listeden çıkar.
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(" ");
        System.out.println("************************************************");

        /* forEach döngüsü de yine kendi içinde yapısı gereği bir iterator kullanır ancak
        biz bunu göremeyiz. Geliştiriciler for döngüsünü yazarken, iterator'dan faydalanmıştır.
        Biz de bunu bu sayede bastırabiliriz.


        ------------------------------------------
        for (String s : list) {
            System.out.println(s);
        ------------------------------------------

        böyle bir işlem aslında kendi içinde aşağıdakine benzer bir işleme dönüşür.

        ------------------------------------------
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if (value.equals("Go")) {
                listIterator.remove();
        ------------------------------------------


         */



    }
}
