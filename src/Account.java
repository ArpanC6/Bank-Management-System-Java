public abstract class Account {

    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.println(
                accountNumber + " | " +
                        holderName + " | Balance: " + balance
        );
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
