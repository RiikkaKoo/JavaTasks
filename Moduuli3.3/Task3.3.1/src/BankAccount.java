public class BankAccount {

    private static int totalAccounts;
    private String accountID;
    private int balance;

    public BankAccount(int balance) {
        totalAccounts++;
        this.accountID = "FI00000000000" + totalAccounts;
        this.balance = balance;
    }

    public void deposit(int money) {
        this.balance += money;
        System.out.println(money + " euros deposited.");
    }

    public void withdraw(int money) {
        if ((this.balance - money) < 0) {
            System.out.println("Withdraw failed. Check balance.");
        } else {
            this.balance -= money;
            System.out.println(money + " euros withdrawn.");
        }
    }

    public String getAccountNumber() {
        return this.accountID;
    }

    public int getBalance() {
        return this.balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}