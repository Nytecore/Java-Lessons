public abstract class Sekil {
        /* ABSTRACT CLASS OLUŞTURULDU. Abstract class, Inheritance'a benzer. Yine başka bir
        Classa miras verir gibi "extends Sekil" şeklinde yazılır fakat farklılıkları vardır.
         */


    private String isim;
        // Inheritance ve Interface benzeri bir yapıya sahip olacak. Bu yüzden özellik tanımlanabilir.

    public Sekil(String isim) {
        this.isim = isim;
    }
            // Constructor oluşturuldu.

    public void ismini_soyle () {
        System.out.println("Bu obje " + isim + " objesidir.");

    }
            // Rastgele bir metod oluşturuldu.

    abstract void alan_hesapla ();
            /* Burada bir "Abstract" metod oluşturuldu. Bu metodun farkı, Inheritance
            konusunda oluşturulan superclass constructor'ı gibi düşünülebilir. Orada
            Superclass içerisinde oluşturulan constructor, subclassda direkt olarak
            override edilirdi, ya da edilmezdi istenildiği gibi yapılabilirdi. Burada
            fark şu, abstract metod oluşturulduğunda, başka bir class abstract classdan
            miras alacak ise MUTLAKA AMA MUTLAKA buradaki ebstract metodu kendi classına
            göre yazmak zorundadır. Yani birinde (Inherıtance - Superclass/Constructor)
            yazılabilir ya da yazılmayabilir, diğerinde (abstract) oluşturulan abstract
            method mutlaka etkilenen classta yazılmak zorundadır.
             */


            // Getter & Setter oluşturuldu.

    public String getIsim() {                   // Getter
        return isim;
    }

    public void setIsim(String isim) {          // Setter
        this.isim = isim;
    }
}