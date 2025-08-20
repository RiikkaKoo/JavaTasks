import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean complete = false;

        System.out.println("A Multiplication test: ");
        while (!complete) {
            int points = 0, questions = 0;
            do {
                int num1 = (int)(Math.random()*10) + 1, num2 = (int)(Math.random()*10) + 1;
                System.out.printf("What is %d x %d? ", num1, num2);
                int correct = num1*num2;
                int answer = userInput.nextInt();
                if (answer == correct) {
                    points++;
                }
                questions++;
            } while (questions < 10);
            if (points == 10) {
                System.out.printf("Points: %d/10\nCongratulations on mastering the multiplication tables!", points);
                complete = true;
            } else {
                System.out.printf("Points: %d/10\nPlease try again.\n", points);
            }
        }
    }
}
