public class Daire extends Sekil{
        // (10) (Superclass gibi) Daire adında Sekil abstract classından miras alan class oluşturulur.


        // (11) Dairenin yarı çapını alacağımız bir özellik eklenir.
    private int yaricap;


        // (12) Eksra özellik ve abstract class'ın özelliklerini barındıran Constructor oluşturulur:
    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }


        // (13) (override benzeri) abstract class için mecburen oluşturacağımız implement methodu yaratıldı.
            // (13) Burada dairenin yarıçapı girildikten sonra dairenin alanının hesaplamasını yapacak işlemler yapıldı.
                // (13) Sonrasında main classtan burası çağrılacaktır.
    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + " 'in alanı " + (Math.PI * yaricap * yaricap) + " 'dir.");

    }
}
