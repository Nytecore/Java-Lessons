public class Ucgen extends Sekil{
        // (6) (Subclass gibi) Sekil'den miras alan bir class oluşturuldu.
            // (6) Buna göre mecburen Implement yapacağız.


        // (7) Ucgen classı için 3 kenar alabileceğimiz 3 int özellik oluşturuldu. İlerde değer verilecek.
    private int a;
    private int b;
    private int c;

        // (8) Abstract class'ın ve ekstra özelliklerin oluşturulduğu Constructor yaratıldı.
    public Ucgen(String isim, int a, int b, int c) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }


            // (9) Aşağıda implement oluşturuldu. Bu Override benzeri bir durumdur fakat oluşturmak zorundayız..
                // (9) Burada üçgenin kenarları alınarak alanının hesaplanmasını sağlayacak işlem yazılacak.
                    // (9) Sonra da main classtan bu çağrılacaktır...

    @Override
    public void alanHesapla() {
        double u = (a + b + c) / 2.0;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(getIsim() + " 'ın alanı " + alan + " 'dir.");

    }
}
