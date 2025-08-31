public class Bus extends Car {

    private int currentPassengers;
    private int passengerCapacity;

    public Bus (String typeName, double cap, double speedLim, double speedLevel, double gasoline, int passengerMax) {
        super(typeName, cap, speedLim, speedLevel, gasoline);
        this.currentPassengers = 0;
        this.passengerCapacity = passengerMax;
    }

    public void passengerEnter() {
        if (currentPassengers < passengerCapacity) {
            currentPassengers++;
            System.out.printf("\nA passenger entered the bus. Current passengers: %d/%d", currentPassengers, passengerCapacity);
        } else {
            System.out.println("\nThe \"" + super.getTypeName() + "\" has no room for new passengers.");
        }
    }

    public void passengerExit() {
        if (currentPassengers > 0) {
            currentPassengers--;
            System.out.printf("\nA passenger exited the bus. Current passengers: %d/%d", currentPassengers, passengerCapacity);
        }
    }
}
