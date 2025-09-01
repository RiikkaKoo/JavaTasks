abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuel;
    private String colour;
    private int capacity;
    private int currentPassengers;
    private double efficiency;

    public AbstractVehicle(String vType, String vFuel, String vColour, int vCapacity, double vEfficiency) {
        this.type = vType;
        this.fuel = vFuel;
        this.colour = vColour;
        this.capacity = vCapacity;
        this.efficiency = vEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nColour: " + colour + "\nCapacity: " + capacity;
    }


    // Tämä osio jäi vähän hämäräksi tehtävänannossa. Pitääkö oikeasti laksea jokin fuel efficiency? Mistä?
    // Olisiko pitänyt tuoda takaisin ne accelerate yms. metodit, ja laittaa auto kuluttamaan polttoainetta ja mittaamaan kuljettua matkaa?
    @Override
    public String calculateFuelEfficiency() {
        return Double.toString(efficiency);
    }

    @Override
    public void charge() {
        System.out.println(type + " cannot be charged.");
    }

    public void passengerEnter() {
        if (currentPassengers < capacity) {
            this.currentPassengers++;
            System.out.println("A passenger got on the " + type);
        } else {
            System.out.println("The " + type + " has no more seats.");
        }
    }

    public void passengerExit() {
        if (currentPassengers > 0) {
            this.currentPassengers--;
            System.out.println("A passenger got off the " + type);
        }
    }
}
