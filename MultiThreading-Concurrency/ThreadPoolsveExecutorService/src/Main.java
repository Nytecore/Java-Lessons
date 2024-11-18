import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        /* Burada bizim 5 task'ımız olacak. Bu 5 Task'ı 5 thread'e atayacağız. İlk önce
        ikisini çalıştıracağız, diğer threadler bekleyecek. Sonra iki farklı threadi
        çalıştıracağız ve diğerleri bekleyecek en sonda da 1 thread çalışarak program
        bitecek. Bunun amacı şudur:

        Bazı büyük projelerde yüzlerce thread olabilir. Yüzlerce thread'in aynı zamanda
        çalışması programa büyük yük oluşturur ve bellekte fazlaca yer kaplanır. Bunun
        için de ihtiyacımız olan threadleri çalıştırıp olmayanları bekletebiliriz. Bunu
        daha kolay yapmak için de "Executor Service" kullanırız. Thread Pools'un olayı
        budur. Peki bunu nasıl yapacağız ?? --->>       */

        /* Thread t1 = new Thread(new Worker("1", 1));
        Thread t2 = new Thread(new Worker("2", 2));
        Thread t3 = new Thread(new Worker("3", 3));
        Thread t4 = new Thread(new Worker("4", 4));
        Thread t5 = new Thread(new Worker("5", 5));

        System.out.println("Bütün işler teslim edildi.");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

            .join() metodu, "yazılan işlem bitmeden aşağıya geçme" anlamı taşır. Yani
            yukarıdaki fonksiyondan örnekle, t1.join() ve t2.join() yazılmış. Bu şu demek
            oluyor. Önce t1 ve t2 çalışacak ve o bitmeden aşağı okumaya geçmeyecek java
            oradaki işlemler bittikten sonra aşağı inecek sonrasında t3 ve t4'ü başlatacak.

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t5.start();

        try {
            t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Bütün işler tamamlandı...");

    Bu şekilde yapılan işlemde işlemlerimiz uzun sürebilir uğraştırıcı olabilir bu işlemleri
    daha kolay bir şekilde aynı zamanda executer service ile de yapabiliriz. Nasıl ? ---->>
         */

        ExecutorService executor = Executors.newFixedThreadPool(2);

                /* Yukarıdaki oluşum (threadpool) şu anlama gelir; buradaki işlem bize bir thread
                havuzu oluşturacak. .newFixedThreadPool() metodu içine de "2" girilirse en fazla
                aynı anda 2 thread çalışabilecek şekilde havuz oluşturmuş olur ve havuzun kontrolünü
                de executer'e vermiş oluruz. Sonrasında da thread oluşturmak ve onlara iş atamak gerekir. */

        for (int i = 1; i <= 5; i++) {

            executor.submit(new Worker(String.valueOf(i), i));

            /* Bizim new Worker şeklindeki ifademiz thread'i oluşturuyor. Bu thread'e biz o anki taskı
            atıyoruz, executor o taskı ne zaman çalıştıracağını belirliyor. Yani biz executor'a; "sen
            bunları task'a ata, daha sonra da kontrolünü kendin yap" diyoruz. Burada bizim 5 task yani
            5 thread'imiz oluşacaktır. Thread havuzunda da 2 tane thread çalıştırılabileceği için
            buradaki executer .submit() ile döngü bittiğinde işlemleri çalıştırmaya çalışacak...    */
        }

        executor.shutdown();
        System.out.println("Bütün işler teslim edildi.");

            /* Biz burada işlerimizi teslim ettik. Threadlerin çalışma zamanını executor kendi belirleyecek.
            "executor.shutdown()" dediğimizde biz "başka hiçbir iş ataması yapmayacağım ve bu threadlerimizin
            işi bitene kadar executor'i kapatmayacağım. Ta ki, threadlerimizin işi bittiği zaman artık
            executor'u kapatacağım" şeklinde bir şey söylemiş oluyoruz. Bu yüzden belirli bir iş ataması
            yaptıktan sonra burada .shutdown() metodunu yazmamız gerekiyor. İşler bitince executor kendsini
            kapatmış olacak. shutdown() metodunu kullanmamız gerekiyor yoksa buradaki executor hiç bir zaman
            kapanmayacak ve işlem bitmeyecektir. */

            /* Kısaca; "executor.shutdown()" diyerek ben başka bir iş ataması yapmayacağız ve threadler işini
            bitirene kadar ben executor'u kapatmayacağım" demiş oluruz. Threadlerimiz de işini bitirdikten
            sonra executor kendini kapatmış olacaktır.  */

            /* Ancak biz threadlere 1 - 2 gün sürecek büyük işler de vermiş olabiliriz. Eğer belirli bir süre
            geçtikten sonra programımızı otomatik olarak kapatmak istiyorsak o zaman bir metod daha var onu
            kullanmamız gerekiyor. Bu metod "executor.awaitTermination("..", TimeUnit.DAYS);" metodudur.
            Bu şu anlama gelir; biz burda belirli bir süre bekleriz demek oluyor. Metod içerisi "1" ise ve
            TimeUnit.DAYS ise --> biz burada "ben bu işlemin bitmesini en fazla 1 gün beklerim" demiş oluyoruz.
            Threadlerimizim çalışması 1 günü geçerse, bu sayede biz kontrol altına almış oluruz. Herhangi bir
            deadlock durumunda ya da threadlerdeki sıkışma durumunda güvenlik ya da fazla beklememe açısından
            çok önemlidir.      */

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Kısaca burada threadlerin çalışması bitmese bile biz 1 gün sonunda bunu kapatacağımızı belirtmiş olduk.

        System.out.println("Bütün işler bitti.");


    }
}
