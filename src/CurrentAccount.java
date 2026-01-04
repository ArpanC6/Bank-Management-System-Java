public class CurrentAccount extends Account {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited in Current Account..");
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Amount withdrawn from Current Account..");
    }
}
