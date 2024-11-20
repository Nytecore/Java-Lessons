import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {
    private Semaphore sem = new Semaphore(3);
        // Yukarıdaki yapı, semaphore oluşumudur. Parantez içi, aynı anda kaç tane
            // thread'in girmesine izin vereceğimizi belirler.


    public void threadFonksiyonu(int id) {

        try {
            sem.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            /* Yukarıdaki .acquire() metodu şunu kontrol eder; bu değerimiz 0 ise
            biz alt tarafa giremeyeceğiz ancak 0 değilse daha büyük bir değer ise
            aşağıya geçebileceğini ifade eder. Bu değer, yukarıda oluşturulan
            semaphore içerisinde (permits: 3) ifadesine bakıyor. İzin verilen thread
            sayısı kadar alt alta thread okuyor ve 3 ise, altta yazılan kodlardan
            görerek 1 thread'in girmesine izin veriyor, ve değer 2 oluyor. Tekrar
            bir değerin girmesine izin veriyor ta ki sıfırlanana kadar o bloğa thread
            alıyor ve sıfırlanınca başka bir thread gelip buranın 0 olduğunu gördüğünde
            içeriye giremiyor yani oradan sonraki threadler o bloğa giremiyor.  */

        System.out.println("ID: " + id + " Thread başlıyor..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("ID: " + id + " Thread çıkıyor ve blok sonlanıyor.");
        sem.release();
            /* .release() metodu ise semaphore'umuzun değeri 0 ise bu değeri 1 artırır
            yani işi biten thread çıktıkran sonra sıradaki threadler çalışsın diye iç-
            eri almak için yer açıldığını threadlere gösterir. Yani bu bloğu bırakır ve
            başka threadler girsin diye bloğun değerini de 1 artırır.*/




    }
}
