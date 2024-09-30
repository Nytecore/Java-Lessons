public class Main {     // (1) Outher Class oluşturuldu.

    public static void main(String[] args) {

        // L.i.c'ları "public class Alan" ya da "public static class Alan" şeklinde oluşturamayız.
        class Alan {    // (2) Burada bir Local Inner Class oluşturuldu.
                        // (2) Local inner class oluşturulurken hiç bir şekilde içerisinde
                        // (2) public - static gibi kavramlar içermezler. Hata verir.

             public void daire_alani (int yaricap) {    // (3) Yine daire alanı hesaplaması
                                                        // (3) yaptıracak bir metod oluşturuldu.

                 System.out.println("Dairenin alanı = " + yaricap * yaricap * Math.PI);     // İşlemler burada.

             }
        }

        Alan alan = new Alan ();        // (4) Burada görüldüğü gibi normak obje oluşturur gibi bir obje oluşturuldu.
                                        // (4) Bu obje, Local Inner Class'a bağlı bir objedir.

        Alan alan2 = new Alan ();       // (6) Burada yine aynı metoddan başka bir obje daha oluşturuldu.
                                        // (6) Yine normal obje oluşturur gibi basit şekilde oluşturuldu.

        alan.daire_alani(10);   // (5) Çağırmak için de yine obje referansu kullanıldı.
        alan2.daire_alani(3);   // (7) Çağırmak için yine obje referansu kullanıldı.


        /*
        Bunun ne avantajı var ? Biz projemizde, sadece o class içerisinde bir obje oluşturmak istersek
        başka bir class ya da dosya oluşturmadan direkt olarak mevcut dosyanın içerisinde oluşturabilir
        ve basitçe bunu yapabiliriz. Bunun için Local Inner Class'lar kullanışlıdırlar. Bu tarz oluşumda
        herhangi ekstra bir classın içerisinde ayrı olarak oluşturup onu ayrıca almaya hiç gerek kalmaz.
         */

    }

    public static void ornek_deneme() {     // (8) Burada, Local Inner Class'ı denemek için bir metod oluşturuldu.

        // Alan alan3 = new Alan();     -------->> L.i.c'daki metod referans ile çağrılmak istendi FAKAT!

        /*      ------  Önemli  ------
        İşte bu şekilde bir metod oluşturup buradaki metodda, L.i.c metodda yaratılan objeyi
        kullanmaya çalışırsak bize hata verecek ve biz onu kullanamayacağız. Bunun sebebi
        Local Inner Class içerisinde oluşturulan metodlar sadece ve sadece main mettodda
        kullanılmaya özgü olurlar ve başka metodlara referans vereremez olmalarıdır...
         */


        // (L.i.c) ----> Local Inner Class
    }

}
