public class Main {
    public static void main(String[] args) {

        /* Bu derste synchronized metod kullanmanın belli başlı
        sıkıntılarından bahsedeceğiz ve bu sıkıntıyı birden fazla
        lock kullanarak nasıl çözeriz bunu anlayacağız...   */

        ListWorker worker = new ListWorker();
        worker.calistir();

       /* long baslangic = System.currentTimeMillis();

        worker.degerAta();

        long bitis = System.currentTimeMillis();

        System.out.println("Geçen süre: " + (bitis-baslangic)); */




    }
}
