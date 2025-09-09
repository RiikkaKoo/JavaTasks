import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GenerateFibonacci {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("fibonacci.csv"); // Create or overwrite the file fibonacci.csv.
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            bufferedWriter.write("Index" + ";" + "Number"); // CSV header
            bufferedWriter.newLine();

            int n = 61;
            long[] fibonacci = new long[n]; // Collect the Fibonacci numbers into this array.
            fibonacci[0] = 0; // The first Fibonacci number is 0.
            fibonacci[1] = 1; // The second Fibonacci number is 1.


            for (int i = 2; i < n; i++) {
                long fiboNumber = fibonacci[i-2] + fibonacci[i-1]; // Calculate the next Fibonacci number.
                // System.out.println(seq);
                fibonacci[i] = fiboNumber; // Store the calculated Fibonacci number into the array with a correct index number (i).
            }

            for (int i = 0; i < fibonacci.length; i++) {
                bufferedWriter.write(i + 1 + ";" + fibonacci[i]); // Write the index of the number (i+1) and the Fibonacci number to the CSV file.
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
            System.out.println("The first " + n + " Fibonacci numbers generated. Check the fibonacci.csv file in the root file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
