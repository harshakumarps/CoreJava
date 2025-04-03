public class Airplane {
    String airlineName;
    String country;
    int passengerCapacity;
    int totalDestinations;
    String headOffice;
    double totalRevenue;
    int staffCount;
    String airlineAlliance;
    int yearFounded;
    String airlineCode;

    public Airplane() {
        this("Unknown Airline", "Unknown Country", 100, 10, "Unknown Office", 1.0, 500, "None", 2000, "XXX");
    }


    public Airplane(String airlineName) {
        this(airlineName, "Unknown Country", 100, 10, "Unknown Office", 1.0, 500, "None", 2000, "XXX");
    }
    public Airplane(String airlineName, String country) {
        this(airlineName, country, 100, 10, "Unknown Office", 1.0, 500, "None", 2000, "XXX");
    }

    public Airplane(String airlineName, String country, int passengerCapacity) {
        this(airlineName, country, passengerCapacity, 10, "Unknown Office", 1.0, 500, "None", 2000, "XXX");
    }

    public Airplane(String airlineName, String country, int passengerCapacity, int totalDestinations, String headOffice,
                    double totalRevenue, int staffCount, String airlineAlliance, int yearFounded, String airlineCode) {
        this.airlineName = airlineName;
        this.country = country;
        this.passengerCapacity = passengerCapacity;
        this.totalDestinations = totalDestinations;
        this.headOffice = headOffice;
        this.totalRevenue = totalRevenue;
        this.staffCount = staffCount;
        this.airlineAlliance = airlineAlliance;
        this.yearFounded = yearFounded;
        this.airlineCode = airlineCode;
    }

    public void displayInfo() {

        System.out.println("Name: " + airlineName);
        System.out.println("Country: " + country);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Destinations: " + totalDestinations);
        System.out.println("Head Office: " + headOffice);
        System.out.println("Revenue: " + totalRevenue + " billion");
        System.out.println("Staff Count: " + staffCount);
        System.out.println("Alliance: " + airlineAlliance);
        System.out.println("Year Founded: " + yearFounded);
        System.out.println("Airline Code: " + airlineCode);
        System.out.println();
    }
}