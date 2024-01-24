public class OutOfStockState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Sorry! Out of Stock");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Returning money");
        vendingMachine.doReturnMoney();
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of Stock");
    }
}
