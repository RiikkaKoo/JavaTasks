class Car extends AbstractVehicle {

    public Car(String type, String fuel, String colour, int capacity, double efficiency) {
        super(type, fuel, colour, capacity, efficiency);
    }

    @Override
    public String calculateFuelEfficiency() {
        return super.calculateFuelEfficiency() + " l/km";
    }
}
