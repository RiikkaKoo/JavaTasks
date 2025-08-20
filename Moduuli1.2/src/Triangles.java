import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Let's calculate the hypotenuse!\nGive the length of the first side of the triangle: ");
        double firstSide = Double.parseDouble(userInput.nextLine());
        System.out.println("Give the length of the second side of the triangle: ");
        double secondSide = Double.parseDouble(userInput.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));

        System.out.printf("The hypotenuse of this triangle is: %.2f", hypotenuse);
    }
}
