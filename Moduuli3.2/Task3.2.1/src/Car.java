public class Car implements Vehicle {
    private String type;
    private String fuel;
    private String colour;

    public Car(String typeC, String fuelC, String colourC) {
        this.type = typeC;
        this.fuel = fuelC;
        this.colour = colourC;
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
