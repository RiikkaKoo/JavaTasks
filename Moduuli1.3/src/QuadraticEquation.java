import java.util.Scanner;

public class QuadraticEquation {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's calculate the roots of a quadratic equation (ax^2 + bx + c = 0).\n" +
                "Give the value of a: ");
        double a = Double.parseDouble(userInput.nextLine());
        System.out.println("Give the value of b: ");
        double b = Double.parseDouble(userInput.nextLine());
        System.out.println("Give the value of c: ");
        double c = Double.parseDouble(userInput.nextLine());

        double discriminant = Math.pow(b, 2) - 4*a*c;
        //System.out.println(discriminant);
        if (discriminant <= 0) {
            System.out.println("This equation has no real roots.");
        }
        else {
            double root1 = (-b + (Math.sqrt(discriminant)))/(2*a);
            double root2 = (-b - (Math.sqrt(discriminant)))/(2*a);
            System.out.printf("The roots of this equation are %.4f and %.4f.", root1, root2);

        }

    }
}
