public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order();
        myOrder.addToCart("Tesla");
        myOrder.addToCart("iPhone 15 Pro Max");
        myOrder.addToCart("Private Jet");

        OrderFulfillmentProxy orderFulfillment = new OrderFulfillmentProxy();

        WarehouseReal warehouse1 = new WarehouseReal();
        WarehouseReal warehouse2 = new WarehouseReal();

        warehouse1.addToInventory("Tesla", 1);
        warehouse1.addToInventory("iPhone 15 Pro Max", 0);
        warehouse1.addToInventory("Private Jet", 4);

        warehouse2.addToInventory("Tesla", 2);
        warehouse2.addToInventory("iPhone 15 Pro Max", 10);
        warehouse2.addToInventory("Private Jet", 1);

        orderFulfillment.addWarehouse(warehouse1);
        orderFulfillment.addWarehouse(warehouse2);

        orderFulfillment.completeOrder(myOrder);
    }
}
