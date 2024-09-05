import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Login login = new Login();
        Register register = new Register();

        String username;
        String password;
        String password_again;
        String choose;
        String choose_2;

        System.out.println("\n***********************************************");
        System.out.println("\tREGISTER OR SIGN IN THE 'TEST' PROGRAM");
        System.out.println("***********************************************");

        String options =
                "\nPress '1' for register" +
                        "\nPress '2' for sing-up" +
                        "\nPress 'q' for exit";

        System.out.println(options);

        while (true) {
            System.out.print("\nMake a keystroke : ");
            choose = scanner.nextLine();

            if (choose.equals("q")) {
                System.out.println("Exiting the program...");
                return;

            } else if (choose.equals("2")) {
                System.out.println("Firstly you should register the program..");
                continue;

            } else if (choose.equals("1")) {

                System.out.println("\n\t----- REGISTER SCREEN -----");

                System.out.print("\nEnter Username : ");
                username = scanner.nextLine();

                while (true) {

                    System.out.print("Enter Password : ");
                    password = scanner.nextLine();

                    System.out.print("Enter Password Again : ");
                    password_again = scanner.nextLine();

                    if (!password.equals(password_again)) {
                        System.out.println("\nPasswords are not match. Try again..");
                        continue;

                    } else {
                        register.setUser_name(username);
                        register.setPassword(password);
                        System.out.println("\nRegister succesful...");
                        break;
                    }
                }
            } else {
                System.out.println("Wrong key...");
                continue;
            }

            String options_2 = "\nPress '1' for sing-up" +
                               "\nPress 'q' for exit";
            System.out.println(options_2);

            while (true) {
                System.out.print("\nMake a keystroke : ");
                choose_2 = scanner.nextLine();

                if (choose_2.equals("q")) {
                    System.out.println("Exiting the program....");
                    break;

                }
                else if (choose_2.equals("1")) {

                    System.out.println("\n\t----- LOGIN SCREEN -----");

                    if (login.login(register)) {
                        System.out.println("\nWelcome " + register.getUser_name());
                        return;
                    }

                    else {
                        int login_attemp = 3;
                        System.out.println("\nWrong username or password. Please try again... ");

                        while (true) {

                            if (login.login(register)) {
                                System.out.println("Welcome " + register.getUser_name());
                                return;
                            }
                            else {
                                System.out.println("\nLogin failed.");
                                login_attemp -= 1;
                                System.out.println("Login attemp remaining : " + login_attemp);

                                if (login_attemp == 0) {
                                    System.out.println("No more login attemp, block the program...");
                                    System.out.println("\nEXITING...");

                                }
                            }
                        }
                    }
                }

                else {
                    System.out.println("Wrong key...");

                }
            }
        }
    }
}