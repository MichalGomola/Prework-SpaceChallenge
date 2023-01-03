import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public class Simulation {

    /** method loadItems - loads items from file
     * @param fileName - String
     *
     * @return ArrayList<Item>
     * */
    public ArrayList<Item> loadItems(String fileName) throws Exception{

        ArrayList<Item> items = new ArrayList<>();

        try (FileReader fr = new FileReader(fileName, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(fr)) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] item = line.split("=");
                Item newItem = new Item(item[0], Integer.parseInt(item[1]));
                items.add(newItem);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    /** method loadU1 - creating U1 rockets that carry at given load
     * @param load - ArrayList<Item>
     *
     * @return ArrayList<Rocket> - ArrayList of U1 rockets with cargo
     * */
    public ArrayList<Rocket> loadU1(ArrayList<Item> load) {

        ArrayList<Rocket> u1Rockets = new ArrayList<>();
        Rocket u1 = new U1();
        u1Rockets.add(u1);

        while (load.size() != 0) {
            if (u1Rockets.get(u1Rockets.size()-1).canCarry(load.get(0))) {
                u1Rockets.get(u1Rockets.size()-1).carry(load.get(0));
                load.remove(0);
            } else {
                u1 = new U1();
                u1Rockets.add(u1);
            }
        }
        return u1Rockets;
    }

    /** method loadU2 - creating U2 rockets that carry at given load
     * @param load - ArrayList<Item>
     *
     * @return ArrayList<Rocket> - ArrayList of U2 rockets with cargo
     * */
    public ArrayList<Rocket> loadU2(ArrayList<Item> load) {

        ArrayList<Rocket> u2Rockets = new ArrayList<>();
        Rocket u2 = new U2();
        u2Rockets.add(u2);

        while (load.size() != 0) {
            if (u2Rockets.get(u2Rockets.size()-1).canCarry(load.get(0))) {
                u2Rockets.get(u2Rockets.size()-1).carry(load.get(0));
                load.remove(0);
            } else {
                u2 = new U2();
                u2Rockets.add(u2);
            }
        }
        return u2Rockets;
    }


    /** method runSimulation - runs simulation to get cost of mission
     * @param rockets - ArrayList<Rocket>
     *
     * @return int - budget - total cost of sent rockets (including crashed ones)
     * */
    public int  runSimulation(ArrayList<Rocket> rockets) {
        int budget = 0;

        while (rockets.size() != 0) {
            if (rockets.get(0).launch()) {
                if (rockets.get(0).land()) {
                    budget += rockets.get(0).cost;
                    rockets.remove(0);
                } else {
                    budget += rockets.get(0).cost;
                }
            } else {
                budget += rockets.get(0).cost;
            }
        }
        return budget;
    }
}
