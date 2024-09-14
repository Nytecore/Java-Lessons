import java.util.Scanner;

public class Account {

    private int accountNumber = 78548291;
    private int checkingBalance = 40000;
    private int savingBalance = 10000;

    Scanner scanner = new Scanner(System.in);


    public void checkingDeposit () {

        System.out.println("\n\t ----- CHECKING ACCOUNT DEPOSIT MENU -----");
        System.out.println("\nBalance : " + checkingBalance);
        System.out.print("\nPlease enter amount of deposit : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        checkingBalance += amount;
        System.out.println("Current Balance : " + checkingBalance);

    }

    public void savingDeposit () {

        System.out.println("\n\t ----- SAVING ACCOUNT DEPOSIT MENU -----");
        System.out.println("\nBalance : " + savingBalance);
        System.out.print("\nPlease enter amount of deposit : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        savingBalance += amount;
        System.out.println("Current Balance : " + savingBalance);

    }

    public void checkingWithdraw () {

        System.out.println("\n\t ----- CHECKING ACCOUNT WITHDRAW MENU -----");
        System.out.println("\nBalance : " + checkingBalance);
        System.out.print("\nPlease enter amount of withdraw : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        checkingBalance -= amount;
        System.out.println("Current Balance : " + checkingBalance);

    }

    public void savingWithdraw () {

        System.out.println("\n\t ----- SAVING ACCOUNT WITHDRAW MENU -----");
        System.out.println("\nBalance : " + savingBalance);
        System.out.print("\nPlease enter amount of withdraw : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        savingBalance -= amount;
        System.out.println("Current Balance : " + savingBalance);

    }

    public void transferMoney () {

        System.out.println("\nYou will transfer between your accounts.");


    }


    public void accountDetails () {

        System.out.println("\nAccount number : " + accountNumber);

    }

    public void getCheckingDetails () {

        System.out.println("Checking Account Balance : " + checkingBalance);

    }

    public void getSavingDetails () {

        System.out.println("Saving Account Balance : " + savingBalance);

    }

    public int getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(int checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public int getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
    }
}


