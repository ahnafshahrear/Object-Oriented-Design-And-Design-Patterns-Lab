import java.util.*;

public class OrderFulfillmentProxy implements OrderInterface {
    private ArrayList<WarehouseReal> warehouses;

    OrderFulfillmentProxy() {
        warehouses = new ArrayList<>();
    }

    @Override
    public void completeOrder(Order order) {
        boolean stock = true;

        for (WarehouseReal warehouse: warehouses) {
            HashMap<String, Integer> inventory = warehouse.getInventory();
            stock = true;
            for (String product: order.cart) {
                if (inventory.get(product) <= 0) {
                    stock = false;
                    break;
                }
            }
            if (stock) {
                warehouse.completeOrder(order);
                break;
            }
        }
        if (!stock) {
            System.out.println("Sorry! Out of Stock. Can't complete order!");
        }
    }

    public void addWarehouse(WarehouseReal warehouse) {
        warehouses.add(warehouse);
    }
}
