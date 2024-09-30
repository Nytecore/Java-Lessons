public class Main {

    public static void main(String[] args) {    // (1) main method oluşturuldu.


                // INTERFACE -----------


        IOgrenci iOgrenci = new IOgrenci() {
            /* (5) main method içerisine, interface içerisinde oluşturulan
                                                   (5) özellikleri çağırabileceğimiz bir obje eklenmek istendi.
                                                   (5) Obje eklendiğinde kendiliğinden 2 özelliği de implement
                                                   (5) eden (override gibi) durumlar aşağıda ortaya çıktı.     */
            @Override
            public void ders_calis() {
                System.out.println("Ders çalışıyorum...");  // (6) Yapmasını istediğimiz durum implemente eklendi.
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum...");   // (6) Yapmasını istediğimiz durum implemente eklendi.
            }
        };


        System.out.println("\n------------  INTERFACE İLE TANIMLANANA GEÇİYORUZ  -------------");

        iOgrenci.ders_calis();
        iOgrenci.derse_gir();       // (7) Sonrasında da main methoddan bu durumlar, referans alarak çağırıldı.

         /*
        Konu şudur, öncelikle bir interface oluşturulup ya da abstract class oluşturulup
        ordadaki özellikler objelendirilmek ve main class / main methodda çağrılmak iste-
        nirse yukarıdaki işlemler yapılarak main method içerisine obje gönderilip orada
        yer alan "ders_calis" ve "derse_gir" gibi interface methodlar çağrılabilirler.

        İşte bu duruma Anonim Inner Class (A.I.C) denir. Java'da çok işe yaramazlar evet,
        fakat android geliştirme, Kotlin gibi dillerde çok sık kullanılırlar.
         */


        System.out.println("\n------------  ABSTRACT CLASS İLE TANIMLANANA GEÇİYORUZ  -------------");


                // ABSTRACT ----------


        AOgrenci aOgrenci = new AOgrenci("Bora" , 291) {
                // (12) Burada abstract class'dan "aOgrenci" adında bir obje tanımladık.
                    // (19) abstract classa sonradan özellik eklediğimiz ve constructor oluşturduğumuz için
                        // (20) oluşturulan obje içine de atamalarımızı yapmamız gerekti. Atamalar da yapıldı...


            @Override
            void kayit_yaptir() {               // (13) Tanımlanan objeden sonra Implement işlemini yaptık.
                System.out.println("Kayıt yapılıyor....");

                    // (21) Tanımlanan güncel objeden şu şekilde bir çıktı da alınabilir.
                System.out.println(getIsim() + " ismi ve " + getNumara() + " numarası ile kayıt yapılıyor...");

            }

        };

        aOgrenci.selamla();             // (15) çağırıldı.
        aOgrenci.kayit_yaptir();        // (14) Burada da main methodda, oluşturulmuş olan methodlar


        /*
        Konu şudur, abstract class'dan da yine Anonim Inner Class (A.I.C) oluşturulabilir.
        Java'da çok işe yaramazlar evet, fakat android geliştirme, Kotlin gibi dillerde çok
        sık kullanılırlar.
         */

    }
}