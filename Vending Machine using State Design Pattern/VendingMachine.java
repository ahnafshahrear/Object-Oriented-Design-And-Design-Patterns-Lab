public class VendingMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;

    private State currentState;
    private int count;

    VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();

        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = count;
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

    public void doReturnMoney() {
        System.out.println("Money returned from Vending Machine");
    }

    public void doReleaseProduct() {
        count -= 1;
        System.out.println("Product released from Vending Machine");
    }

    public void setState(State state) {
        currentState = state;
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
}