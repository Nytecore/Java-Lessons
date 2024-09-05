import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

        Login login = new Login();
        Register register = new Register();

        String username;
        String password;
        String password_again;
        String choose;

        System.out.println("\n**************************************");
        System.out.println("\tSIGN IN THE EMPLOYEES PROGRAM");
        System.out.println("**************************************");

        String options = "\nPress '1' for register" +
                         "\nPress '2' for sing-up" +
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

                    }

                    else {

                        System.out.println("\nThe two passwords do not match.");
                    }
                }
            }

            else if (choose.equals("2")) {

                System.out.println("\nYou should to register the system.");
                continue;

            }

            else {

                System.out.println("Incorrect choose.");
                continue;
            }

            break;
        }

        while (true) {

            String usrname;
            String pw;

            String o_options =
                    "\nPress '1' for sing-up" +
                    "\nPress 'q' for exit";
            System.out.println(o_options);

            System.out.print("\nEnter your choose : ");
            o_options = scanner.nextLine();
            System.out.println(" ");

            if (o_options.equals("q")) {
                System.out.println("\nClosing the program....");
                return;
            }

            else if (o_options.equals("1")) {

                if (login.login(register)) {

                    System.out.println("\n----------------------------------------------------");
                    System.out.println("----------- WELCOME TO EMPLOYEES PROGRAM -----------");
                    System.out.println("----------------------------------------------------\n");

                    while (true) {

                        String operations =
                                "        - OPERATIONS -\n" +
                                "   1. Developer Operations\n" +
                                "   2. Manager Operations\n" +
                                "   Press 'q' to exit program";

                        System.out.println("\n--------------------------------");
                        System.out.println(operations);
                        System.out.println("--------------------------------");

                        System.out.print("\nSelect Operation : ");
                        String choice = scanner.nextLine();

                        if (choice.equals("q")) {
                            System.out.println("Exiting the employee program....");
                            break;
                        }

                        else if (choice.equals("1")) {

                            Developer developer = new Developer("Bora" , "Yıldırım" , 291 , "Java");
                                        // These features are example.

                            String dev_operations =
                                    "\n   - Developer Operations -\n" +
                                    "\n1. Format\n" +
                                    "2. Show Developer's Information\n" +
                                    "Press 'q' to exit from developer operations.";
                            System.out.println(dev_operations);

                            while(true) {

                                System.out.print("\nSelect a developer operation : ");
                                String dev_op = scanner.nextLine();

                                if (dev_op.equals("q")) {
                                    System.out.println("Exiting the developer's operations...");
                                    break;
                                }

                                else if (dev_op.equals("1")) {

                                    System.out.print("What is operating system? : ");
                                    String op_system = scanner.nextLine();
                                    developer.format(op_system);
                                }

                                else if (dev_op.equals("2")) {

                                    developer.showInformation();
                                }

                                else {

                                    System.out.println("Incorrect from developer operation.....");
                                }

                            }
                        }

                        else if (choice.equals("2")) {

                            Manager manager = new Manager ("Mustafa Murat" , "Coşkun" , 564 , "10");
                                            // These features are example.

                            String mng_operations = "\n    - Manager Operations - \n" +
                                    "\n1. Raise to wage\n" +
                                    "2. Show maneger's information\n" +
                                    "Press 'q' to exit from the manager operations";
                            System.out.println(mng_operations);

                            while (true) {

                                System.out.print("\nSelect a manager operation : ");
                                String mng_op = scanner.nextLine();

                                if (mng_op.equals("q")) {
                                    System.out.println("Exit from manager operations...");
                                    break;
                                }

                                else if (mng_op.equals("1")) {

                                    System.out.print("How much raise wage the manager to give per hour? : ");

                                    int raiseWageAmount = scanner.nextInt();
                                    scanner.nextLine();

                                    if (raiseWageAmount < 3 || raiseWageAmount > 10) {
                                        System.out.println("\nYou can min. $3 and max. $10 raise wage per hour. ");
                                    }

                                    else {
                                        manager.raiseWage(raiseWageAmount);

                                    }
                                }

                                else if (mng_op.equals("2")) {
                                    manager.showInformation();
                                }

                                else {

                                    System.out.println("Incorrect manager operation.....");
                                }
                            }
                        }

                        else {

                            System.out.println("Incorrect operation.....");

                        }
                    }
                }

                else {

                    int login_attemp = 3;

                    System.out.println("\nWrong username or password. Please try again... ");

                    while (true) {

                                    // Call login method in login class with register
                        if (login.login(register)) {
                            System.out.println("\nLogin Successful. Welcome " + register.getUser_name());

                        }

                        else {

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
            }

            else {
                System.out.println("\nWrong key, choose again!");

            }
        }
    }
}