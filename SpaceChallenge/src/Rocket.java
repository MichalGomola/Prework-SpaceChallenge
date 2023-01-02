import java.util.ArrayList;

public class Rocket implements SpaceShip{
    int cost;
    int weight;
    int rocketWeight;
    int maxCapacity;
    ArrayList<Item> items;

    Rocket() {
        this.rocketWeight = 0;
        this.weight = this.rocketWeight;
        this.maxCapacity = 0;
        this.items = null;

    }
    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        int totalWeight = this.weight + item.weight;
        if (this.maxCapacity < totalWeight) {
            return false;
        } else {
            return true;
        }
    }

    public void carry(Item item) {
        this.items.add(item);
        this.weight += item.weight;
    }
}
