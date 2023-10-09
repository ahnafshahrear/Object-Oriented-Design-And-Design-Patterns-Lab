import java.util.Hashtable;

public class BankService {
    private Hashtable<String, BankAccount> bankAccounts;

    BankService() {
        this.bankAccounts = new Hashtable<String, BankAccount>();
    }

    public String createNewAccount(String type, int starting_deposit) {
        BankAccount newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new SavingAccount(starting_deposit);
                break;
            case "saving":
                newAccount = new SavingAccount(starting_deposit);
                break;
            case "investment":
                newAccount = new SavingAccount(starting_deposit);
                break;
            default:
                System.out.println("Invalid account type");
                break;
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return "null";
    }

    public int getAccountBalance(String accountNumber) {
        return bankAccounts.get(accountNumber).getBalance();
    }

    public void transferMoney(String to, String from, int amount) {
        BankAccount toAccount = bankAccounts.get(to);
        BankAccount fromAccount = bankAccounts.get(from);
        boolean withdrawStatus = fromAccount.withdraw(amount);

        if (withdrawStatus) {
            toAccount.deposit(amount);
            System.out.println("\nSuccessfully transferred $" + amount);
        } else
            System.out.println("\nInsufficient balance!");
    }
}