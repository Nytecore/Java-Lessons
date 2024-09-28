public class Daire extends Sekil{
        // Yine class, Superclass'dan (Sekil) miras alındı "extends"

    private int yaricap;
        // Bir özellik girildi.


    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }
        // Constructor oluşturuldu. Ekstra olan özellik ekstra olarak contructora eklendi.


    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı " + (Math.PI * yaricap * yaricap) + "'dir.");

    }
        // Implement method oluşturuldu. Superclassta yazılan metod Override benzeri alındı.
}
