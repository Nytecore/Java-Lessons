
public abstract class AOgrenci {         // (8) Abstract classlarda nasıl kullanılır?
                                // (9) Bunun için bir abstract class oluşturduk.


    private String isim;
    private int numara;
            // (16) abstract class içerisine 2 özellik eklendi.

    public AOgrenci(String isim, int numara) {
        this.isim = isim;
        this.numara = numara;
    }
            // (17) Bu özellikler, constructor'da yazıldı.

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

            // (18) Getter & Setter'lar yazıldı.

    abstract void kayit_yaptir();   // (10) Yazılması ve Implement edilmesi gereken bir fonksiyon yazdık.

    public void selamla() {         // (11) Rastgele örnek olarak bir metod daha yazdık.
        System.out.println("Selamlar....");
    }
}
