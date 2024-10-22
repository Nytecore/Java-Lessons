import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
        Queue(Kuyruk) Interface'ini implemente eden LinkedList classı F.I.F.O. mantığıyla çalışır.
        * add (eleman) ---> Elemanı kuyruğa ekler, ekleyemezse hata fırlatır.
        * offer (eleman) ---> Elemanı kuyruğa ekler. Eklerse true, ekleyemezse false döner.
        * remove() ---> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır.
        * poll() ---> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
        * element() ---> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa hata fırlatır.
        * peek() ---> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa null referans döner.        */

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        queue.offer("Go");

            // (1) Yukarıda LinkedList sınıfından bir Queue oluşturuldu ve elemanlar eklendi.

            // (2) Queue bastıralım:
        System.out.println("\n[Queue elemanları bastırılıyor]\n");
        for (String s : queue) {
            System.out.println(s);
        }

            // (3) Queue'nin en başındaki elemanı almak isteyelim:
        System.out.println("\nQueue en baştaki elemanı: " + queue.peek());

            // (4) Queue'nin en başındaki elemanı nasıl atarız? :
        System.out.println("Queue en baştaki elemanı atalım: " + queue.poll() + " (atıldı)");

            // (5) Queue'nin boş olup olmadığını kontrol edelim:
        System.out.println("Queue boş mu? : " + queue.isEmpty() + " (boş değil)");
                // Boşsa true - doluysa false döner.

            // (6) Aşağıda bir döngü yapalım. Bu döngü queue dolu olduğu sürece en baştaki
                // (6) elemanı silsin ve eleman kalmayana dek bu döngü devam etsin.
        System.out.println("\nDöngü ile tek tek eleman çıkarma : ");
        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor : " + queue.poll());
        }
    }
}
