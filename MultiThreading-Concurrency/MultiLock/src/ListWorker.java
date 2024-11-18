import java.util.ArrayList;
import java.util.Random;

public class ListWorker {

    Random random = new Random();
    // random değerler üretmemizi sağlayan bir class oluşturduk. Kullanacağız..

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    //***********************************************************************************************************

        /* Normalde aşağıdaki kod bloğunda yapılan işlemde, list1 ve list2 miz, 2000 değerine ulaşmaya
        çalışıyor. Bu değerleri thread1 ve thread2 içlerine göngü ile atamalarını yapıyor. Fakat
        atamalar esnasında bir kaçak oluyor, listlerden en az biri tamamen 2000 değerine ulaşamıyor.
        Bu durumda normalde biz synchronized anahtar kelimesi kullanarak bu sorunu çözebiliyoruz.
        FAKAT: bizim 2 saniyede yapacağımız süre iki katına çıkarak 5 saniyeye çıkıyor. Süre çok fazla
        uzuyor. İki tane list paketimiz olsun. Konuda bir anahtar üretilir. (lock) Thread1 anahtarı alır
        list1'e değer ekler sonra tekrar gider list2'ye değer ekler sınrasında anahtarı thread2'ye verir.
        Bu sefer bu işlemi list2 yapar ve bu işlemler yapılırken çalışmayan thread, yanda diğerinin işini
        bitirmesini bekler. Bu işi çözmenin de bir yolu vardır. Bir anahtar daha yaparak iki ayrı threadi
        aynı anda çalıştırabilmemiz mümkündür. Bu sefer thread1 anahtarı alacak, list1'e gidip değeri ekle
        yecek sonra anahtarı bırakıp diğer anahtar ile list2'ye gidip oraya değer ekleyecek. Az önce
        thread1'in bıraktığı anahtarı thread2 alacak ve thread1, list2'ye giderken thread2 de list1'e
        giderek değeri ekleyecek. Yani senkron bir şekilde iki thread ded çalışmış olacak. Bu sayede de
        zamandan yarı yarıya tasrruf etmiş olacağız ve değer kayıplarımız da olmamış olacak. Bunu
        aşağıda, "synchronized" anahtar kelimesi kullanarak oluşturulan metod ile çözeceğiz..       */


        /* Aşağıda yapılan işlemde Object classıdnan iki obje oluşturulacak. Bunlar lock1 ve lock2 olacak
        Daha sonra da bu locklar, List1 ve List2'ye değer eklenen bloklar içerisinde ayrıca synchronized
        bloğu olarak oluşturulup içerisine anahtar olarak eklenecek ve o lock, sadece o liste özgü olacak.
        Örnek:

        synchronized(lock1) {
        .
        .                               ----> Synchronized kod bloğuna lock1 atanarak oluşturuldu ve
        .                                     kodlamalar bloğun içerisine yazılmış oldu.
        .
        }

        Bu sayede de direkt olarak list1DegerEkle ve list2DegerEkle metodları, synchronized anahtar kelimesi
        ile yazılmamış fakat içerisi synchronized kod bloğu içerisinde oluşturulmuş oldu. Bu sayede de içine
        "lock1" anahtarını eklemiş olduk. Bu sayede de hem listlerimizde kayıp olmuyor, her biri 2000 değerine
        ulaşabiliyor, hem de süremiz yarıya inmiş oluyor.    */

    //**********************************************************************************************************

    private Object lock1 = new Object();
    private Object lock2 = new Object();
        // lock1 ve lock2 oluşturuldu.Biz lock1'i list1'e özgü, 2-2'ye özgü yazmamız gerekiyor.
            // list1DegerEkle ve list2DegerEkle'ye gidelim....  --->

    public void list1DegerEkle() {

        synchronized (lock1) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list1.add(random.nextInt(100));
            // 0 ile 100 arasında list1'e random değer atar.

        }
    }

    public void list2DegerEkle() {

        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list2.add(random.nextInt(100));
            // 0 ile 100 arasında list1'e random değer atar.
        }
    }

    public void degerAta() {

        for (int i = 0; i < 1000; i++) {
            list1DegerEkle();
            list2DegerEkle();
        }
    }

    public void calistir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });

        long baslangic = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("List1 Size: " + list1.size() + " List2 Size: " + list2.size());

        long bitis = System.currentTimeMillis();
        System.out.println("Geçen süre: " + (bitis - baslangic));


    }
}
