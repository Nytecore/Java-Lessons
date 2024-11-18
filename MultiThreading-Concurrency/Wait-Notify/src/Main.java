public class Main {
    public static void main(String[] args) {

        /* Normalde synchronized yapılarında gördüğümüz lock olayını biliyoruz. Bu lock
        durumu thread1'e eklendiğinde bu thread1, normalde o bloktaki işini bitirene kadar
        lock'u teslim etmez ve işini bitirdikten sonra locku bırakarak gidip başka bir lock
        alır ve oradaki işine başlar. Normalde yapı bu şekilde kuruluyor. Fakat biz eğer
        istersek, bazı durumlarda thread1'in işi bitmeden, lock'u teslim etmesini isteyebiliriz.
        Bu işlemleri gerçekleştirmek için synchronized kod bloklarında kullanılabilen ".wait()"
        ve ".notify()" metodlarını kullanabiliriz. Peki  bunu nasıl yaparız ----------->>>     */

        WaitNotify wn = new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread1Fonksiyonu();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread2Fonksiyonu();
            }
        });

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}
