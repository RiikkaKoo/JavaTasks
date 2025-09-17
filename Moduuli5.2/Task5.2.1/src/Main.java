/* Create a Java program that simulates a ticket reservation system
for a limited number of seats in a theater. Implement synchronization
to ensure that multiple threads representing customers can reserve seats
without exceeding the available capacity.
 */

public class Main {
    public static void main(String[] args) {

        int n = 15; // Customers
        int testRepeats = 2;

        for (int j = 0; j < testRepeats; j++) { // Repeat the test two times. There seems to be a very clear difference in the threads' work order. Why? Warming up -effect?

            Reservation.reset();
            System.out.println("\n");

            Tickets theTickets = new Tickets(20); // Create a Ticket object with ticket amount as a parameter.
            Thread[] threads = new Thread[n]; // An Array for the customers


            for (int i = 0; i < n; i++) {
                Thread customer = new Thread(new Reservation(theTickets, ((int)(Math.random()*5+1)))); // Create a customer (Thread). Parameters: Tickets -object, how many tickets to reserve (1-5)
                threads[i] = customer; // Add to the array
            }

            for (Thread thread : threads) {
                thread.start(); // Start the threads
            }

            try {
                for (Thread thread : threads) {
                    thread.join(); // Wait for the threads to complete work.
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
