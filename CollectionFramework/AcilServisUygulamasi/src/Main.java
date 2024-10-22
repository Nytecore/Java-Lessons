import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

                // Acil servis uygulaması..

            // Hastalar acil serviste şikayetlerine göre kuyrukta önlere geçecek. (Priorty Queue)

                // Apandisit  ---------> (En yüksek öncelik)
                // Yanık      ---------> (Orta öncelik)
                // Baş Ağrısı ---------> (En düşük öncelik)

        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();

        acilServis.offer(new Hasta("Murat Bey" , "Yanık"));
        acilServis.offer(new Hasta("Okan Bey" , "Baş Ağrısı"));
        acilServis.offer(new Hasta("Elif Hanım" , "Apandisit"));
        acilServis.offer(new Hasta("Oğuz Bey" , "Yanık"));
        acilServis.offer(new Hasta("Merve Hanım" , "Yanık"));
        acilServis.offer(new Hasta("Gizem Hanım" , "Apandisit"));

        int i = 1;

        while (!acilServis.isEmpty()) {
            System.out.println("********************************");
            System.out.println(i + ". sırada");
            System.out.println(acilServis.poll());
            System.out.println("********************************");
            i++;
        }

    }
}
