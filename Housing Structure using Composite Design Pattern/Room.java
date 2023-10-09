public class Room implements HouseInterface {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void enter() {
        System.out.println("You have entered the " + name);
    }

    public void exit() {
        System.out.println("You have left the " + name);
    }

    public void showLocation() {
        System.out.println("You are currently in " + this.getInformation());
    }

    public String getInformation() {
        return name;
    }
}
