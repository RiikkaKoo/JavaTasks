import java.util.Scanner;

public class BinaryValues {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Give a binary number: ");
        String bin = userInput.nextLine();
        int dec = 0;
        int p = 0;
        for (int i = bin.length() - 1; i >= 0; i--) { // Read the binary number from RIGHT to LEFT
            char bit = bin.charAt(i);
            if (bit == '1') {
                dec += (int)Math.pow(2, p);
            }
            p++;
        }
        System.out.println("In decimal: " + dec);
    }
}
