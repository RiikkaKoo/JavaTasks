import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's find the prime numbers!");
        int start;
        // Ask for a starting number until a POSITIVE number is given:
        do {
            System.out.println("Give a positive starting number: ");
            start = userInput.nextInt();
        } while (start < 0);
        int end;
        // Ask for an ending number until a number that is larger thant the starting number is given:
        do {
            System.out.println("Give an ending number that is larger than the starting number: ");
            end = userInput.nextInt();
        } while (end <= start);
        System.out.println("Here are the prime numbers between the two given numbers: ");
        for (int i = start; i <= end; i++) { // Go through all the numbers from start to end (i)
            for (int i2 = 2; i2 <= i; i2++) { // Check if the current number can be divided with another smaller number (i2)
                if (i%i2 == 0 && i2 < i) { // If so, it is not a prime number  --> Stop checking
                    break;
                }
                else if (i%i2 == 0 && i2 == i) { // If not, it is a prime numbers --> Print it
                    System.out.print(i + "  ");
                }
            }
        }
    }
}
