import java.util.ArrayList;

public class Housing implements HouseInterface {
    private String address;
    private ArrayList<HouseInterface> structures;

    public Housing(String address) {
        this.structures = new ArrayList<HouseInterface>();
        this.address = address;
    }

    public void enter() {
        System.out.println("You have entered the " + address);
    }

    public void exit() {
        System.out.println("You have left the " + address);
    }

    public void showLocation() {
        System.out.println("You are currently in " + this.getInformation() + ". It contains:");
        int count = 1;
        for (HouseInterface x : structures) {
            System.out.println("(" + count++ + ") " + x.getInformation());
        }
    }

    public void addStructure(HouseInterface newFloor) {
        structures.add(newFloor);
    }

    public String getInformation() {
        return address;
    }
}
