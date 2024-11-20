import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockOrnegi {
    Hesap hesap1 = new Hesap();               //-----> 1. Hesap oluşturuldu.
    Hesap hesap2 = new Hesap();               //-----> 2. Hesap oluşturuldu.
    private Random random = new Random();     //-----> Random değer üretir ve transfer için gereken değer olacaktır.

    private Lock lock1 = new ReentrantLock();   //----> lock oluşturuldu.
    private Lock lock2 = new ReentrantLock();   //----> lock oluşturuldu.

    public void LocklariKontrolEt(Lock a, Lock b) {
        boolean a_elde_edildi = false;
        boolean b_elde_edildi = false;

        while (true) {
            a_elde_edildi = a.tryLock();
            b_elde_edildi = b.tryLock();

            if (a_elde_edildi == true && b_elde_edildi == true) {
                return;
                    // a ve b ayrı ayrı threadlarce elde edilmiş ve true çıkmış ise döngü durdurulur.
            }
            if (a_elde_edildi == true) {
                a.unlock();
                    // a elde edilir ve b elde edilemez ise, a fedaakarlık yapıp anahtarı bırakır.
                    // döngü sonlanmaz.
            }
            if (b_elde_edildi == true) {
                b.unlock();
                    // b elde edilir ve a elde edilemez ise, b fedakarlık yapıp anahtarı bırakır.
                    // döngü sonlanmaz.
            }
        }

    }

    public void thread1Fonksiyonu() {

        // lock1.lock();
        // lock2.lock();
        LocklariKontrolEt(lock1, lock2);
            // locklar kontrol edilecek yukarıda yazılı olan metod devreye girecek. Kontrol yapılacak
                // bu sayede DeadLock engellenmiş olacak..


        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap2,hesap1,random.nextInt(100));

        }
        lock1.unlock();
        lock2.unlock();



    }

    public void thread2Fonksiyonu() {

        // lock1.lock();
        // lock2.lock();
        LocklariKontrolEt(lock1, lock2);
            // locklar kontrol edilecek yukarıda yazılı olan metod devreye girecek. Kontrol yapılacak
                // bu sayede DeadLock engellenmiş olacak..

        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap1,hesap2,random.nextInt(100));

        }
        lock1.unlock();
        lock2.unlock();


        /*
        Yukarıdaki metotta, thread1Fonksiyonu() metodundadki gibi değil de tam tersi olarak
        ilk önce lock2.lock sonra lock1.lock metodlarını gitdik böyle olunca da java, çalışma
        esnasında (HER ZAMAN OLMAZ) anahtarlardan birini thread1'e diğerini de thread2'ye
        verir ve iki anahtar da farklı iki threadda kaldığı için threadlar anahtarı bırakamaz
        böyle olunca da DeadLock oluşur ve program loopa girer. Fakat bu dediğim gibi her zaman
        olmaz. Bekli 1000 denemenin birinde olur, bunun sebebi de threadlerin çalışması işletim
        sistemi ve JDK'ya bağlı olduğu için, bunlar anahtarın her ikisini de her zaman teslim
        etmezler, anahtarlardan biri dahi teslim edilmediğinde, program normal olarak çalışmaya
        devam edecektir, çünkü anahtarın biri teslim edildiği için örneğin thread işini bitirip
        diğer anahtar boşta olduğundan elindekini bırakıp boşta olanı alacaktır bu yüzden de
        DeadLock her seferinde oluşmayabilir...

        Bunu çözmek için ise, ReentraintLock içerisindeki bir başka metod olan .tryLock()
        metodunu klulanırız. Bu tryLock, lock'u dener ve lock'u kimse almamışsa; o lock'un
        dönen değeri "true" olur. Eğer alınmışsa da "false" değer döner. tryLock "true"
        durumunda anahtarı alabilir ve kullanır. Alamazsa diğer anahtarı dener, o "true"
        olursa da onu alıp kullanmaya başlayacaktır. Bu sayede DeadLock çözülmüş olur...
         */






    }

    public void threadOver() {
        System.out.println("Hesap 1 bakiye: " + hesap1.getBakiye() + "\nHesap 2 bakiye: " + hesap2.getBakiye());
        System.out.println("Toplam bakiye: " + (hesap1.getBakiye() + hesap2.getBakiye()));

    }
}
