public class SavingAccount implements Account {
    private int amount, accountNumber;

    SavingAccount(int amount)
    {
        this.amount = amount;
        this.accountNumber = (int)(Math.random() * 100);
        System.out.println("Saving account successfully created");
    }

    @Override
    public void deposit(int amount) {
        this.amount += amount;
        System.out.println("Successfully deposited $" + amount);
    }

    @Override
    public void withdraw(int amount) {
        this.amount -= amount;
        System.out.println("Successfully withdrawn $" + amount);
    }

    @Override
    public void transfer(int amount, Account to) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAmount()
    {
        return amount;
    }
}