public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");

        Car car = new Car("Car", "Petrol", "Blue", 4, 0.8);
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Orange", 1, 0.18);
        Bus bus = new Bus("Bus", "Diesel", "Green" , 56, 1.2);
        ElectricMotorcycle eMotorcycle = new ElectricMotorcycle("Electric Motorcycle", "Electricity", "Purple", 1, 20);
        ElectricCar eCar = new ElectricCar("Electric Car", "Electricity", "Grey", 2, 90);

        System.out.println();

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        System.out.println();

        eMotorcycle.start();
        eMotorcycle.stop();
        System.out.println(eMotorcycle.getInfo());
        System.out.println();

        eCar.start();
        eCar.stop();
        System.out.println(eCar.getInfo());
        System.out.println();


        for (int i = 0; i < 6; i++) {
            bus.passengerEnter();
        }
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            bus.passengerExit();
        }
        System.out.println();

        motorcycle.passengerEnter();
        motorcycle.passengerEnter();
        motorcycle.passengerExit();
        System.out.println();

        car.charge();
        eMotorcycle.charge();
        System.out.println();

        System.out.println("The fuel efficiency of the bus is " + bus.calculateFuelEfficiency());
        System.out.println("The fuel efficiency of the electric car is " + eCar.calculateFuelEfficiency());
    }
}
