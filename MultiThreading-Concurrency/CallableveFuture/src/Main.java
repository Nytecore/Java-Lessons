import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        /* Threadlerden değer dönmemizi ve daha sonra bu değeri
        elde etmemizi sağlayan Collable  ve Future interfaceleri
        kullanımlarını öğrenmeye çalışacağız... Daha önce, thread
        lerimizi Runnable interface'inden oluşturmuştuk ve içindeki
        Run metodunu implemenete ederek threadlerimize belirli bir
        görev veriyorduk ve threadlerimiz o görevleri yapıyordu.
        Ancak biz Runnable interface'inde threadler işini bitirdikten
        sonra Run metodundan herhangi bir değer dönemiyorduk. Biz
        Collable ve Furure interface'ini kullanarak bu threadlerin
        işini bitirdikten sonra herhangi bir değer döndürmesini ve
        bu değeri almamızı sağlayabiliriz. Bunu nasıl yapacağız;
        öncekikle bir ExecutorService oluşturalım.. ----->      */

        ExecutorService executor = Executors.newFixedThreadPool(1);
                    // newFixedThreadPool = aynı anda kaç thread kullanılabilir - çalışabilir. (1)

        // Daha sonra bir thread'e bir task atayacağız. (bir işi o threade atayacağız.)
        /*executor.submit(new Runnable() {
            @Override
            public void run() {   // ---> Run methodu void bir class değer döndüremez.
                Random random = new Random();
                System.out.println("Thread çalışıyor.");

                int sure = random.nextInt(1000) + 2000;
                    // 2000-3000 arası bir sürede bu thread uyuyacak.

                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread çıkıyor...");

            }
        });     */

     // Future<Integer> future = executor.submit(new Callable<Integer>() {
        Future<Integer> future = executor.submit(new Callable<Integer>() {

            /* Dönen değeri göstermek için ise yazılan kodlama ayriyeten
            Future classında yazılır. Bu şekilde dahil edilerek referans
            yazdırma kodunun içerisine gönderilerek döndürme yapılır.   */

            /* Yukarıda "?" ile görülen yer de aslında şu anlama gelmektedir:
            Normalde Future clası bir generic metoddur. "?" işaretine gelecek
            değer Integer ise int, String iste String gibi ona göre davranır.
            Fakat burada bir de şöyle bir şey vardır. Biz oluşum içerisinde
            (new Callable<Integer>) yazdık ve burada yazılı olan "Integer"
            callable içinde olan generic durumudur ve o generic içerisine
            ne yazılırsa aslında "?" işareti yerine gelen veri tipi de o olur
            yani o oluşumda callable yanına yazılan Integer yerine String ya-
            zılsaydı, "?" string gibi, ya da ne yazılırsa o şekilde davranacak.    */

            @Override
            public Integer call() throws Exception {

                Random random = new Random();
                System.out.println("Thread çalışıyor.");

                int sure = random.nextInt(1000) + 2000;
                // 2000-3000 arası bir sürede bu thread uyuyacak.

                /* if (sure > 2500) {
                    throw new IOException("Thread çok uzun süre uyudu");
                }       */


                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread çıkıyor...");
                return sure;

            }
        });
            /* Yukarıda Callable oluşumunda yazılan "Callable<Integer>", generic bir metot
            olduğu için o şekilde yazılır. Biz oraya ne gönderirsek o metod o şekilde
            davranır. Aynı zamanda da döndürmek istediğimiz veri tipini oraya girmiş oluruz.
            Yani yukarıda Integer olarak geçen durum, integer döndürmek istediğimiz için
            o şekilde yazılmıştır.  */


        executor.shutdown();
            /* Bunu yazmazsak main metodumuz sonlanmayacaktır. .shutdown() metodu executor
            classlarında olmazsa olmaz kullanılacak olan bir metoddur. Executor metodumuzu
            durdurur ve programı sona erdirmemizi sağlar.       */

            /* Callable metodu yine bizim Runnable metodumuz gibi bir metoddur. İçerisinde
            implemente eden metod ile thread'ımıza iş verilir. Runnable metodu void bir
            metod olduğundan döndrme işlemi yapılamaz fakat bunu Callable metodu ile
            yazarsak, Callable metodunun kullandığı metod Run değil "Call" metodudur ve bu
            metot ile döndürme işlemi yapılabilir.              */


        try {
            System.out.println("Dönen değer:  " + future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e);
        }

        /* Dönen değeri yazdırmak için yazılmıştır. Dönen değer alındı ve bu task'ın işlemi
        bitene kadar buradki "future.get" bir işlem yapmaz ve direkt olarak gelecekten bir
        değer bekler yani bizim taskımız bitene kadar bizim future'ımız burda takılıp kalır.
        Task'ımız bittiği zaman direkt olarak bu future.get ile o taskımızın değerini direkt
        olarak elde ederiz - döndürürüz.    */



    }
}
