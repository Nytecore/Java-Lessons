package com.bora.paket1;


import com.bora.paket2.AdayOgrenci;

public class Ogrenci implements AdayOgrenci {

    @Override
    public void ders_calis() {
        System.out.println("Ders çalışıyorum....");
    }
}
