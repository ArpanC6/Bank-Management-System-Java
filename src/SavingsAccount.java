public class SavingsAccount extends Account {

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited in Savings Account..");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn from Savings Account..");
        } else {
            System.out.println("Insufficient balance..");
        }
    }
}