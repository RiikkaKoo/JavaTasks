public class Tickets {

    private int availableTickets;

    public Tickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public int getAvailableTickets() {
        return this.availableTickets;
    }

    public void reserveTickets(int tickets, int customer) {
        synchronized (this) {
            if ((this.availableTickets - tickets) >= 0) { // Enough tickets available
                this.availableTickets = this.availableTickets - tickets;
                System.out.println("Customer " + customer + " reserved " + tickets + " tickets.");
            } else { // Not enough tickets available
                System.out.println("Customer " + customer + " could not reserve " + tickets + " tickets. Tickets available: " + availableTickets);
            }
        }
    }
}
