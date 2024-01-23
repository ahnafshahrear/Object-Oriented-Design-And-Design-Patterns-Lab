import java.util.ArrayList;

class Order {
    ArrayList<String> cart = new ArrayList<>();

    public void addToCart(String item) {
        cart.add(item);
    }
}