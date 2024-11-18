package com.bora.anonthread;

public class Main {

    /* İki Farklı şekilde thread oluşumunu görmüştük (extend Thread ve implements Runnable)
    bunun dışında bir de anonim class olarak oluşturulabilen threadler de vardır bunlar
    aşağıdaki şekilde oluşturulur ---------->>      */

    public static void main(String[] args) {

        /* (1) Ayrı bir classta Runnable interface'i implemente etmek gibi main metod içinde de
        bu oluşumu "hread printer1 = new Thread(new Runnable()" yaptığımız esnada otomatik
        olarak Java aşağıya run() metodunu override edecek ve otomatik olarak oluşmuş olacak. */

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
       Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-1- Thread çalışıyor..");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("---> 1. Thread Yazıyor : " + i);                   // ------->> Anonymous Thread
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Exception yakalandı.");
                    }
                }
            }
        });
        // Biz burada ekstradan bir tane class oluşturmadan direk new Runnable diyerek
        // Anonim class yöntemiyle bir thread oluşturmuş oluruz.
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------





//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-2- Thread çalışıyor..");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("---> 2. Thread Yazıyor : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Exception yakalandı.");
                    }
                }
            }
        }).start();

                /* Yukarıdaki şekildei new Thread(new Runnable() şeklinde de
                bir thread oluşturabiliriz. Bu thread'i yalnızca tek seferlik
                kullanabiliriz. Referans oluşturmadığımız için atamasını yapa
                mayız. En sonunda da .start() fonksikonu ile threadi çalıştır
                abilriz. Thread sadece burada kullanılır. Başka bir yerde bu
                thread kullanılamaz.        */
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------




        System.out.println("Main thread çalışıyor...");
        printer1.start();


    }
}
