import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileNameOne = "/home/michal/Desktop/Prework-SpaceChallenge/SpaceChallenge/src/phase-1.txt";
        String fileNameTwo = "/home/michal/Desktop/Prework-SpaceChallenge/SpaceChallenge/src/phase-2.txt";

        Simulation simulation = new Simulation();

        ArrayList<Rocket> u1RocketsOne = simulation.loadU1(simulation.loadItems(fileNameOne));
        ArrayList<Rocket> u1RocketsTwo = simulation.loadU1(simulation.loadItems(fileNameTwo));
        
        ArrayList<Rocket> u2RocketsOne = simulation.loadU2(simulation.loadItems(fileNameOne));
        ArrayList<Rocket> u2RocketsTwo = simulation.loadU2(simulation.loadItems(fileNameTwo));

        int u1BudgetOne = simulation.runSimulation(u1RocketsOne);
        int u1BudgetTwo = simulation.runSimulation(u1RocketsTwo);


        int u2BudgetOne = simulation.runSimulation(u2RocketsOne);
        int u2BudgetTwo = simulation.runSimulation(u2RocketsTwo);


        System.out.println("Budget for Phase-1 with U1 rockets: $" + u1BudgetOne);
        System.out.println("Budget for Phase-2 with U1 rockets: $" + u1BudgetTwo);
        System.out.println("Total budget with U1 rockets: $" + (u1BudgetOne + u1BudgetTwo));
        System.out.println();
        System.out.println("Budget for Phase-1 with U2 rockets: $" + u2BudgetOne);
        System.out.println("Budget for Phase-2 with U2 rockets: $" + u2BudgetTwo);
        System.out.println("Total budget with U2 rockets: $" + (u2BudgetOne + u2BudgetTwo));


    }
}