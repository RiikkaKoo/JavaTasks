public class CarDriver {
    public static void main(String[] args) {
        CruiseCar myCar;

        myCar = new CruiseCar("Toyota Corolla", 120, 160); // Set gasoline tank capacity and car's max speed
        myCar.fillTank();

        myCar.setTargetSpeed(120); // Set a target speed
        System.out.println("Current speed: " + myCar.getSpeed() + " km/h"); // Check current speed

        myCar.cruiseOnOffSwitch(); // Turn cruising on. It will stay on until turned off if taget speed can be reached.
        myCar.cruiseOnOffSwitch(); // Turn cruising off.

        myCar.cruiseOnOffSwitch(); // Turn cruising on without changing taget speed.
        myCar.setTargetSpeed(60); // Set a new target speed while cruising is on.

        myCar.setTargetSpeed(15); // Set it too low. CruiseControl will be switched off.

        myCar.setTargetSpeed(35); // Try again.
        myCar.cruiseOnOffSwitch(); // Turn CruiseControl on.

        System.out.println("Current speed: " + myCar.getSpeed() + " km/h");
        myCar.cruiseOnOffSwitch();
    }
}