import java.io.Serializable;

public class Ogrenci implements Serializable {

    /* Bu derste Ogrenci.java'dan bir çok obje oluşturacağız, sonra bu objeleri
    ilk önce bir array'e atacağız, arrayleri serileştireceğiz, sonra ArrayList'e
    atacağız.   */

    private String isim;
    private String bolum;
    private int id;


    public Ogrenci(String isim, String bolum, int id) {
        this.isim = isim;
        this.bolum = bolum;
        this.id = id;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci İsmi: " + isim +
                          "\nÖğrenci Numarası: " + id +
                          "\nÖğrenci Bölüm: " + bolum;

        return bilgiler;
    }
}