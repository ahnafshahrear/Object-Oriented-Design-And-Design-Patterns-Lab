public class PopMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currentState;
    private int count;

    public PopMachine(int count) {
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
}