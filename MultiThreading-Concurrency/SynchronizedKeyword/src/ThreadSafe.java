public class ThreadSafe {

    /* Bu derste Synchronized anahtar kelimesini ve threadler
             ile kullanılan .join() metodunu öğreneceğiz.   */

    private int count = 0;

    public synchronized void artir() {
        count++;
    }
        // Yukarıdaki metod, threadleriCalistir metodu içerisinde for döngüsü içinde en sonda
            // olması gereken yere gidecek ve direkt metod çağrılacaktır. Fakat görüldüğü gibi
                // metodu oluştururken "synchronized" anahtar kelimesini kullandık ve bu sayede
                    // senkron problemini çözmüş olduk ve kodumuz sağlıklı çalışmış oldu.

    public void threadleriCalistir () {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    artir();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    artir();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception fırladı, kurtardık...");
        }

            /* (1) Buradaki .join() metodu = Biz bu threadleri oluşturduk,
            ama sen yine de bekle" şeklinde bir şey söylemiş oluyoruz.
            Yani thread1 ve thread2, main thread'e şunu söylüyor burda:
            "Sen bizim çalışmamızı bekleyeceksin sonra çalışacaksın." */

            /* (2) Fakat bu şekilde bir çalıştırma da bize direkt olarak 10k
            değerini vermeyebilir. Her çalıştırma esnasında farklı bir
            count değeri çıkarabilir. İşte bu threadlerdeki senkron sor-
            unundan dolayı kaynaklanmaktadır. Bunu çözmemiz gerekmektedir.  */

            /* (3) Her iki döngüde de aynı değere erişildiği için (count) ve
            bellekte count'umuzun değeri güncellenmediği için yeni değer art
            ması gerekirken değer yine 1 olarak kalmış oluyor. Bu her zaman
            bu şekilde olmaz. Senkron sorunu çıkmadan 10000 değerine yine
            ulaşabiliriz fakat genellikle senkron sorunu yaşarız.   */

            /* (4) Bunu şu şekilde çözeriz; thread1 gidip count değerini alıp
            1 artırdı ve count değerine eşitledi. (normal bir şekilde) thread2,
            thread1'in işlemi bitene kadar count'a dokunamasın şeklinde bir şey
            söylememiz gerekiyor. Yani aslında hangi thread count değerinin
            üzerinde ise diğer thread oraya dokunamasın şeklinde bir komut ver
            memiz gerekiyor. Bu sayede senkton sorununu çözmüş oluruz.  Bunun
            için bizim bir anahtar kelime kullanmamız gereklidir. Bu kelime
            "synchronized" anahtar kelimesidir. */

            /* (5) Synchronized anahtar kelimesi ve metodunun da kendi içinde
            oluşturduğu belli başlı sorunlar vardır. Bunlar nedir ve nasıl
            çözülecektir sonraki derste göreceğiz...        */




        System.out.println("Count değişkeninin değeri : " + count);

    }
    public static void main(String[] args) {
        ThreadSafe ts = new ThreadSafe();

        ts.threadleriCalistir();


    }
}
