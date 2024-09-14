import java.util.Scanner;

public class Bank {

    public void atm() {

        Account checkingAcc = new CheckingAccount();
        Account savingAcc = new SavingAccount();
        Account transfer = new TransferMenu();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n---- WELCOME BANK ATM ----");

        String actions = "\n1. Account Details" +
                "\n2. Deposit Money" +
                "\n3. Withdraw money" +
                "\n4. Transfer Money" +
                "\nPress 'q' for exit";

        while (true) {

            System.out.println(actions);
            System.out.print("\nPlease select action : ");
            String action = scanner.nextLine();

            if (action.equals("q")) {
                System.out.println("Exit the program...");
                break;

            }
            else if (action.equals("1")) {

                ((Account) checkingAcc).accountDetails();

                checkingAcc.getCheckingDetails();
                savingAcc.getSavingDetails();

            }
            else if (action.equals("2")) {

                System.out.println("\nPlease choose account to deposit money ");

                String deposit = "\n\t----->  1. Checking Account" +
                        "\n\t----->  2. Saving Account" +
                        "\n\t----->  3. Previously Menu";

                while (true) {

                    System.out.println(deposit);
                    System.out.print("\nSelect : ");
                    String select = scanner.nextLine();

                    if (select.equals("3")) {
                        System.out.println("\nReturning previously menu...");
                        break;

                    }
                    else if (select.equals("1")) {

                        if (checkingAcc instanceof CheckingAccount) {
                            System.out.println("\nYour transaction is a Checking Account transaction.");
                            System.out.print("Do you want to continue? : ( 'y' or 'n' )");

                            while (true) {
                                System.out.print("Select : ");
                                String yesOrNo = scanner.nextLine();

                                if (yesOrNo.equals("y")) {

                                    checkingAcc.checkingDeposit();

                                    System.out.println("\nYou are directed to the previous menu");
                                    break;

                                }
                                else if (yesOrNo.equals("n")) {
                                    System.out.println("\nYou are directed to the previous menu");
                                    break;

                                }
                                else {
                                    System.out.println("Wrong choose. Please choose again.");

                                }
                            }
                        }

                        else {
                            System.out.println("Your transaction is not in checking account.");

                        }
                    }
                    else if (action.equals("2")) {

                        if (savingAcc instanceof SavingAccount) {

                            System.out.println("\nYour transactions is a Saving Account transactions.");
                            System.out.println("Do you want to continue ? ( 'y' or 'n' ) : ");

                            while (true) {

                                System.out.print("Select : ");
                                String yesOrNo = scanner.nextLine();

                                if (yesOrNo.equals("y")) {

                                    savingAcc.savingDeposit();
                                    ((SavingAccount) savingAcc).applyInterest();


                                    System.out.println("\nYou are directed to the previous menu");
                                    break;

                                }
                                else if (yesOrNo.equals("n")) {

                                    System.out.println("You are directed to the previous menu");
                                    break;

                                }
                                else {
                                    System.out.print("Wrong choice. Please choice again.. : ");

                                }
                            }
                        }
                    }
                }
            }

            if (action.equals("3")) {
                System.out.println("\nPlease choose account to withdraw money ");

                String withdraw = "\n\t----->  1. Checking Account" +
                                  "\n\t----->  2. Saving Account" +
                                  "\n\t----->  3. Previously Menu";

                while(true) {

                    System.out.println(withdraw);
                    System.out.print("Choose : ");
                    String choose = scanner.nextLine();

                    if (choose.equals("3")) {
                        System.out.println("Returning Previously Menu..");
                        break;

                    }
                    else if (choose.equals("1")) {

                        if (checkingAcc instanceof CheckingAccount) {

                            while (true) {

                                System.out.println("\nYour transection is Checking Account transaction.");
                                System.out.print("Do you want to continue ? ( 'y' or 'n' ) : ");
                                String yesOrNo = scanner.nextLine();

                                if (yesOrNo.equals("y")) {
                                    checkingAcc.checkingWithdraw();
                                    System.out.println("\nReturn previously menu..");
                                    break;

                                }

                                else if (yesOrNo.equals("n")) {
                                    System.out.println("Return previously menu..");
                                    break;

                                }
                                else {
                                    System.out.println("Wrong transactions..");
                                }
                            }
                        }
                    }
                    else if (choose.equals("2")) {

                        if (savingAcc instanceof SavingAccount) {

                            while (true) {

                                System.out.println("\nYour transection is Saving Account transaction.");
                                System.out.print("Do you want to continue ? ( 'y' or 'n' ) : ");
                                String yesOrNo = scanner.nextLine();

                                if (yesOrNo.equals("y")) {
                                    savingAcc.savingWithdraw();
                                    System.out.println("\nReturn previously menu..");
                                    break;

                                }

                                else if (yesOrNo.equals("n")) {
                                    System.out.println("\nReturn previously menu..");
                                    break;

                                }
                                else {
                                    System.out.println("Wrong transactions..");
                                }
                            }
                        }

                    }
                    else {
                        System.out.println("Incorrect choose..");

                    }
                }

            }
            if (action.equals("4")) {

                transfer.transferMoney();

            }
        }
    }
}
