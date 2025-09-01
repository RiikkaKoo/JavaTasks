class ElectricMotorcycle extends AbstractVehicle {
    private double batteryLevel;
    private double batteryCap;

    public ElectricMotorcycle(String type, String fuel, String colour, int capacity, double efficiency) {
        super(type, fuel, colour, capacity, efficiency);;
    }

    @Override
    public String calculateFuelEfficiency() {
        return super.calculateFuelEfficiency() + " kWh";
    }

    @Override
    public void charge() {
        System.out.println("\nThe electric motorcycle was charged");
    }
}
