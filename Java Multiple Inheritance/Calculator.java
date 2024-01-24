public class Calculator implements Adder, Subtractor, Multiplier, Divider {
    @Override
    public int add(int x, int y) {
        System.out.println("Addition: " + (x + y));
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        System.out.println("Subtraction: " + (x - y));
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        System.out.println("Multiplication: " + (x * y));
        return x * y;
    }

    @Override
    public int divide(int x, int y) {
        System.out.println("Division: " + (x / y));
        return x / y;
    }   
}