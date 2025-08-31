public class Car{
    private double speed;
    private double speedLimit;
    private double gasolineLevel;
    private double gasCapacity;
    private String typeName;


    public Car(String typeName, double cap, double speedLim, double speedLevel, double gasoline) {
        this.typeName = typeName;
        speed = speedLevel; gasolineLevel = gasoline;
        gasCapacity = cap; speedLimit = speedLim;
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

    protected void setSpeed(double currentSpeed) {
        speed = currentSpeed;
    }
}
