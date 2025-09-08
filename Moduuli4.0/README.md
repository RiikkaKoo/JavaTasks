### THE CALCULATOR PROGRAM
The calculator program lets the user add positive integers together. 
The user can also reset the total to zero, look at the current total, 
or exit the program. This file shows the code for the program and explains how it works.

Here is the code for the calculator program:


```java
import java.util.Scanner;

public class Calculator {
private int currentValue;

    // Method that adds two positive integers to a current value
    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed.");
        }
        currentValue += value;
    }

    // Method that resets the current value to zero
    public void reset() {
        currentValue = 0;
    }

    // Method that returns the current value
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
```
### How the Code Works:

The calculator program is a simple Java application that allows the user to add positive integer values together. 
The main features are:

- **Adding Positive Integers (`add(int value)`):**  
  This method takes a positive integer as input and adds it to the calculator's current total.  
  If the input value is negative, the method throws an `IllegalArgumentException` and the program displays an error message.  
  This ensures only positive values are added.

- **Resetting the Value (`reset()`):**  
  This method sets the calculator's current total back to zero.  
  It can be used at any time to clear the accumulated value.

- **Viewing the Current Value (`getCurrentValue()`):**  
  This method returns the current total stored in the calculator.  
  The user can use this option to see the result of their additions or after a reset.

- **Exiting the Program:**  
  The user can exit the program from the menu.

The program uses a loop to repeatedly show a menu and process the user's choice. 
Input is handled using a `Scanner`. The logic for adding, resetting, and getting 
the current value is encapsulated in the `Calculator` class.
