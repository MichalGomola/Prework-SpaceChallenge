public class U1 extends Rocket{
    U1() {
        this.rocketWeight = 10000;
        this.maxCapacity = 18000;
        this.cost = 100000000;
    }

    @Override
    public boolean launch() {
        double cargoCarried = 1.0 * (this.maxCapacity - this.weight);
        double cargoLimit = 1.0 * (this.maxCapacity - this.rocketWeight);
        double chanceOfExpl = 0.05 * (cargoCarried/cargoLimit);
        if (chanceOfExpl > Math.random()) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public boolean land() {
        double cargoCarried = 1.0 * (this.maxCapacity - this.weight);
        double cargoLimit = 1.0 * (this.maxCapacity - this.rocketWeight);
        double chanceOfExpl = 0.01 * (cargoCarried/cargoLimit);
        if (chanceOfExpl > Math.random()) {
            return false;
        } else {
            return true;
        }
    }

}
