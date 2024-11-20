import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrn {

    /* ReentrantLock, synchronized kod bloklarına alternatif olarak geliştirilmiştir.
    Synchronized kod bloklarına oldukça benzerdirler.   */

    private int say;
    private Lock lock = new ReentrantLock();
        // Yukarıdaki şekilde yaparak lock objesi, Lock interface'inin ReentrantLock classından
            // oluşturulur ve "lock" referansı atanır.
    private Condition condition = lock.newCondition();

    public void artir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }

    public void thread1Fonksiyonu () {
        lock.lock();
            // Bu şekilde burayı kilitlemiş oluruz. Yani bu anahtar
                // bizde başka kimse giremez diyoruz. Ne zamana kadar ?

        System.out.println("Thread 1 çalışıyor..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread 1 uyudu ve uyandırılmayı bekliyor...");

        try {
            condition.await();
                // Buradaki await, ".wait()" metodu ile aynı işlevi yapar.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        artir();

            lock.unlock();
            // lock.unlock() yapana kadar orası kilitli kalır. unlock edilince
                // kilidi açılır ve başka bir thread de oraya erişebilir demektir.

    }

    public void thread2Fonksiyonu() {

        /*
        try {
            artir();
        } finally {
            lock.unlock();
        }

        Burada try ve finally içerisine kodu yazmamızın sebebi şudur;
        eğer burada bir exception meydana gelirse, biz bu exceptionu
        önleyeceğimiz için önleme işleminden sonra da lock.unlock();
        metodunu yazamayacağımız için catch bloğu içerisine alamayız bu
        yüzden de biz orada finally kod bloğu kullanırız. Bunun sebebi,
        exception olsa da olmasa da ne olursa olsun kod bloğunun en az
        1 kez finally bloğunu çalıştırmasıdır. Program exceptionu görür
        sonrasında finally bloğunu da çalıştırır ve orada, exceptionun
        olduğu yeri kapatarak önlemiş olur ve bu sayede kodlamamız daha
        gücenli bir şekilde yazılmış olur.      */

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);

        lock.lock();

        System.out.println("Thread 2  çalışıyor...");
        artir();

        System.out.print("Devam etmek için bir tuşa basın: ");
        scanner.nextLine();

        condition.signal();
            // uyandırma fonksiyonu gibi düşünülebilir. Bu metod sayesinde
                // "Bizim işimiz bitti, sen artık uyanabilirsin" demiş oluruz.

        System.out.println("Thread 1 uyandırıldı ve işlemine devam ediyor...");

        /*
                .wait()   -----> .await()
                .notify() -----> .signal()                  */


        lock.unlock();
    }

    public void threadOver() {
        System.out.println("Say değişkeni değeri: " + say);

    }
}
