package ticketsPackage;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(101, "RaviRani", "Chikkamagaluru");
        Ticket ticket2 = new Ticket(102, "HithuRavi", "Mysore");
        Ticket ticket3 = new Ticket(103, "PervertRavi", "Mysore");
        Ticket ticket4 = new Ticket(104, "RasikaRavi", "Bus Stand");

        System.out.println("Ticket Details:");
        System.out.println("----------------");
        ticket1.showTicket();

        System.out.println("Ticket Details:");
        System.out.println("----------------");
        ticket2.showTicket();

        System.out.println("Ticket Details:");
        System.out.println("----------------");
        ticket3.showTicket();

        System.out.println("Ticket Details:");
        System.out.println("----------------");
        ticket4.showTicket();
    }
}
