public class Main {
    public static void main(String[] args)
    {
        BankService myBankService = new BankService();
        int mySavingAccount = myBankService.createNewAccount("saving", 99999);
        int myInvestmentAccount = myBankService.createNewAccount("investment", 100000);

        System.out.println("Saving account balance $" + myBankService.getAccountBalance(mySavingAccount));
        System.out.println("Investment account balance $" + myBankService.getAccountBalance(myInvestmentAccount));

        myBankService.transferMoney(myInvestmentAccount, mySavingAccount, 1);

        System.out.println("After money transfer...");
        System.out.println("Saving account balance $" + myBankService.getAccountBalance(mySavingAccount));
        System.out.println("Investment account balance $" + myBankService.getAccountBalance(myInvestmentAccount));
    }
}