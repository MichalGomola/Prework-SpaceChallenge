import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileNameOne = "/home/michal/Desktop/Prework-SpaceChallenge/SpaceChallenge/src/phase-1.txt";
        String fileNameTwo = "/home/michal/Desktop/Prework-SpaceChallenge/SpaceChallenge/src/phase-2.txt";

        Simulation simulation = new Simulation();

        ArrayList<Item> itemsOne = simulation.loadItems(fileNameOne);
        ArrayList<Item> itemsTwo = simulation.loadItems(fileNameTwo);

        for (Item i : itemsOne) {
            System.out.println(i.name + " weights: " + i.weight + "kg");
        }

        for (Item i : itemsTwo) {
            System.out.println(i.name + " weights: " + i.weight + "kg");
        }
    }
}