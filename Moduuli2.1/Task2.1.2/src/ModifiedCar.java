public class ModifiedCar {

    private double speed;
    private double speedLimit;
    private double gasolineLevel;
    private double gasCapacity;
    private String typeName;

    public ModifiedCar(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }

    // This is the ADDITIONAL constructor for this class that includes gasoline capacity and maximum speed
    public ModifiedCar(String typeName, double cap, double speedLim) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
        gasCapacity = cap; speedLimit = speedLim; // (Speed on jo olemassa alkuperäisessä,
        // niin en ollut varma, mitä tähän piti laittaa, joten päätin laittaa speed limitin. Hyödynnän sitä Task 2.1.4:ssa)
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = gasCapacity; // Fill the tank to max
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
}
