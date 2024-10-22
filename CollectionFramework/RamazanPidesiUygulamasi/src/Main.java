import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

            // Ramazan pidesi uygulaması yapalım...
        // Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler pideyi almaya çalışacak.

        System.out.println("\n---- RAMAZAN PİDESİ UYGULAMASI ----\n");

        Queue<String> pide_kuyrugu = new LinkedList<String>();
        Random random = new Random();
            // Queue classından bir obje oluşturuldu.
                // Aşağıda random bir numara oluşturacak metod tanımlanacak. Bunun için obje oluşturuldu.

        pide_kuyrugu.offer("Eylül");
        pide_kuyrugu.offer("Bahar");
        pide_kuyrugu.offer("Bora");
        pide_kuyrugu.offer("Kaan");
        pide_kuyrugu.offer("Özlem");
        pide_kuyrugu.offer("Mesut");
        pide_kuyrugu.offer("Bilal");
        pide_kuyrugu.offer("Salih");
        pide_kuyrugu.offer("Koray");
        pide_kuyrugu.offer("Mustafa");

                // Elemanlar eklendi.

        int pide_sayisi = 1 + random.nextInt(10);

            // Yukarıdaki oluşum, her çalıştırmada rastgele bir sayı türetecektir
                // Rastgele türeyen sayılar pide sayısı olarak düşünülecektir.
                    // 0 ile 10 arasında random (rastgele) olarak bir değer çıkacaktır.
                        // 0 ile 10 dahil olmasunu istediğimiz için "1 +" eklendi.
                            // random.nextInt(10) metodu, 10'a kadar rastgele bir sayı türetecektir.

        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayısı : " + pide_sayisi);

        System.out.println("\nPideler az sonra dağıtılacak...\n");
        Thread.sleep(3000);
            // Yukarıdaki metod ile program 3 saniye duracak, burada gerçeklik durumu yaratıldı.


        while (pide_sayisi != 0) {
            System.out.println(pide_kuyrugu.poll() + " Pideyi aldı..");
            pide_sayisi --;
            Thread.sleep(1000);
        }
            /* Yukarıdaki döngü pide sayısı sıfır olmadığı sürece çalışacaktır. Tek tek
            ilk giren sıraya göre sıradan eleman çıkaracaktır. Elemanlar bitince program
            duracaktır.
             */

        System.out.println("\nPide kalmadı...");
        Thread.sleep(1000);

    }
}
