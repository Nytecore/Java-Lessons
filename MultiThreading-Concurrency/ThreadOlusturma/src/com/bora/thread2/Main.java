package com.bora.thread2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread çalışıyor.");

        /* Print print1 = new Print("Printer 1");
        Print print2 = new Print("Printer 2");

        print1.start();
        print2.start();     */

        Thread printer1 = new Thread(new Printer("Printer 1"));
        Thread printer2 = new Thread(new Printer("Printer 2"));

        /* Normalde normal obje oluşturur gibi thread objesi oluştururduk fakat Runnable
        classından thread oluşturulmuşsa, yukarıdaki gibi obje oluşumu yapmamız gerekiyor.
        Normalde: Printer print1 = new Printer (isim: "Printer 1")
        Runnable: Thread printer1 = new Thread(new Printer(isim: "Printer 1"));     */

        // Başlatmak için standart .start() metodu kullanılır.

        printer1.start();
        printer2.start();



    }
}
