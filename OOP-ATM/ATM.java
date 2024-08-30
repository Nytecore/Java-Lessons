import sun.rmi.runtime.Log;

import java.util.Scanner;

public class ATM {

    public void working (Hesap hesap) {
        Login login = new Login();

        Scanner scanner = new Scanner (System.in);

        System.out.println("\n******************************");
        System.out.println("\t\tWelcome to ATM");
        System.out.println("******************************");
        System.out.println("\n\t----- LOGIN USER -----\n");
        int login_attempt = 3;

        while (true){

            if (login.login(hesap)) {
                System.out.println("\nLogin succesful....\n");
                break;

            } else {
                System.out.println("Login failed..");
                login_attempt -= 1;
                System.out.println("Remaining login attempts : " + login_attempt);
            }

            if (login_attempt == 0) {
                System.out.println("No more login atempts");
                return;
            }
        }

        System.out.println("******************************");
        String transactions = "\t1. View Balance\n"
                                + "\t2. Deposit Money\n"
                                + "\t3. Withdrawal Money\n"
                                + "\tPres 'q' to exit ATM";
        System.out.println(transactions);
        System.out.println("******************************");

        while (true) {
            System.out.print("\nPress the action : ");
            String operation = scanner.nextLine();

            if (operation.equals("q")){
                System.out.println("\nExiting....");
                break;

            } else if (operation.equals("1")){
                System.out.print("Your balance: " + hesap.getBalance() + "\n");

            } else if (operation.equals("2")) {
                System.out.print("Enter the amount you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.deposit(amount);

            } else if (operation.equals("3")) {
                System.out.print("Enter the amount you want to withdrawal: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.withdrawal(amount);

            } else {
                System.out.print("Invalid transaction..");
            }
        }
    }
}
