public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        System.out.println("\nThe coffee maker is " + myCoffeeMaker.onOrOff());// Check on/off status (It is off)

        myCoffeeMaker.turnOnOff(); // Press on/off switch (Switch on)
        System.out.println("\nThe coffee maker is " + myCoffeeMaker.onOrOff());

        System.out.println("\nThe coffee type is " + myCoffeeMaker.getCoffeeType());
        myCoffeeMaker.selectCoffeeType(); // Change coffee type.
        System.out.println("\nThe coffee type is " + myCoffeeMaker.getCoffeeType());

        myCoffeeMaker.turnOnOff(); // Switch the coffee maker off.
        // myCoffeeMaker.onOrOff();
        myCoffeeMaker.selectCoffeeType(); // Try to change coffee type.
        myCoffeeMaker.turnOnOff(); // Switch the coffee maker on.
        System.out.println("\nThe coffee type is " + myCoffeeMaker.getCoffeeType()); // It should still be the same it was earlier.


        System.out.println("\nThe amount is currently '" + myCoffeeMaker.getAmount() + "ml'."); // Check current amount
        myCoffeeMaker.moreCoffee(); // Change amount +10ml (max is 80ml)
        myCoffeeMaker.moreCoffee();
        myCoffeeMaker.moreCoffee();
        myCoffeeMaker.moreCoffee();
        myCoffeeMaker.moreCoffee();
        System.out.println("The amount is currently '" + myCoffeeMaker.getAmount() + "ml'.");
        myCoffeeMaker.lessCoffee(); // Change amount -10ml (min is 10ml)
        System.out.println("The amount is currently '" + myCoffeeMaker.getAmount() + "ml'.");

        myCoffeeMaker.turnOnOff();
        System.out.println("\nThe coffee maker is " + myCoffeeMaker.onOrOff());// Check on/off status (It is off)
    }
}
