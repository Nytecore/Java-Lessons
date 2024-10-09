package com.bora.matematik;

        // Yine "com.bora.matematik" paketinde bir class oluşturuldu.

public class Matematik implements IMatematik {

    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplama sonucu : " + (a + b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Çıkarma sonucu : " + (a - b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Çarpma sonucu : " + (a * b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölme sonucu : " + ((double)a / b));
    }
}

        // Burada, oluşturulan interface içerisindeki basit metodlar implement edildi.
