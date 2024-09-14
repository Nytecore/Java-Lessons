
public class TransferMenu extends Account{


    @Override
    public void getCheckingDetails() {
        super.getCheckingDetails();
    }

    @Override
    public void getSavingDetails() {
        super.getSavingDetails();
    }

    @Override
    public void transferMoney() {
        super.transferMoney();

        String hesaplar = "\n1)- Checking Account  --->  Saving Account" +
                "\n2)- Saving Account  --->  Checking Account" +
                "\n3)- Return Previously Menu";

        while (true) {

            System.out.println(hesaplar);

            System.out.print("\nSelect transaction :");
            String hesap = scanner.nextLine();

            if (hesap.equals("3")) {

                System.out.println("Returning previously menu...");
                break;

            } else if (hesap.equals("1")) {

                System.out.println("\nChecking account balance = " + getCheckingBalance());
                System.out.println("Saving account balance = " + getSavingBalance());

                System.out.print("\nHow much money transfer in checking account to saving account? : ");
                int money = scanner.nextInt();
                scanner.nextLine();

                int act1 = getCheckingBalance() - money;
                int act2 = money + getSavingBalance();

                setCheckingBalance(act1);
                setSavingBalance(act2);

                System.out.println("\nYour new checking account money = " + getCheckingBalance());
                System.out.println("your new saving account money = " + getSavingBalance());

            } else if (hesap.equals("2")) {

                System.out.println("\nChecking account balance = " + getCheckingBalance());
                System.out.println("Saving account balance = " + getSavingBalance());

                System.out.print("\nHow much money transfer in saving account to checking account? : ");
                int money = scanner.nextInt();
                scanner.nextLine();

                int act1 = getSavingBalance() - money;
                int act2 = money + getCheckingBalance();

                setCheckingBalance(act2);
                setSavingBalance(act1);


                System.out.println("\nYour new checking account money = " + getCheckingBalance());
                System.out.println("your new saving account money = " + getSavingBalance());


            }
        }
    }
}
