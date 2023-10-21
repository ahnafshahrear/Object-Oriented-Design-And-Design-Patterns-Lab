import java.util.HashMap;
import java.util.Map;

public class Warehouse implements OrderInterface {
    public Map<String, Integer> stock;

    public Warehouse(String address) {
        this.stock = new HashMap<>();
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            if (stock.containsKey(item.name)) {
                int currentStock = stock.get(item.name);
                if (currentStock > 0) {
                    stock.put(item.name, currentStock - 1);
                } else {
                    System.out.println("Item " + item.name + " is out of stock.");
                }
            } else {
                System.out.println("Item " + item.name + " not found in inventory.");
            }
        }
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.name)) {
            return stock.get(item.name);
        }
        return 0;
    }
}