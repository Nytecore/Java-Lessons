import java.util.Scanner;

public class Login {
            // Create Login class for firstly login the system.

    public boolean login (Register register) {
        Scanner scanner = new Scanner (System.in);

        String user_name;
        String passworld;

        System.out.print("\nEnter your username : ");
        user_name = scanner.nextLine();

        System.out.print("Enter your password : ");
        passworld = scanner.nextLine();

        if (register.getUser_name().equals(user_name) && register.getPassword().equals(passworld)) {
            return true;

        }

        else {
            return false;
        }
    }
}