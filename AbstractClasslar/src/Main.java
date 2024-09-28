public class Main {

    public static void main(String[] args) {

        Kare kare1 = new Kare ("Kare" , 5);
        Daire daire1 = new Daire("Darie" , 3);

        Sekil sekil;
        sekil = new Kare("Kare2" , 6);
            /*
            Yukarıda olduğu gibi Sekil classından sekil referansı atanıp, onu da sekil referansundan
            bir obje gibi "new Kare" şeklinde bir oluşum ile abstract classlar referans gösterilerek
            obje oluşturulabilir. Bu da bir başka örnektir.
             */

            // Aşağıda da oluşturulan metodların çağrımı yapılmıştır.
        kare1.alan_hesapla();
        daire1.alan_hesapla();

        sekil.alan_hesapla();

        kare1.cevre_hesapla();
        // sekil.cevre_hesapla();       ---> İşte bu şekilde obje alamadık. Sebebi, orada yer alan cevre_hesapla
        //                                   Metodu, Abstract class'da oluşturulmadı, sadece Kare Class'ında oluş
        //                                   turulduğu için "sekil.cevre_hesapla()" şeklinde kullanamayız. Onu,
        //                                   yukarıdaki gibi Kare objesi oluşturulup kare1 referansından alabiliriz.
    }
}
