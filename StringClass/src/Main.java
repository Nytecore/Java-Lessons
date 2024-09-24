public class Main {

    public static void main(String[] args) {

        String a = "Bora";

        String b = new String ("Bora Yıldırım");

        /* String sınıflarına bu şekilde farklı olarak atama yapılabilir. Bunların farklılıklarını sonra göreceğiz..

                    ---- METODLAR ----

         Bir String'in boyunu (kaç harfli olduğunu) öğrenmek için ".lenght()" metodu kulanılabilir.
         */


        System.out.println("\n\t\t'b' Stringi : " + b);

        System.out.println(" ");    // Boş bir satır --

        System.out.println("'b' Stringi harf sayısı : " + b.length());
                // Bora Yıldırım = 13 değeri verir.

        /* Bir String'in içindeki array indexi de yine sıfırdan başlar. Örneğin "Bora" = "0. Index B - 2. Index r"
        Bu indeksi almak istersek; string sınıfında şu metod kullanılır: " .charAt()" Örneğin:
         */

        System.out.println(" ");    // Boş bir satır --
        System.out.println("'b' Stringi 8. indexi : " + b.charAt(8));
                // 'b' Stringinin 8. indeksini almak istiyoruz: Sonuç "d" çıkar.

        /*
        Bir String'in ne ile başladığını da kontrol ettirebiliriz. Bu kontrol true ya da false değer döner.
        Bunun için şu metod kullanılır: " .startsWith() " parantez içerisine kontrol değeri girilir. Örneğin:
         */

        System.out.println(" ");    // Boş bir satır --
        System.out.println("'b' Stringi 'Bo' ile mi başlıyor ? : " + b.startsWith("Bo"));
                // True döner. "b" stringi "Bo" ile başlar (Bora Yıldırım)

        /*
        Yine bir String'in ne ile bittğini de kontrol edebiliriz. Bunun için de " .endsWith() " metodu
        kulanılır. Koşul tipindedir yani true ya da false değer döndürür. Örneğin:
         */

        System.out.println(" ");    // Boş bir satır --

        System.out.println("'b' Stringi 'ABC' ile mi biter ? : " + b.endsWith("ABC"));
                // False döner. (Bora Yıldırım ---> "rım" ile biter.)

        System.out.println("'b' Stringi 'rım' ile mi biter ? : " + b.endsWith("rım"));
                // True döner.


        /*
        Bir String içerisinde biz bir harfi sondan başa ya da baştan sona doğru aratabiliriz. Kontrol sonrası
        istenen harfin hangi indexte olduğu bize verilir. Baştan sona doğru kontrol yapmak için " .indexOf() "
        sondan başa doğru da kontrol yapmak için " .lastIndexOf() " metodları kullanılır. Baştan sona kontrol
        yapıldığında örneğin 'r' karakterinin indexi öğrenilmek isteniyor ise; baştan sona gelerek ilk 'r'
        karakteri görüldüğünde arama durur. karakter 2 tane ise bir de sondan kontrol yaptırmamız gerekir. Eğer
        istenen harf, belirtilen String içerisinde değilse " -1 " değer verir. Burada kontrol sondan başa da
        olsa baştan sona da olsa index sayımı baştan sona yapılır. Örneğin :
         */

        System.out.println(" ");    // Boş bir satır --

        System.out.println("'b' Stringinde 'r' harfi " + b.indexOf('r') + ". indextedir.");
                // 'r' karakteri hangi indexte? ---> 2. Index
        System.out.println("'b' Stringinde 'r' harfi " + b.lastIndexOf('r') + ". indextedir.");
                // 'r' karakteri hangi indexte (sondan kontrol) ---> 10. Index

        System.out.println("'b' Stringinde 'x' harfi " + b.indexOf('x') + ". indextedir. (Yok ise '-1'");

        /*
        Bir String'in içindeki harf yani karakterlerin hepsini küçük harf ya da büyük harfe dönüştürebiliriz.
        Büyük harfe dönüştürmek için " .toUpperCase() " , küçük harfe dönüştürmek için ise " .toLowerCase() "
        metodları kullanılır. Örnek:
         */

        System.out.println(" ");    // Boş bir satır --

        System.out.println("'b' Stringini büyük harflerle gösterelim : " + b.toUpperCase());
                // 'b' referansındaki Stringin tüm harflerinin büyük harfe dönüşümü

        System.out.println("'b' Stringini küçük harflerle gösterelim : " + b.toLowerCase());
                // 'b' referansındaki Stringin tüm harflerinin küçük harflere dönüşümü


        /*
        String bir değeri integer (int) veri tipine ya da int bir veri tipini String veri tipine
        dönüştürebiliriz. Bunun için:

        String ------> int dönüştürme : " Integer.parseInt("referans"); "
        int ------> String dönüştürme : " String.valueOf("referans"); "

        şeklinde bir kod ile yapabiliriz. Bu konuya örnek :
         */

        System.out.println(" ");    // Boş bir satır --

                // String değerini int değerine dönüştürme ::

        String c = "1923";
        int c1 = Integer.parseInt(c);   // Burada String'i int veri tipine dönüştürüyoruz.

        System.out.println("String veri tipinin int veri tipine dönüşmüş hali : " + (c1 - 42));
                // Görüldüğü gibi işlem yaptırıyoruz ve hata vermiyor. String değerde hata verir.


                // int değerini String değerine dönüştürme ::

        int d = 1923;
        String d1 = String.valueOf(d);  // Burada da int veri tipi, String veri tipine dömüştürüldü.

        System.out.println("int veri tipinin String veri tipine dönüşmüş hali : " + d);


        /*
        En başta bahsetmiş olduğumuz string oluşumları arasında "String a = new String ("Bora");"
        şeklindeki String veri tipi oluşumu, "String a = "Bora";" bu şekildeki bir String oluşumundan
        farklıdır. Bunla şu şekilde farklılıklarını anlayabiliriz :

        Örneğin;
         */

        System.out.println(" ");    // Boş bir satır --

        String s = new String ("Bora");
        String s1 = new String ("Bora");

        if (a == b) {
            System.out.println("Eşittirler.");
        } else {
            System.out.println("Eşit değildirler.");
        }

        /*
        Yukarıdaki kodlamanın çıktısı, "Eşit değildirler" olacaktır. Bunun sebebi şudur; biz burada
        "s" ve "s1" referansında oluşturulan 2 String veri tipinin eşit olup olmadığını sorguladık.
        Eşit çıkmadı. Eşit olmamasının sebebi şudur, biz burada iki ayrı obje oluşturmuş olduk ve
        bu objelerin her biri bellekte farklı bir yer gösterirler. Burada belleklerin değerlerini
        değil de aslında belleklerin gösterdikleri yeri sorgulamış olduk. Bu yüzden buradaki sonuç
        false değeri verir ve eşit olmadığını gösterir.

        Başka bir örnek yapalım:
         */

        String x = "Bora";
        String x1 = "Bora";

        if (x == x1) {
            System.out.println("Eşittirler.");
        } else {
            System.out.println("Eşit değildirler.");

            /*
            Yukarıda yapmış olduğumuz kodlamada ise, "x" ve "x1" referansında iki adet String oluşturduk.
            Bu String veri tiplerine "Bora" karakterlerini atadık ve bu iki ayrı veri tipi oluşum
            bakımından farklı obje olmadıklarından, bellekte farklı yerleri göstermezler ve bellekte
            aynı yere yerleşirler. Bu yüzden de yukarıda yapmış olduğumuz sorgulama işleminde true
            değer döner ve "Eşittirler" çıktısını alırız.
             */

                        // ---------- FAKAT -----------

            /*
            Yukarıda yapılan örnekler arasında bulunan "s" ve "s1" örneklerini ele alalım. Yukarıda
            yapmış olduğumuz sorgulama işleminde biz "==" ifadesini kullarak sorguyu yaptırdık ve
            sorgulamada false değerini aldık. Biz buradaki sorgulamada "==" ifadesi kullanıp iki
            objenin bellekte gösterdiği yeri sorgulamak yerine " .equals() " metodunu kullanırsak,
            bu iki objenin içine girilen değerleri sorgulatmış oluruz ve o zaman bizim yaptırdığımız
            sorgulama işlemi false değil true değer döndürür.

            Örneğin::
             */

            String z = new String("Bora");
            String z1 = new String("Bora");

            if (z1.equals(z)) {
                System.out.println(".equals() ile sorgu : TRUE");
            } else {
                System.out.println(" .equals() ile sorgu : FALSE");
            }
        }
    }
}
