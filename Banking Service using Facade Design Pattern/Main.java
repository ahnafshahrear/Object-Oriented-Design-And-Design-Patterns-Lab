public class Main {
    public static void main(String[] args)
    {
        BankService myBankService = new BankService();
        int mySavingAccount = myBankService.createNewAccount("saving", 99999);
        int myInvestmentAccount = myBankService.createNewAccount("investment", 100000);

        System.out.println("Saving account balance $" + myBankService.get);

        myBankService.transferMoney(myInvestmentAccount, mySavingAccount, 1);
    }
}