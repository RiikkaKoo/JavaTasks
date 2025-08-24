import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] firstnames = {"Aapo", "Vilho", "Elmeri", "Julius", "Molla", "Ilona", "Nelli", "Hilma"};
        String[] lastnames = {"Niemi", "Kumpula", "Virtanen", "Korhonen", "Nurminen"};

        System.out.println("How many names do you want to generate?: ");
        int goal = userInput.nextInt();

        int generated = 0;
        if (goal > 0) {
            System.out.printf("Here are %d randomly generated names: \n", goal);
            do {
                int fIndex = (int)(Math.random()*8); // Numero 0-7
                int lIndex = (int)(Math.random()*5); // Numero 0-4
                String genFirstname = firstnames[fIndex], genLastname = lastnames[lIndex];
                System.out.println(genFirstname + " " + genLastname);
                generated++;
            } while (generated < goal);
        }
    }
}