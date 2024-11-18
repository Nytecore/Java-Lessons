public class Main {
    public static void main(String[] args) {

        Messages message = new Messages();

        Thread birinci = new Thread(new Runnable() {
            @Override
            public void run() {
                message.gonderici1();
            }
        });

        Thread ikinci = new Thread(new Runnable() {
            @Override
            public void run() {
                message.gonderici2();
            }
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        birinci.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ikinci.start();

        try {
            birinci.join();
            ikinci.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
