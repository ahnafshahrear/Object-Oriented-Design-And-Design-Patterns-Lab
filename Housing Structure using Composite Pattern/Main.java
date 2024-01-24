public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("4th Science Building");

        Housing department1 = new Housing("Computer Science & Engineering");

        Room room1 = new Room("Seminar Library");
        Room room2 = new Room("Office");
        Room room3 = new Room("App & Game Testing Lab");

        department1.addComponent(room1);
        department1.addComponent(room2);
        department1.addComponent(room3);

        Housing department2 = new Housing("Pharmacy");

        Room room4 = new Room("Chemical Lab");
        Room room5 = new Room("Washroom");

        department2.addComponent(room4);
        department2.addComponent(room5);

        building.addComponent(department1);
        building.addComponent(department2);

        building.enter();
        building.location();

        department1.enter();
        department1.location();

        room3.enter();
        room3.location();
        room3.exit();

        department1.exit();
        building.exit();
    }
}