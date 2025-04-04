package ticketsPackage;

public class Ticket {
    int ticketNo;
    String passengerName;
    String destination;

    public Ticket(int ticketNo, String passengerName, String destination) {
        this.ticketNo = ticketNo;
        this.passengerName = passengerName;
        this.destination = destination;
    }

    public void showTicket() {
        System.out.println("ticket no " + ticketNo);
        System.out.println("passenger: " + passengerName);
        System.out.println("destination: " + destination);
    }
}