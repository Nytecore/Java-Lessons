import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();

    public void thread1Fonksiyonu () {


        synchronized (lock) {
            // Herhangi bir lock tanımlamak yerine bu lock'u biz bu objenin
                // Üzerinde yapacağımızı "this" anahtar kelimesi ile belirtiriz.

            System.out.println("Thread 1 çalışıyor.");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1 uyutuldu..");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1, Thread 2 'nin kendisini uyandırmasını bekliyor...");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                lock.wait();
                /* Bu işlem: "Burada wait yapacağım, yani anahtarı teslim edeceğim.
                Başka birisi beni uyandırana kadar ben burdan ileri gidemeyeceğim"
                Şeklinde bir komut verdirtmiş oluruz...     */

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1 uyandı, işlerine kaldığı yerden devam ediyor...");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1 işini bitirdi..");


        }
    }

    public void thread2Fonksiyonu () {

        Scanner scanner = new Scanner(System.in);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (lock) {
            System.out.println("Thread 2 çalışıyor...");
            System.out.println("Thread 1'i uyandırmak için bir tuşa basın.");
            scanner.nextLine();

            lock.notify();
                /* Burada biz thread'i uyandırıyoruz fakat thread2'nin işi bitene kadar diğer thread
                   yani thread1 yine de devam edemeyecek. Yani thread2 içerisinde yazılan thread1'i
                   uyandırma metodu, thread 1'i uyandıracak fakat yine de thread2'nin, o bloğu tamamen
                   bitirmesi beklenecek ve sonrasında thread 1 çalışmaya başlayacak.    */



            System.out.println("Thread 1 uyandırıldı. Thread 2 'nin işi bitirmesi bekleniyor..");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 2 işini bitirdi.");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
    }
}
