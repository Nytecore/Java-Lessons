import java.util.ArrayList;

public class Main {

    public static void yazdir (ArrayList <String> a) {          // Burası bizim arraydeki elementleri yazdırmak istediğimiz method.

        for (int i = 0; i < a.size(); i ++) {
            System.out.println("Element " + (i + 1) + " : " + a.get(i));
        }
    }

    public static void main(String[] args) {

        //Arraylist'leri array'lerin genişletilebilir hali gibi düşünebiliriz.

            //String tipinde bir ArrayList oluşturalım:

        ArrayList <String> arraylist = new ArrayList <String> ();

                // ArrayList --> oluştur
                // <String>  --> veri tipinde ArrayList oluştur.
                // arraylist --> referansında <String> veri tipinde ArrayList oluştur.
                // new ArrayList <String> --> ArrayList de bir class olduğundan new ArrayList <String> şeklinde yaparız.

        /* Bu şekilde biz array içerisine değer ekleme - çıkarma - silme
        ve güncelleme gibi işlemleri istediğimşz zaman yapabiliriz.
         */

            // ArrayList'e bir array eklemek için ".add()" fonksiyonu kullanılabilir.

        arraylist.add("Eylül");         // 0. index
        arraylist.add("Bora");          // 1. index
        arraylist.add("Bahar");         // 2. index
        arraylist.add("Eylül");         // 3. index
        arraylist.add("Yıldırım");      // 4. index
        arraylist.add("Kuşadası");      // 5. index

        System.out.println(" ");        // Bir boş satır

            // ArrayList'teki bir elemanını çağırmak yani almak için de ".get()" fonksiyonu kullanılabilir.
        System.out.println("ArrayList'in 2. indeksi : " + arraylist.get(2));       // Eylül çıktısı verir.

        System.out.println(" ");        // Bir boş satır

            // ArrayList'in boyunu (içerisindeki eleman sayısını) göstermek için de "size()" fonksiyonu kullanılabilir.
        System.out.println("ArrayList'in uzunluğu : " + arraylist.size());        // 4 sayısını verecektir.

        System.out.println(" ");        // Bir boş satır

            // ArrayList'i bastırmak için ise şu işlem yapılabilmektedir :
        System.out.println("-- Array Listesi --\n");
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

            // ArrayList değerini kaldırmak için (silmek için) :

        // arraylist.remove("Yıldırım");       >>>>>    AYNI İFADE (DEĞER)
        // arraylist.remove(4);                >>>>>    AYNI İFADE (INDEX)
        
        arraylist.remove(5);        // ArrayList'te 5. indeksteki değeri kaldırır. ("Kuşadası")

        System.out.println(" ");        // Bir boş satır

            // ArrayList içerisindeki bir değerin hangi indexte olduğunu öğrenmek için "indexOf()" kullanılır.
        System.out.print("(indexOf) Eylül şu indexte : ");
        System.out.println(arraylist.indexOf("Eylül"));             // "Eylül" hangi indexte?

            // Ancak arraylerde birden fazla aynı değer var ise "lastIndexOf()" fonkliyonu kullanılarak sonran başa kontrol sağlanır.
        System.out.print("(lastIndexOf) Eylül şu indexte : ");
        System.out.println(arraylist.lastIndexOf("Eylül"));     // "Eylül" sonran başa hangi indexte?

            // Eğer arattığımız değer index içerisinde yoksa?
        System.out.print("Index içinde girilen değer yok ise : ");
        System.out.println(arraylist.indexOf("Kuşadası"));         // "Kuşadası" hangi indexte?


            // ArrayList içerisinde bir index güncellemesi için ".set()" fonksiyonu kullanırız.
        arraylist.set(4, "YILDIRIM");           // Artık 4. index "Yıldırım" değil, "YILDIRIM" oldu.
        System.out.println("\nGüncellenen 4. index : " + arraylist.get(4));


            // ArrayList'i bir metoddan çağırmak için şu işlemler yapılır.
                // Şimdi yukarıda "yazdir" adında bir metod yaratacağız.
            // Method oluşturulduktan sonra main içerisine bu metodun referansını girerek çağıralım:
                // İçerisine de main methodda oluşturulan arraylist'in referansını girelim:

        System.out.println(" ");        // Bir boş satır

        yazdir(arraylist);      // Method oluşturuldu ve referanslar girildi.

    }
}
