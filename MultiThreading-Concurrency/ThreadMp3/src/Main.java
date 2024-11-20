import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

        // Input - Output kısmında yapılan mp3 kopyalama işlemşni threadler ile daha kısa sürede yapacağız..

        private static ArrayList<Integer> icerik = new ArrayList<Integer>();

        public static void dosyaOku() {

            try {
                FileInputStream in = new FileInputStream("Multithreading-Concurrency/ThreadMp3/src/IzmirMarsi.mp3");

                int oku;
                while ((oku = in.read()) != -1) {
                    icerik.add(oku);
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void kopyala (String dosya_ismi) {

            try {
                FileOutputStream out = new FileOutputStream(dosya_ismi);

                for (int deger: icerik) {
                    out.write(deger);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    public static void main(String[] args) {

            dosyaOku();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("Multithreading-Concurrency/ThreadMp3/Kopyalanan/Kopyalanan Izmir Marsi 1.mp3");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("Multithreading-Concurrency/ThreadMp3/Kopyalanan/Kopyalanan Izmir Marsi 2.mp3");
            }
        });

        long baslangic = System.currentTimeMillis();
        System.out.println("Dosya kopyalama işlemi başlatıldı...");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long bitis = System.currentTimeMillis();

        System.out.println("Dosya kopyalama işlemi tamamlandı...");
        System.out.println("2 dosyanın kopyalanması süresi : " + (bitis-baslangic) / 1000 + " saniye.");

    }
}
