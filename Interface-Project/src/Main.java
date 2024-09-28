public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n\t------ SABİHA GÖKÇEN HAVALİMANINA HOŞGELDİNİZ ------");

        String sartlar = "\t\t\t---- Yurtdışı Çıkış Kuralları ----\n\n"
                + "\t--> Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n"
                + "\t--> 15 TL Harç bedelini tam olarak yatırmanız gerekiyor.\n"
                + "\t--> Gideceğiniz ülkeye ait vizenizin bulunması gerekiyor.\n"
                + "\t--> Uçak biletinizin olması gerekiyor.";

        String message = "\n Yurtdışına çıkabilmeniz için şartlardan her birini sağlamanız gerekmektedir...";

        System.out.println("\n****************************************************************");
        System.out.println(sartlar);
        System.out.println("****************************************************************");

        while (true) {

            System.out.println("\n\t\t\t\t ---- KONTROL ALANI ----");

            Yolcu yolcu = new Yolcu();

            System.out.println("\nHarç bedeli kontrol ediliyor....");
            Thread.sleep(3000);

            if (yolcu.yurtdisiHarciKontrol() == false) {
                System.out.println(message);
                continue;

            }
            System.out.println("\nSiyasi yasak kontrol ediliyor....");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;

            }
            System.out.println("\nVize durumu kontrol ediliyor....");
            Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;

            }
            System.out.println("\nUçak biletiniz kontrol ediliyor....");
            Thread.sleep(3000);

            if (yolcu.ucakBiletiKontrol() == false) {
                System.out.println(message);
                continue;

            }
            System.out.println("\nİşlemleriniz tamamlanmıştır. Seyahatinizde iyi uçuşlar dileriz...");
            break;

        }
    }
}