public class Main {     // Main class

    public static void main(String[] args) {


            // Öncelikle objeler diğer classlardan çağırıldı (OOP) ve belirlenen özellikleri için değerler oluşturuldu.
        Tofas tofas = new Tofas("Tofaş" , "Doğan SLX" , "Beyaz" , "1.6" , "LPG", 4, "Yok" , "VAR" , 3 , 2 , 480000);
        Audi audi = new Audi("Audi" , "A6" , "Daytona Gri" , "2.0 Quattro" , "TDI" , 4 , "Var" , 2019 , "59.480" , 3700000);



        System.out.println("\n");

            // Subclass'dan (Audi) bilgiler çağırıldı.
        audi.bilgileriGoster();
        System.out.println("\n");

            // Subclassda (Audi) yazılan hikâyelerden biri çağırıldı.
        audi.arizaYap();
        System.out.println("\n");

            // Subclassda (Audi) yazılan hikâyelerden başka biri çağırıldı.
        audi.masraf(30000);
        System.out.println("\n");

            // Subclassda (Audi) yazılan hikâyelerden bir başkası daha çağırıldı.
        audi.degerKaybi();



        System.out.println("\n");

            // Subclass'dan (Tofas) bilgiler çağırıldı.
        tofas.bilgileriGoster();
        System.out.println("\n");

            // Subclassda (Tofas) yazılan hikâyelerden biri çağırıldı.
        tofas.kazaYap();
        System.out.println("\n");

            // Subclassda (Tofas) yazılan hikâyelerden başka biri çağırıldı.
        tofas.kazaBilgileri();
        System.out.println("\n");

            // Subclassda (Tofas) yazılan hikâyelerden bir başkası daha çağırıldı.
        tofas.cezaYe(6000);
        System.out.println("\n");

            // Subclassda (Tofas) yazılan hikâyelerden bir başkası daha çağırıldı.
        tofas.degerKaybi(200000);

    }
}