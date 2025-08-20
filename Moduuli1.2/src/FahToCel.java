import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Give Fahrenheits to convert: ");
        double f = Double.parseDouble(userInput.nextLine());
        //double f = userInput.nextDouble();
        double c = (f - 32) * 5 / 9;

        System.out.printf(f + "°F to Celsius is: %.1f°C", c);
    }
}
