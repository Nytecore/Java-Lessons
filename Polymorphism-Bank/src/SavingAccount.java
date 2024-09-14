import java.util.Scanner;

public class SavingAccount extends Account{

    private int months;

    @Override
    public void savingDeposit() {
        super.savingDeposit();
    }

    @Override
    public void savingWithdraw() {
        super.savingWithdraw();

    }
    public void applyInterest () {

        Scanner scanner = new Scanner (System.in);
        System.out.print("\nEnter the number of months to keep the money in the saving account: ");
        months = scanner.nextInt();
        scanner.nextLine();

        int newBalance = ((getSavingBalance() / 100) * 5)  * months;
        setSavingBalance(getSavingBalance() + newBalance);

        System.out.println("Updated Balance with interest: " + getSavingBalance());

    }


}
