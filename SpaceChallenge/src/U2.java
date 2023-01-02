public class U2 extends Rocket{
    U2() {
        this.rocketWeight = 18000;
        this.maxCapacity = 29000;
        this.cost = 120000000;
    }

    @Override
    public boolean launch() {
        double cargoCarried = 1.0 * (this.maxCapacity - this.weight);
        double cargoLimit = 1.0 * (this.maxCapacity - this.rocketWeight);
        double chanceOfExpl = 0.04 * (cargoCarried/cargoLimit);
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
        double chanceOfExpl = 0.08 * (cargoCarried/cargoLimit);
        if (chanceOfExpl > Math.random()) {
            return false;
        } else {
            return true;
        }
    }
}
