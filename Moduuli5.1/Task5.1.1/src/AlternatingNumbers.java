import java.util.Scanner;

public class AlternatingNumbers implements Runnable {

    private final boolean IS_ODD;
    private int oddCount = 1;
    private int evenCount = 2;
    private static int LAST_NUM;
    private int delay;

    public AlternatingNumbers(boolean odd, int delay) {
        this.IS_ODD = odd;
        this.delay = delay;
    }

    public static void setLastNum(int theLastNum) {
        LAST_NUM = theLastNum;
    }

    public void run() {
        try {
            while (true) {
                if (this.IS_ODD && this.oddCount <= LAST_NUM) { // For odd numbers
                    System.out.println("Odd thread: " + this.oddCount);
                    this.oddCount += 2;;
                } else if (!this.IS_ODD && this.evenCount <= LAST_NUM) { // For even numbers
                    System.out.println("Even thread: " + (this.evenCount));
                    this.evenCount += 2;
                } else {
                    break; // Stop the loop when the last number has been printed.
                }
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) { // Catch the exception for the Thread.sleep()
            System.out.println("Thread interrupted.");
        }

    }

    public static void main(String[] args) {
        Runnable oddsRunnable = new AlternatingNumbers(true, 350); // Create a printer for ODD numbers (first parameter "true")
        Runnable evensRunnable = new AlternatingNumbers(false, 190); // Create a printer for EVEN numbers (first parameter "false")

        // Make them into Threads:
        Thread odds = new Thread(oddsRunnable);
        Thread evens = new Thread(evensRunnable);

        // Get the last number to be printed from the user:
        boolean lastnumGot = false;
        int lastnum;
        while (!lastnumGot) {
            try {
                System.out.println("Give the last number to be printed (must be a positive integer): ");
                lastnum = new Scanner(System.in).nextInt(); // Create a new scanner everytime to clear the buffer after an exception.
                if (lastnum > 0) {
                    AlternatingNumbers.setLastNum(lastnum);
                    lastnumGot = true;
                } else {
                    System.out.println("Not a positive integer.");
                }
            } catch (Exception e) {
                System.out.println("Not an integer.");
            }
        }

        // Start the Threads:
        System.out.println("\nSTART PRINTING: \n");
        odds.start();
        evens.start();

        // Wait for the Threads to be done:
        try {
            odds.join();
            evens.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nPRINTING COMPLETE.");


    }
}
