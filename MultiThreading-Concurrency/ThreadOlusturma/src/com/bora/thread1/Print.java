package com.bora.thread1;

    /* (2) Aşağıda Print adında bir class oluşturuldu ve bu class thread oluşturulacağından
    "Thread" classından extend edildi. Classa bir özellik eklendi ve constructor'ı ya -
    zıldı.  */

public class Print extends Thread {
    private String isim;

    public Print(String isim) {
        this.isim = isim;
    }

        /* (3) Burada aslında önemli olan aşağıda Override edilen "run" metodudur. Bu metod
        içerisine yazılanlar çıktı olarak veilecek şekilde yazılmış anlamı taşırlar.
        Burada constructor'dan girilen isim ve "çalışıyor.." Stringi eklendi ve yapılan
        kodlama durumunda orada bir döngü oluşturuldu. göngü içerisine de ayrıca bir
        thread.sleep() metodu eklendi ve bu metod, çalışmanın duraklatılması işlemini
        yapar. İçerisine milisaniye değeri girilir (1000 ms = 1s) program orada o kadar
        süre duraklamış olur. İstenen şudur: girilen isim + "çalışıyor.." stringi başlar
        sonrasında döngüye girilir ve döngüde <isim> + " yazıyor.. " stringi ve 10'a kadar
        saydırma işlemini yürüten "i" değişkeni 1 saniye bekleyerek yazdırma işlemlerini
        yapacaklardır. Sonra da "<isim> + " işini bitirdi.." çıktısı alınacaktır. İşte bu
        yine main metod içerisine thread oluşumu ile yapılacaktır. Şimdi tekrar Main class
        içerisine main metoda gidelim ve threadlerin nasıl çalıştırılacağını görelim.   --------->>>    */


    @Override
    public void run() {
        System.out.println(isim + "Çalışıyor...");

        for (int i = 1; i <= 10; i++) {
            System.out.println(isim + " Yazıyor : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı...");
            }
        }
        System.out.println(isim + " İşini bitirdi..");
    }
}
