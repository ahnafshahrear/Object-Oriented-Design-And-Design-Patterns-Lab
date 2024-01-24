import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, Account> bankAccounts;

    BankService() {
        bankAccounts = new Hashtable<Integer, Account>();
    }

    public int createNewAccount(String type, int amount) {
        Account newAccount = null;
        switch (type) {
            case "saving":
                newAccount = new SavingAccount(amount);
                break;
            case "chequing":
                newAccount = new ChequingAccount(amount);
                break;
            case "investment":
                newAccount = new InvestmentAccount(amount);
                break;
            default:
                System.out.println("Invalid account type");
                break;
        }

        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int from, int to, int amount) {
        Account fromAccount = this.bankAccounts.get(from);
        Account toAccount = this.bankAccounts.get(to);
        fromAccount.transfer(amount, toAccount);
    }

    public int getAccountBalance(int accountNumber) {
        Account account = this.bankAccounts.get(accountNumber);
        return account.getAmount();
    }
}