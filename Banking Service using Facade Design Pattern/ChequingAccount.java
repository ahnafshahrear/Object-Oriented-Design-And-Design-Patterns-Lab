public class ChequingAccount implements BankAccount {
    private int balance;
    private String accountNumber;

    ChequingAccount(int initial_balance) {
        this.balance = initial_balance;
        int accNumber = (int) (Math.random() * 100);
        this.accountNumber = Integer.toString(accNumber);
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
    }

    @Override
    public boolean withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
