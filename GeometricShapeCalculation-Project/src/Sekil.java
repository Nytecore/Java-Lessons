public abstract class Sekil {
        // (1) Burada öncelikle bir abstract class (Superclass gibi) oluşturuldu.

    private String isim;
        // (2) Bir özellik girildi.

    public Sekil(String isim) {
        this.isim = isim;
    }
        // (3) Constructor yaratıldı.

    abstract void alanHesapla ();
        // (4) Burada bir abstract method yaratıldı.


        // (5) Aşağıya da Getter & Setter eklendi.
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}


    /*

            NOT : Abstract Class'a özel 3 tane daha subclass yaratacağız bunlar Üçgen - Kare - Daire .....

     */
