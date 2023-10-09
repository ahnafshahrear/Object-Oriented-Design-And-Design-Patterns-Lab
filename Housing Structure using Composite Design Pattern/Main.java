public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("221B Baker Street");
        Housing firstFloor = new Housing("221B Baker Street - First FLoor");

        Room washroomMen = new Room("Men's 1st floor washroom");
        Room washroomWomen = new Room("Women's 1st floor washroom");
        Room commonArea = new Room("1st floor common room");

        building.addStructure(firstFloor);
        firstFloor.addStructure(washroomMen);
        firstFloor.addStructure(washroomWomen);
        firstFloor.addStructure(commonArea);

        building.enter();
        building.showLocation();
        firstFloor.enter();
        firstFloor.showLocation();
        firstFloor.exit();
        building.exit();
    }
}
