import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Sys_kullanici = "username";
        String Sys_Parola = "pass";

        int GirisHakki = 3;

        System.out.println("\n***************************");
        System.out.println("\t\tHOŞGELDİNİZ");
        System.out.println("***************************");

        while (true) {
            System.out.print("\nE-posta Giriniz : ");
            String kullanici = scanner.nextLine();
            System.out.print("Parolayı Giriniz : ");
            String parola = scanner.nextLine();

            if (kullanici.equals(Sys_kullanici) && parola.equals(Sys_Parola)) {
                System.out.println("\nGiriş başarılı. Hoşgeldin " + Sys_kullanici);
                break;
            } else if (kullanici.equals(Sys_kullanici) && !parola.equals(Sys_Parola)) {
                GirisHakki -= 1;
                System.out.println("Şifre yanlış girildi...");
                System.out.println("Giriş Hakkı : " + GirisHakki);
            } else if (!kullanici.equals(Sys_kullanici) && parola.equals(Sys_Parola)) {
                GirisHakki -= 1;
                System.out.println("E-Posta yanlış girildi...");
                System.out.println("Giriş Hakkı : " + GirisHakki);
            } else {
                GirisHakki -= 1;
                System.out.println("E-posta ve şifre yanlış girildi...");
                System.out.println("Giriş Hakkı : " + GirisHakki);
            }
            if (GirisHakki == 0) {
                System.out.println("Giriş hakkı kalmadı, sistem bloke edildi...");
                break;
            }
        }
    }
}

