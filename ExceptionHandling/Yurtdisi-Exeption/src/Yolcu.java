import java.util.Scanner;



class SiyasiException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor...");
    }
}

class VizeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Gideceğiniz ülkeye vizeniz bulunmamaktadır.");
    }
}

class HarcException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Lütfen yurtdışı harcını tam yatırın...");
    }
}

public class Yolcu {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu(evet ya da hayır) ? : ");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {
            this.siyasiYasak = true;

        } else {
            this.siyasiYasak = false;

        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayır) : ");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;

        } else {
            this.vizeDurumu = false;

        }
    }

    public void yurtdisiHarciKontrol() throws HarcException, InterruptedException {
        if (this.harc < 15) {
            throw new HarcException();

        } else {
            Thread.sleep(1000);
            System.out.println("Yurtdışı harcı işlemi tamam!");

        }
    }
    public void siyasiYasakKontrol() throws SiyasiException, InterruptedException {
        if (this.siyasiYasak == true) {
            throw new SiyasiException();

        } else {
            Thread.sleep(1000);
            System.out.println("Siyasi yasağınız bulunmuyor...");

        }
    }
    public void vizeDurumuKontrol() throws VizeException, InterruptedException {
        if (this.vizeDurumu == true) {
            Thread.sleep(1000);
            System.out.println("Vize işlemleri tamam!");

        } else {
            throw new VizeException();

        }
    }
}
