

public class TestAccounts {
    public static void main(String[] args) {
        Account account = new Account(1001, 500.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(1002, 1000.0, 0.03, 500.0);
        SavingsAccount savingsAccount = new SavingsAccount(1003, 1500.0, 0.04);

        account.deposit(200.0);
        account.withdraw(100.0);

        checkingAccount.deposit(300.0);
        checkingAccount.withdraw(1500.0);

        savingsAccount.deposit(400.0);
        savingsAccount.withdraw(2000.0); // This should not be allowed

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }
}
