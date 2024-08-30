public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM ();
        Hesap hesap = new Hesap ("borayldrm","12345",2000);

        atm.working(hesap);
        System.out.println("\nLogout your ATM program... ");
    }
}
