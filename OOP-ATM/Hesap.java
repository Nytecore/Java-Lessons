public class Hesap {

    private String username;
    private String password;
    private int balance;

    public Hesap(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit (int amount) {
        this.balance += amount;
        System.out.println("New balance : " + balance);
    }

    public void withdrawal (int amount) {
        if ((balance - amount) < 0) {
            System.out.println("insufficient funds");

        } else if ( amount > 1500) {
            System.out.println("Maximum daily withdrawal limit: 1500. ");

        } else {
            balance -= amount;
            System.out.println("New balance : " + balance);
        }
    }
}
