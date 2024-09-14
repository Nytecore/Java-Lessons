
class Hayvan {      // Superclass

        // Any feature
    private String isim;


        // Superclass Constructor
    public Hayvan(String isim) {
        this.isim = isim;
    }

        // Getter & Setter
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
        // Talking method ~~
    public String konus () {
        return "Hayvan konuşuyor...";
    }
}

class Kedi extends Hayvan {     // Subclass

        // Constructor from superclass
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" miyavlıyor...";
    }
}

class Kopek extends Hayvan {     // Subclass

        // Constructor from superclass
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor....";
    }
}

class At extends Hayvan {     // Subclass

        // Constructor from superclass
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor....";
    }
}

public class Main {     // Main (Run) Class


 /*     // Yöntem 1 :

 public static void konustur (Hayvan hayvan) {

            // Polymorphism bu şekilde de kullanılabilir.
        System.out.println(hayvan.konus());

    }

  */

    /*
    Aşağıda, belirtilen objelerin object classından olup olmadığını sorgulatıyoruz. Javada her class biz
    görmesek de object classından inherit edilir yani object classından türetilir. Inheritance kullanımı
    olmasa dahi en genel anlamda arka planda aslında object classından türemektedir. Aşağıda instanceof
    anahtar kelimesi ile biz belirlenen classların Object classından mı olduğunun sorgusunu yapıyoruz.
    Bu şekilde bir kod yazımı olmadığı halde tüm classların aslında object classından türendiğini çıktıda
    anlıyoruz. Koşullar sağlanıyor ve çıktı alınıyor...

    (Görünmeyen)Object class -->  Hayvan class -->  Kedi - Kopek - At classları şeklinde inheritance yapıldı.
     */


    public static void konustur (Object object) {

        if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());


        }
        else if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());

        }
        else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());

        }
        else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());

        }
    }
    public static void main(String[] args) {

        /*
            // Polymorphism ******
        Hayvan hayvan1 = new Kedi ("Tekir");

        Hayvan hayvan2 = new Kopek("Karabaş");

        Hayvan hayvan3 = new At("Gölge");

        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());


                // Polymorphism yukarıda "konustur" metodunda kullanıldığı gibi referans verilirse
                    // Aşağıdaki gibi de kullanılabilir. Kolay bir yoldur.
                        // Yukarıdaki uzun uzun kodları yazmamıza gerek kalmaz...

         */



        /*  // Yöntem 1 :
        konustur(new Kedi ("\nTekir"));
        konustur(new Kopek ("Karabas"));
        konustur(new At("Gölge"));
         */




        /*
                // Instanceof

        Kopek kopek = new Kopek ("Karabaş");

            if (kopek instanceof Kopek) {
                System.out.println("\nBu nesne 'Kopek' sınıfından...");
            }

            // (Yukarıda "kopek" nesnesi "Kopek" sınıfından mı) şeklinde soruldu.
                // Nesne "Kopek" sınıfından ise True değer döndürüldü ve istenen yazdırıldı.
                    // "kopek" nesnesi "Kopek" sınfından olduğundan "Bu nesne köpek sınıfından..." çıktısı alındı.

        // Şöyle de olabilirdi ;

        if (kopek instanceof Hayvan) {
            System.out.println("\nBu nesne 'Hayvan' sınıfından...");
        }

        // Bu sefer instanceof "Hayvan" yazılarak "kopek" objesinin "Hayvan" sınıf kontrolü yapıldı.
            // Biz "kopek" sınıfını da inheritence ile "Hayvan" sınıfından türettik
                // Yani "kopek" de bir "Hayvan" olduğu için değer True döndü.
                    // Değer true döndüğü için de istenen çıktı alındı : "Bu nesne 'Hayvan' sınıfından..."

         */

        Kedi kedi = new Kedi ("Tekir");
        Kopek kopek = new Kopek("Karabaş");
        At at = new At ("Şahbatur");
        Hayvan hayvan = new Hayvan ("Limon");

        konustur(kedi);
        konustur(kopek);
        konustur(at);
        konustur(hayvan);




    }
}






