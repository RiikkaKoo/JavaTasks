public class CruiseCar {

    private double speed;
    private double speedLimit;
    private double gasolineLevel;
    private double gasCapacity;
    private String typeName;

    public CruiseCar(String typeName, double cap, double speedLim) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        gasCapacity = cap;
        speedLimit = speedLim;
        cMaxSpeed = 0.85 * speedLim;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            if (speed + 10 > speedLimit) {
                speed = speedLimit;
            } else {
                speed += 10;
            }
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

    // CRUISE CONTROL FEATURES:

    private double targetSpeed;
    private boolean cruiseOn = false;
    private double cMaxSpeed;
    private double cMinSpeed = 20;


    public void setTargetSpeed(double t) {
        targetSpeed = t;
        if (!cruiseOn) {
            System.out.println("Target speed set to " + targetSpeed + "km/h.");
        } else {

            System.out.println("Target speed set to " + targetSpeed + "km/h.");
            startCruising();
        }
    }

    public double readTargetSpeed() {
        return targetSpeed;
    }

    public void cruising() {
        while (targetSpeed != speed) {
            if (targetSpeed > speed) {
                accelerate();
                System.out.println("Accelerating...");
                if (speed > targetSpeed) {
                    speed = targetSpeed;
                }
            } else {
                System.out.println("Decelerating...");
                decelerate(10);
                if (speed < targetSpeed) {
                    speed = targetSpeed;
                }
            }

        }
        System.out.println("Target speed of " + speed + " km/h reached.");
    }

    private void startCruising() {
        if (cMinSpeed <= targetSpeed && targetSpeed <= cMaxSpeed) {
            cruising();
        } else {
            System.out.println("Target speed is out of range. Set it between " + cMinSpeed + " - " + cMaxSpeed + " km/h.");
            cruiseOnOffSwitch();
        }
    }

    public void cruiseOnOffSwitch() {
        cruiseOn = !cruiseOn;
        if (cruiseOn) {
            System.out.println("Cruise control switched on.");
            startCruising();
        } else {
            System.out.println("Cruise control switched off.");
        }
    }
}
