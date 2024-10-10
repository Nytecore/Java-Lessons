public interface IDeneme {

    // (1) Normalde, interface konularında biz Interface'lere her hangi bir özellik eklenemediğinden bahsetmiştik.
        // (2) Aslında eklenebilir. Burada o detayı göreceğiz...

    // private int a = 4;  (3) --> Interface içerisinde private alan tanımlanamaz. Bu kullanım hata verir.
    // Bunun sebebi, Interface'lerden hiç bir şekilde obje üretilemez. bu yüzden private kullanımı yasaklanır.

    public int a = 4;  //  (4) --> Bu beşkilde bir özellik ekleme yapabiliriz fakat getter ve setter'lar
                                // Interfaceler içerisinde yazılamazlar. Peki nasıl kullanabiliriz??
                                    // Main.java'ya gidelim..

    /* (6) "static" anahtar kelimesi kullanmadan, main
    method içerisinden burada yazılı olan özelliğe
    direkt olarak erişim mümkünse, static anahtar
    kelimesini kullanmamız burada gereksiz olacaktır.
     */

    public static String b = "Hello World...";
        // Yukarıda özellik eklemesinde yer alan "static" kelimesi gereksiz bir kullanımdır.

    public final int c = 6;
        /* (7) Interface içerisinde yukarıdaki şekilde "final"
        anahtar kelimesi kullanarak bir özellik oluşturulumu
        yine mümkündür. Fakat normalde olduğu gibi final anahtar
        kelimesi kullanımında oluşturulma esnasında değer verilmesi
        veya constructor içerisinde değer atanması şartı vardı.
        Interface içerisinde constructor oluşturamayacağımız için
        özellik eklemesi sırasında değer ataması yapılması mecburidir.
         */


    /*
    (8) Interface içerisinde normalde metod oluşturulamaz. Bunun
    sebebi metod oluşturmak için bir obje oluşturulmalı ve
    obje referansı ile de o metoda erişilmelidir. Obje, interface
    içerisinde oluşturulamadığından, metod da oluşturulamaz.

                        -------- FAKAT ---------

     Oluşturmak istediğimiz metoda mutlaka "static" anahtar
     kelimesi eklersek, o metodu çağırmak için bizim obje
     oluşturmamıza gerek kalmayacaktır ve bu sayede de direkt
     olarak obje oluşturmadan class adı ile erişim sağlanır.
     Bu sayede de biz interface içerisinde metod da oluştura-
     biliriz... Aşağıda denemesini yapalım ;    ---->>>

     */

    public static void deneme () {
        System.out.println("Burası, interface içerisine eklenen metodun denemesidir.");
    }

            // Static ekli olarak metod eklendği ve mainde bunu çağıralım......

    /*
            ÖZET OLARAK --- EĞER INTERFACE İÇERİSİNDE ÖZELLİK EKLEMEK İSTERSEK
            BU ÖZELLİK PUBLİC İLE BAŞLAMAK ZORUNDA VE ÖZELLİK EKLEMEK İÇİN MUTLAKA
            O ÖZELLİĞİN DEĞERİNİN TANIMLANDIĞI YERDE VERİLMESİ GEREKMEKTEDİR.
            BİZ TANIMLAMA ALANIMIZA (METOD HARİÇ) STATİC VE FİNAL ANAHTAR KELİMESİ
            YAZMASAK DAHİ JAVA OTOMATİK OLARAK ONUN DÖNÜŞÜMÜNÜ (ÇEVRİMİNİ) YAPAR.
            DİREKT OLARAK CLASS ADINI KULLANARAK EKLENEN ÖZELLİĞPE ERİŞİLEBİLİR.

            OBJE, INTERFACE İÇERİSİNDE OLUŞTURULAMAZ.
     */


}
