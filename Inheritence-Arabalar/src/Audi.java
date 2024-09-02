public class Audi extends Arabalar {        // Subclass

        // Audi subclassı için özellikler yaratıldı.
    private int model_yili;
    private String kilometre;
    private int fiyat;


        // Audi subclassı için constructor oluşturuldu ve Superclass'dan (Arabalar) constructorlar çekildi.
    public Audi (String marka , String model , String renk , String motor , String yakit , int tekerlek_sayisi , String klima , int model_yili , String kilometre , int fiyat) {
        super (marka , model , renk , motor , yakit , tekerlek_sayisi , klima);

        this.model_yili = model_yili;
        this.kilometre = kilometre;
        this.fiyat = fiyat;

    }

        // Çağırmak gerekebileceğinden Getter & Setter eklendi.
    public int getModel_yili() {
        return model_yili;
    }

    public void setModel_yili(int model_yili) {
        this.model_yili = model_yili;
    }

    public String getKilometre() {
        return kilometre;
    }

    public void setKilometre(String kilometre) {
        this.kilometre = kilometre;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }


        // Herhangi bir hikâye yaratıldı.
    public void arizaYap () {
        System.out.println("Araç emniyet kemeri takılı olduğundan kasisten geçildiği sırada kaza algılamıştır.");
        System.out.println("Kaza algılaması sebebiyle araç sürücüyü korumaya almak için Airbag açmıştır.");
    }


        // Superclassdan overriding yapıldı ve ekstra özellikler de buraya işlendi.
    public void bilgileriGoster () {
        super.bilgileriGoster();

        System.out.println("Model yılı : " + this.model_yili);
        System.out.println("Kilometre : " + this.kilometre);
        System.out.println("Aracın fiyatı : " + this.fiyat + " TL");
    }


        // Herhangi bir hikâye yaratıldı.
    public void masraf (int tutar) {
        System.out.println("Araç airbag açtığı için onarımına " + tutar + " TL civarı masraf yapılmıştır.");
    }


        // Herhangi bir hikâye yaratıldı.
    public void degerKaybi () {
        System.out.println("Airbag açıldığı için araç boşu boşuna değer kaybı yaşamıştır.");
        System.out.println("Değer kaybı dolayısıyla araç %10 değer kaybetmiştir.");
        System.out.println("Aracın değeri normalde " + this.fiyat + " TL iken ----->");
        System.out.println("Değer kaybı sonrası aracın güncel değeri " + (this.fiyat - (this.fiyat / 100 * 10))+ " TL olmuştur.");
    }

}