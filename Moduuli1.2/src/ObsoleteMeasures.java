import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double luotiG = 13.28;
        double naulaG = 32 * luotiG; // Yhden naulan paino
        double leviskaG = 20 * naulaG; // Yhden leviskän paino

        System.out.println("Give weight in grams: ");
        double w = userInput.nextDouble();

        int leviskatKPL = (int) (w / leviskaG); // Kuinka monta leviskaa annettuun painoon mahtuu.
        double weightLeft = w - (leviskatKPL * leviskaG); // Miten paljon painoa on jäljellä, kun siitä otetaan pois leviskät.

        int naulatKPL = (int) (weightLeft / naulaG);
        weightLeft = weightLeft - (naulatKPL * naulaG);

        double luoditKPL = weightLeft / luotiG;

        System.out.printf("%.2f grams is %d leviskä, %d naula and %.2f luoti.", w, leviskatKPL, naulatKPL, luoditKPL);
    }
}

