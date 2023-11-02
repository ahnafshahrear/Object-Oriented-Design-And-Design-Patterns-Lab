public class OutOfStockState implements State {
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Cannot accept money.");
    }

    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Returning money");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of stock. No product to dispense.");
    }
}