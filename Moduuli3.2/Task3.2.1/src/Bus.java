public class Bus implements Vehicle {
    private String type;
    private String fuel;
    private int capacity;

    public Bus(String typeB, String fuelB, int capacityB) {
        this.type = typeB;
        this.fuel = fuelB;
        this.capacity = capacityB;
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
        return "Type: " + type + "\nFuel: " + fuel + "\nCapacity: " + capacity;
    }

}
