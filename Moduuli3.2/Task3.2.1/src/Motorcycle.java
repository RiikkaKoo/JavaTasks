public class Motorcycle implements Vehicle {
    private String type;
    private String fuel;
    private String colour;

    public Motorcycle(String typeM, String fuelM, String colourM) {
        this.type = typeM;
        this.fuel = fuelM;
        this.colour = colourM;
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
        return "Type: " + type + "\nFuel: " + fuel + "\nColour: " + colour;
    }

}