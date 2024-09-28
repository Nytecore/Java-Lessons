public class Kare extends Sekil{
        // (14) Yine abstract classtan miras alan bir Kare referanslı bir class oluşturuldu.


        // (15) Karenin kenarını almak için bir özellik eklendi.
    private int kenar;


        // (16) abstract class ve ekstra özelliği içeren Constructor oluşturulacak :
    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }


        // (17) Aşağıda yine abstract class'ın implement method'unu içeren bir method oluşturuldu.
            // (17) Bu methodda Kare'nin kenarı alındıktan sonra alanını hesaplayacak işlemler yapılacak.
                // (17) Sonrasında da bu Main classtan çağrılacaktır...
    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + " 'ın alanı " + (kenar * kenar) + " 'dir.");

    }
}
