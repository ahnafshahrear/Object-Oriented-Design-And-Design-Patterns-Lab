public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        String savingsAccount = bankService.createNewAccount("saving", 10000);
        String investmentAccount = bankService.createNewAccount("investment", 100000);
        System.out.println("Account balance information:");
        System.out.println("Savings account balance: $" + bankService.getAccountBalance(savingsAccount));
        System.out.println("Investment account balance: $" + bankService.getAccountBalance(investmentAccount));
        bankService.transferMoney(savingsAccount, investmentAccount, 100);
        System.out.println("\nAccount balance after transaction:");
        System.out.println("Savings account: $" + bankService.getAccountBalance(savingsAccount));
        System.out.println("Investment account: $" + bankService.getAccountBalance(investmentAccount));
    }   
}