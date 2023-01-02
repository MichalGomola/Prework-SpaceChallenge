import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Simulation {

    /** method loadItems - loads items from file
     * @param fileName - String
     *
     * @return ArrayList<Item>
     * */
    public ArrayList<Item> loadItems(String fileName) throws Exception{

        Path path = Paths.get(fileName);
        ArrayList<Item> items = new ArrayList<Item>();

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
    public void loadU1(ArrayList load) {

    }

    /** method loadU2 - creating U2 rockets that carry at given load
     * @param load - ArrayList<Item>
     *
     * @return ArrayList<rocket> - ArrayList of U2 rockets with cargo
     * */
    public void loadU2(ArrayList load) {

    }

    /** method runSimulation - runs simulation to get cost of mission
     * @param rockets - ArrayList<Rocket>
     *
     * @return int - budget - total cost of sent rockets (including crashed ones)
     * */
    public void runSimulation(ArrayList rockets) {

    }
}
