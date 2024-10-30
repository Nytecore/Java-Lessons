public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nSabiha Gökçen Havalimanına Hoşgeldiniz....");
        String sartlar = "\t\t  ---- Yurtdışı Çıkış Kuralları ----" +
                "\nHerhangi bir siyasi yasağınızın bulunmaması gerekiyor." +
                "\n15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor." +
                "\nGideceğiniz ülkeye vizenizin bulunması gerekiyor.";

        System.out.println("\n*******************************************************");
        System.out.println(sartlar);
        System.out.println("*******************************************************\n");

        while(true) {

            Yolcu yolcu = new Yolcu();
            System.out.println("\nHarç Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000);

            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("\nSiyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);

            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("\nVize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);

            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }
            Thread.sleep(3000);
            System.out.println("\nİşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;

        }
    }
}