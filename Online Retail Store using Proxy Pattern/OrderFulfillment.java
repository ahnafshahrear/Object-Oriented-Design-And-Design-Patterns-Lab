import java.util.ArrayList;
import java.util.List;

public class OrderFulfillment implements OrderInterface {
    private List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void fulfillOrder(Order order) {
        List<Order> ordersToShip = new ArrayList<>();

        for (Item item : order.itemList) {
            boolean itemFulfilled = false;

            for (Warehouse warehouse : warehouses) {
                int currentStock = warehouse.currentInventory(item);

                if (currentStock > 0) {
                    Order warehouseOrder = new Order();
                    warehouseOrder.itemList.add(item);
                    ordersToShip.add(warehouseOrder);
                    itemFulfilled = true;
                    warehouse.stock.put(item.name, currentStock - 1);
                    break;
                }
            }

            if (!itemFulfilled) {
                System.out.println("Item " + item.name + " is out of stock in all warehouses.");
            }
        }

        for (Order warehouseOrder : ordersToShip) {
            sendOrderToWarehouse(warehouseOrder);
        }
    }

    private void sendOrderToWarehouse(Order order) {
        System.out.println("Successful");
    }
}
