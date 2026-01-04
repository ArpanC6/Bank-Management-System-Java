import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while (true) {
            System.out.println("\n1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Accounts");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Acc No: ");
                    int sAcc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String sName = sc.nextLine();

                    System.out.print("Balance: ");
                    double sBal = sc.nextDouble();

                    service.addAccount(
                            new SavingsAccount(sAcc, sName, sBal)
                    );
                    break;

                case 2:
                    System.out.print("Acc No: ");
                    int cAcc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String cName = sc.nextLine();

                    System.out.print("Balance: ");
                    double cBal = sc.nextDouble();

                    service.addAccount(
                            new CurrentAccount(cAcc, cName, cBal)
                    );
                    break;

                case 3:
                    System.out.print("Acc No: ");
                    int dAcc = sc.nextInt();

                    Account d = service.findAccount(dAcc);
                    if (d != null) {
                        System.out.print("Amount: ");
                        d.deposit(sc.nextDouble());
                    } else {
                        System.out.println("Account not found..");
                    }
                    break;

                case 4:
                    System.out.print("Acc No: ");
                    int wAcc = sc.nextInt();

                    Account w = service.findAccount(wAcc);
                    if (w != null) {
                        System.out.print("Amount: ");
                        w.withdraw(sc.nextDouble());
                    } else {
                        System.out.println("Account not found..");
                    }
                    break;

                case 5:
                    service.showAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank You..");
                    return;
            }
        }
    }
}