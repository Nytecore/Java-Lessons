import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {

    Random random = new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<Integer>();

    private int limit = 10;
        // LinkedList'imizin boyu 10'u geçmediği sürece biz işlemlerimize devam edeceğiz..
            // 10 olunca producer'i bloklamış olacağız.

    public void produce () {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                if (queue.size() == limit) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("---> Producer üretiyor : " + value);
                lock.notify();
            }
        }
    }
    public void consume () {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                if (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = queue.poll();
                System.out.println("<--- Consumer tüketiyor: " + value);
                System.out.println("Queue size: " + queue.size());
                lock.notify();
            }
        }
    }
}