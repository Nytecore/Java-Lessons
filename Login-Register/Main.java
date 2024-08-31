import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Login login = new Login();
            Register register = new Register();

            Scanner scanner = new Scanner (System.in);

            String username;
            String password;
            String password_again;
            String choose;

            System.out.println("\n******************************");
            System.out.println("\tWELCOME TO TEST SERVER");
            System.out.println("******************************");

            System.out.println("\nYou should to login the system.");

            String options = "\nPress '1' for register" +
                             "\nPress 'q' for exit";

            System.out.println(options);

            while (true) {

                System.out.print("\nEnter your choose : ");
                choose = scanner.nextLine();

                if (choose.equals("q")) {
                    System.out.println("Exiting the test system....");
                    return;

                } else if (choose.equals("1")) {

                    System.out.println("\n---- Register Account ----");

                    System.out.print("\nEnter Username : ");
                    username = scanner.nextLine();
                    register.setUser_name(username);


                    while (true) {

                        System.out.print("Enter Password : ");
                        password = scanner.nextLine();

                        System.out.print("Enter Password Again : ");
                        password_again = scanner.nextLine();

                        if (password.equals(password_again) ) {
                            System.out.println("\nRegister Success.");
                            register.setPassword(password);
                            break;

                        } else {
                            System.out.println("\nThe two passwords do not match.");
                        }
                    }
                }

                else {
                    System.out.println("Incorrect choose.");
                    continue;
                }

                break;
            }

        System.out.println("\n-------------------------------------------");
            System.out.println("\tDo you want to login your account ?");
        System.out.println("-------------------------------------------");


        while (true) {

        String decision;

        String ask = "\n1 - YES" +
                     "\n2 - NO (Exit the test program)";

            System.out.println(ask);

        System.out.print("\nEnter your choose : ");
            decision = scanner.nextLine();

            if (decision.equals("2")) {
                System.out.println("\nExiting the test program....");
                return;

            } else if (decision.equals("1")) {

                int login_attemp = 3;

                while (true) {

                    if (login.login(register)) {
                        System.out.println("\nLogin Successful. Welcome " + register.getUser_name());
                        return;

                    } else {
                        System.out.println("\nLogin failed.");
                        login_attemp -= 1;
                        System.out.println("Login attemp remaining = " + login_attemp);

                        if (login_attemp == 0) {
                            System.out.println("System blocked. No more login attemp. Exiting....");
                            return;

                        }

                    }
                }
            }

            else {
                System.out.println("\nWrong key, choose again!");

            }
        }
    }
}
