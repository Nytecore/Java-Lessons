import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Messages {

    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<Integer>();
    Random random = new Random();

    private int limit = 1;

    public void gonderici1 () {
        while (true) {
            try {
                Thread.sleep(2000);
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
                System.out.println("1. Gönderici bir mesaj gönderdi: " + value);
                queue.offer(value);
                lock.notify();
            }
        }
    }

    public void gonderici2 () {
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
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("2. Gönderici bir mesaj gönderdi: " + value);
                lock.notify();

            }
        }
    }
}
