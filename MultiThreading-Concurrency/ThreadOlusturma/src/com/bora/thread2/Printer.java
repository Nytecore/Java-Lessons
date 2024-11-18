package com.bora.thread2;

public class Printer implements Runnable{

        /* (1) Yukarıdaki gibi Printer classının Runnable implementi de yine bir
        Thread oluşturma şeklidir. Normalde extends Thread yazardık fakat bu
        şekilde de implements Runnable yaparak da thread sınıfı oluşturulabilir.
        Runnable interface'ini implemente edersek ve içerisindeki run methodunu
        direkt olarak yazarsak, bu printer sınıfını da yine bir thread olarak
        kullanabiliriz.     */

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

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

    /* Yani  bir şekilde Thread classını extend ederek run methodunu override edip
    thread sınııfını oluşturuyoruz, diğerinde de Runnable interface'ini implemente
    ederek sonrasında da run methodunu implement edip sınıfı oluşturuyoruz. İki
    durumda da thread sınıfı oluşturulabiliyor. Sadece çalışma şekli farklılaşabilir.
    Bunu Main classta yapacağız     ------>>        */
