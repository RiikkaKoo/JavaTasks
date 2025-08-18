import java.util.Scanner;

public class ThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        //System.out.println("The average of the numbers is " + ((first + second + third)/3)); // This gives an integer
        System.out.println("The average of the numbers is " + ((double)(first + second + third)/3));
        /* Without the double-typecast the calculated average would be displayed as an integer since all the
        user input numbers are integers. Typecasting the calculations for the average as double gives
        us a more exact value.
         */
    }
}
