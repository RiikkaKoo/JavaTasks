public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");

        Vehicle car = new Car("Car", "Petrol", "Blue");
        Vehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Orange");
        Vehicle bus = new Bus("Bus", "Diesel", 56);

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
    }
}
