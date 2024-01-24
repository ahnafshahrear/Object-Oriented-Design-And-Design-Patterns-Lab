public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();

        vendingMachine.dispense();
        vendingMachine.ejectMoney();

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();
    }
}