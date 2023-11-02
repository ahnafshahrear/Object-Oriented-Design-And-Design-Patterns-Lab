public class HasOneDollarState implements State {
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Already have one dollar");
    }

    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Returning money");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Releasing product");
        if (vendingMachine.getCount() > 1) {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getIdleState());
        } else {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }
}
