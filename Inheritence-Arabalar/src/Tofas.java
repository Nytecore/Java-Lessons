public class Tofas extends Arabalar {       // Subclass


    // Araç için ekstra bilgiler girildi.
    private String tramer;
    private int boyali_parca;
    private int degisen;
    private int fiyat;


        // Constructor
    public Tofas (String marka , String model , String renk , String motor , String yakit , int tekerlek_sayisi , String klima , String tramer , int boyali_parca , int degisen , int fiyat) {
        super (marka , model , renk , motor , yakit , tekerlek_sayisi , klima); //SUPERCLASS

        this.tramer = tramer;
        this.boyali_parca = boyali_parca;
        this.degisen = degisen;
        this.fiyat = fiyat;
    }


        // Getter & Setter
    public String getTramer() {
        return tramer;
    }

    public void setTramer(String tramer) {
        this.tramer = tramer;
    }

    public int getBoyali_parca() {
        return boyali_parca;
    }

    public void setBoyali_parca(int boyali_parca) {
        this.boyali_parca = boyali_parca;
    }

    public int getDegisen() {
        return degisen;
    }

    public void setDegisen(int degisen) {
        this.degisen = degisen;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }



    // Herhangi bir hikâye yaratıldı.
    public void kazaYap () {
        System.out.println("Araç kaza yaptı ve arabada 87.000 liralık mastaf çıktı.");

    }


        // Herhangi bir hikâye yaratıldı.
    public void cezaYe (int ceza_tutari) {
        System.out.println("Araç kazaya karıştığında sürücünün alkollü olduğu tespit edildi.");
        System.out.println("Araç sahibine " + ceza_tutari + " TL trafik cezası yazıldı.");

    }



        // Yeni bilgiler (OVERRIDE)
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Aracın fiyatı : " + this.fiyat + " TL");

    }
    // Subclassda (Audi) yazılan hikâyelerden bir başkası daha çağırıldı.



        // Herhangi bir hikâye yaratıldı.
    public void kazaBilgileri () {
        System.out.println("-- Kaza Bilgileri --");
        System.out.println("Tramer kaydı : " + this.tramer);
        System.out.println("Boyalı parça : " + this.boyali_parca);
        System.out.println("Değişen parça : " + this.degisen);

    }



        // Herhangi bir hikâye yaratıldı.
    public void degerKaybi (int tutar) {
        System.out.println("Araç pert kayıtlıdır ve araçta " + tutar + " TL masraf vardır.");
        System.out.println("Araç pert kayıtlı olduğundan %60 değer kaybına uğramıştır.");
        System.out.println("Aracın fiyatı " + this.fiyat + " TL iken ------>");
        System.out.println("Değer kaybı sonrası güncel fiyatı " + (this.fiyat - (this.fiyat / 100 * 60)) + " TL olmuştur.");
    }

}