
public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
