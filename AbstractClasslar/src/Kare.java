public class Kare extends Sekil{
        // Inheritance gibi "extends Sekil" şeklinde yazılarak miras alır

    private int kenar;
        // Bir özellik oluşturulur.

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }
        // Burada constructor, Superclass'dan alındığı gibi alınır, ekstra özellik constructor'a işlenir.

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı " + (kenar * kenar) + "'dir.");

    }
        /* Asıl önemli yer burasıdır. Burada olduğu gibi "Override" başlığında Superclass'da
        yazılan abstract metod burada "Implement" edilmiştir. Bu "Implement method" olarak geçer.
        Bahsettiğimiz gibi Superclass'da oluşturulur ve subclasslarda Implement edilmek zorun-
        dadır. (Inheritance'da Override durumu isteye bağlıydı.)
         */

    public void cevre_hesapla() {

        System.out.println(getIsim() + "'in çevresi " + (4 * kenar) + "'dir.");

    }
        // Burada da ekstra bir metod yazıldı. Bunu main classta method çağrısı farklılıklarını
            // göstermek için yaratıldı.
}
