import javax.swing.plaf.synth.SynthStyle;

public class CarDriver {
    public static void main(String[] args) {

        // --------------------------------------------------------------------------------- //
        // SPORTS CAR METHOD TESTS:
        // --------------------------------------------------------------------------------- //

        SportsCar mySportsCar = new SportsCar("Super Speedy SportsCar", 120, 200, 0, 0); // Set gasoline tank capacity and car's max speed

        mySportsCar.fillTank();

        for (int i = 0; i < 6; i++) {
            mySportsCar.accelerate();
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }

        while (mySportsCar.getSpeed() > 0) {
            mySportsCar.decelerate(15);
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }
        System.out.println();


        // --------------------------------------------------------------------------------- //
        // BUS METHOD TESTS:
        // --------------------------------------------------------------------------------- //

        Bus theBus = new Bus("Town Bus", 185, 100, 0, 0, 90);

        theBus.fillTank();

        for (int i = 0; i < 5; i++) {
            theBus.accelerate();
            System.out.println(theBus.getTypeName() + ": speed is " + theBus.getSpeed() + " km/h");
        }

        while (theBus.getSpeed() > 0) {
            theBus.decelerate(15);
            System.out.println(theBus.getTypeName() + ": speed is " + theBus.getSpeed() + " km/h");
        }

        for (int i = 0; i < 12; i++) {
            theBus.passengerEnter();
        }
        System.out.println("\n");

        for (int i = 0; i < 7; i++) {
            theBus.accelerate();
            System.out.println(theBus.getTypeName() + ": speed is " + theBus.getSpeed() + " km/h");
        }

        while (theBus.getSpeed() > 0) {
            theBus.decelerate(15);
            System.out.println(theBus.getTypeName() + ": speed is " + theBus.getSpeed() + " km/h");
        }

        for (int i = 0; i < 7; i++) {
            theBus.passengerExit();
        }

    }
}
