package com.bora.thread1;

public class Main {

    /* (1) Bu derste thread oluşturma ve kullanmayı öğreneceğiz. Her hangi bir thread oluştursak da
    oluşturmasak da aslında main metodumuz yani yazdırmayı yaptığımız metodda otomatik olarak
    thread oluşturuluyor. Ekstra olarak thread oluşturmak için bir paket oluşturduk (com.bora.thread1)
    sonrasında bu thread içerisine Main classın yanı sıra bir de "Print" adlı class oluşturduk.
    Bu class içerisine thread'i ekleyeceğiz. Hadi o classa gidelim ...  ------->>>            */


    public static void main(String[] args) {

        Print print1 = new Print("Printer 1");
        Print print2 = new Print("Printer 2");

        /* (4) Yukarıda da "Print" classından print1 ve print2 referansları ile oluşturulan objelerdir.
        Obje oluşturuldu ve constructor yazıldığı için, obye içerisine "Printer 1" ve "Printer 2"
        isimleri verildi.       */

        print1.start();
        print2.start();

        /* (5) Yukarıda ".start()" metodu ile yazılan kod, "print1" ve "print2" referansları ile
        oluşturulmuş objeden üretilen thread fonksiyonunu başlatma işmeini yapar. .start() metodu
        yazarak oradaki thread'ın başlaması komutunu veririz.       */


        System.out.println("Main thread çalışıyor.");

        /* (6) Yukarıda 3 tane thread var. Bunların çalışması tamamıyla JVM ve işletim sistemine
        bağlıdır. Sırası, yukarıda sırasıyla print1, print2 ve main thread olmasına rağmen
        çalıştırma sırası tamamıyla değişebilir. Değişmeyedebilir.          */

        // Threadler bu şekilde oluşturulabilir ya da, bir package daha oluşturalım: ---> thread2

    }
}
