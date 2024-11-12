import java.io.Serializable;

public class Ogrenci implements Serializable {

        /* Biz, gereksiz yere dosya boyutunun artmaması için, serileştirme
        işleminin yapılmasını istemediğimiz özellikleri ya da metodları
        ayrıca javaya berlirtmemiz gereklidir. Bu sayede dosya boyutunun
        program için çok da gerekli olmayan bir özellik ya da metod için
        gereksiz yere artmasını önlemiş oluruz.. Bunun için "transient"
        anahtar kelimesi kullanılır. Bu kelime, yazıldığı metodu ya da
        özelliğin serileştirme işlemini yapmaz.
         */
    private String isim;
    private transient int id;
        // transient anahtar kelimesi eklendi. Serileştirme olmayacak.
    private String bolum;

    private static int ogrenci_sayisi = 0;

    public Ogrenci(String isim, String bolum, int id) {
        this.isim = isim;
        this.bolum = bolum;
        this.id = id;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci İsmi: " + isim +
                          "\nÖğrenci Numarası: " + id +
                          "\nÖğrenci Bölüm: " + bolum + "\n";

        return bilgiler;
    }

    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }
}