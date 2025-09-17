public class Reservation implements Runnable {

    private static int count;
    private int id;
    private Tickets tickets;
    private int amount;

    public Reservation(Tickets tickets, int amount) {
        count++;
        this.id = count;
        this.tickets = tickets;
        this.amount = amount;

    }

    public static void reset() {
        count = 0;
    }

    public void run() {
        this.tickets.reserveTickets(this.amount, this.id);
    }
}
