class ElectricCar extends AbstractVehicle {

    public ElectricCar(String type, String fuel, String colour, int capacity, double efficiency) {
        super(type, fuel, colour, capacity, efficiency);
    }

    @Override
    public String calculateFuelEfficiency() {
        return super.calculateFuelEfficiency() + " kWh";
    }

    @Override
    public void charge() {
        System.out.println("\nThe electric car was charged.");
    }
}
