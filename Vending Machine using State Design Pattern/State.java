public interface State {
    public void insertDollar(VendingMachine vendingMachine);

    public void ejectMoney(VendingMachine vendingMachine);

    public void dispense(VendingMachine vendingMachine);
}