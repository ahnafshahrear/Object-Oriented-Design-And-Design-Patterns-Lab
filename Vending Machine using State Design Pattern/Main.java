public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        System.out.println("Initial state: " + vendingMachine.getCurrentState().getClass().getSimpleName());

        vendingMachine.insertDollar();
        vendingMachine.dispense();

        vendingMachine.insertDollar();
        vendingMachine.ejectMoney();

        vendingMachine.insertDollar();
        vendingMachine.insertDollar();
        vendingMachine.dispense();

        System.out.println("Current state: " + vendingMachine.getCurrentState().getClass().getSimpleName());

        vendingMachine.ejectMoney();
        vendingMachine.dispense();

        System.out.println("Remaining products: " + vendingMachine.getCount());
    }
}
