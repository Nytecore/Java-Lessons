import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    private boolean bilet;

    public Yolcu() {
        Scanner scanner = new Scanner (System.in);

        System.out.print("\nYatırdığınız harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nHerhangi bir siyasi yasağınız bulunuyor mu? (evet / hayır) : ");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        } else if (cevap.equals("hayır")) {
            this.siyasiYasak = false;
        } else {
            System.out.println("Geçersiz cevap girildi.");
        }

        System.out.print("\nVizeniz bunuyor mu? (evey / hayır) : ");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        } else if (cevap2.equals("hayır")) {
            this.vizeDurumu = false;
        } else {
            System.out.println("Geçersiz cevap girildi.");
        }

        System.out.print("\nUçak biletiniz var mı ? (evet / hayır) : ");
        String cevap3 = scanner.nextLine();

        if (cevap3.equals("hayır")) {
            this.bilet = false;
        } else if (cevap3.equals("evet")) {
            this.bilet = true;
        } else {
            System.out.println("Geçersiz cevap girildi.");
        }

    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın...");
            return false;
        } else {
            System.out.println("Yurtdışı harcı ödenmiştir.");
            return true;

        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor. Yurtdışına çıkamazsınız...");
            return false;
        } else {
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (vizeDurumu == true) {
            System.out.println("Vizeniz görüldü.");
            return true;
        } else {
            System.out.println("Vizeniz bulunmuyor. Yurtdışına çıkamazsınız...");
            return false;
        }

    }

    @Override
    public boolean ucakBiletiKontrol() {
        if (bilet == true) {
            System.out.println("Biletiniz görüldü.");
            return true;
        } else {
            System.out.println("Uçak biletiniz bulunmuyor. Yurtdışına çıkamazsınız...");
            return false;
        }

    }
}