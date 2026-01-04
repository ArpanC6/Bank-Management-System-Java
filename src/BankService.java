import java.util.ArrayList;
public class BankService {
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account created successfully..");
    }

    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void showAllAccounts() {
        for (Account acc : accounts) {
            acc.displayDetails();
        }
    }
}