import java.util.ArrayList;

public class Housing implements HousingStructure {
    private String name;
    private ArrayList<HousingStructure> components;

    Housing(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void enter() {
        System.out.println("You have entered the " + this.name);
    }

    @Override
    public void exit() {
        System.out.println("You have left the " + this.name);
    }

    @Override
    public void location() {
        System.out.println("You are currently in the " + this.name);
        System.out.println("It contains...");

        for (HousingStructure component: this.components) {
            System.out.println(component.getName());
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void addComponent(HousingStructure component) {
        this.components.add(component);
    }
}