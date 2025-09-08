import java.util.Scanner;

public class Calculator {
    private int currentValue;

    /**
     * Adds a positive integer to the current value.
     * If the input value is negative, throws an IllegalArgumentException.
     *
     * @param value the positive integer to add
     * @throws IllegalArgumentException if value is negative
     */
    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed.");
        }
        currentValue += value;
    }

    /**
     * Resets the current value to zero.
     * This method can be used to clear the calculator's total.
     */
    public void reset() {
        currentValue = 0;
    }

    /**
     * Returns the current value stored in the calculator.
     *
     * @return the current total value
     */
    public int getCurrentValue() {
        return currentValue;
    }

    // Main method: lets user add positive integers, reset the value, and get the current value
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a positive integer");
            System.out.println("2. Reset value");
            System.out.println("3. Show current value");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a positive integer to add: ");
                    int value = scanner.nextInt();
                    try {
                        calc.add(value);
                        System.out.println("Added " + value + ".");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    calc.reset();
                    System.out.println("Value reset.");
                    break;
                case 3:
                    System.out.println("Current value: " + calc.getCurrentValue());
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
