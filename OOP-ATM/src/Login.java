import java.util.Scanner;

public class Login {

    public boolean login (Hesap hesap) {

        Scanner scanner = new Scanner (System.in);

        String username;
        String password;

        System.out.print("Enter Username: ");
        username = scanner.nextLine();
        System.out.print("Enter Password: ");
        password = scanner.nextLine();

        if (hesap.getUsername().equals(username) && hesap.getPassword().equals(password)){

            return true;

        } else {

            return false;
        }
    }
}
