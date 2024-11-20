import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Bu derste thread'leri yarıda kesmeyi göreceğiz. Şimdiye kadar hep
        "InterruptedException" şeklinde bir Exception gördük ancak bunun hangi
        durumlarda oluşacağını görmedik. Bu derste bunu göreceğiz.       */


        List<Integer> list = new LinkedList<Integer>();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");

                for (int i = 0; i < 10000000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        /* Burada thread'ın interrupta uğrayıp uğramadığını kontol ediyoruz. Eğer
                        threadde her hangi bir interrupt olmuşsa .isInterrupted() metodu, true
                        değer dönecek ancak her hangi bir interrupt olmadıysa false değer dönecek.
                        Burada bir interrupt olup olmadığı kontrol edilir. Thread'imiz interrupt
                        olmuşsa biz bu run metodunu sonlandıracağız..       */

                        System.out.println("Thread kesintiye uğradı, program sonlandırılıyor...");
                        return;
                    }
                    list.add(i);
                }
                System.out.println("Thread kesintiye uğramadan işini bitirdi.");

                /* for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread yazıyor " + i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun " + i + ". saniyesindeyim.");
                    } catch (InterruptedException e) {      //-----> Interrupted Exception geldi...
                        System.out.println("---- Uykum bölündü ----");;

                            InterruptedException 2 türlü oluşabilir. Ya thread'imizi bilgisayarımız
                            kendisi yarıda kesiyor ya da sonlandırıyordur, ya da programcı thread'i
                            belli bir saniye interrupta uğratmak yani yarıda kesmek isteyebilir.
                            Mesela burad Thread.sleep 'in içinde 1 saniye bekletiyoruz ancak tam bir
                            saniye olunca yani uyuyunca bir interrupt gelirse, bu threadimiz bizim
                            InterruptedException 'a girecektir.
                            NOT: Interrupt bir thread'in çalışmasını bitirmezler. Sacede o thread 'i
                            yarıda keser. Mesela thread uyuyorsa uyandırır ya da thread belirli bir
                            yerde bekliyorsa, thread 'i beklediği yerden çıkarır. Bu Interrupt 'ımız
                            değişik yollarla oluşabilir.

                    }
                } */
            }
        });

        // Peki bu Interrupt 'ı kendimiz nasıl yaparız ??

        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t.interrupt();      //-----> .interrupt() metodu ile thread 'imizi yarıda keseceğimizi söylüyoruz.
    }
}
