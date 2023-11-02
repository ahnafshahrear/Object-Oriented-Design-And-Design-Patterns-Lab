public class VendingMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currentState;
    private int count;

    public VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public State getIdleState() {
        return idleState;
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public int getCount() {
        return count;
    }

    public void doReleaseProduct() {
        System.out.println("Product dispensed");
        count--;
    }

    public void doReturnMoney() {
        System.out.println("Money returned");
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }
}
