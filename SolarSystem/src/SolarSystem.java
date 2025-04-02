public class SolarSystem {
    String name;
    int numberOfPlanets;
    String starName;
    double ageInBillionYears;
    int knownMoons;
    boolean hasAsteroidBelt;
    String galaxyName;
    int dwarfPlanets;
    String largestPlanet;
    double distanceFromEarth; // in light-years

    public SolarSystem() {
        this("Unknown System", 8, "Unknown Star", 4.6, 200, true, "Milky Way", 5, "Jupiter", 0.0);
    }

    public SolarSystem(String name) {
        this(name, 8, "Sun", 4.6, 200, true, "Milky Way", 5, "Jupiter", 0.0);
    }

    public SolarSystem(String name, int numberOfPlanets) {
        this(name, numberOfPlanets, "Sun", 4.6, 200, true, "Milky Way", 5, "Jupiter", 0.0);
    }

    public SolarSystem(String name, int numberOfPlanets, String starName) {
        this(name, numberOfPlanets, starName, 4.6, 200, true, "Milky Way", 5, "Jupiter", 0.0);
    }

    public SolarSystem(String name, int numberOfPlanets, String starName, double ageInBillionYears,
                       int knownMoons, boolean hasAsteroidBelt, String galaxyName, int dwarfPlanets,
                       String largestPlanet, double distanceFromEarth) {
        this.name = name;
        this.numberOfPlanets = numberOfPlanets;
        this.starName = starName;
        this.ageInBillionYears = ageInBillionYears;
        this.knownMoons = knownMoons;
        this.hasAsteroidBelt = hasAsteroidBelt;
        this.galaxyName = galaxyName;
        this.dwarfPlanets = dwarfPlanets;
        this.largestPlanet = largestPlanet;
        this.distanceFromEarth = distanceFromEarth;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Star Name: " + starName);
        System.out.println("Age: " + ageInBillionYears + " billion years");
        System.out.println("Known Moons: " + knownMoons);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Dwarf Planets: " + dwarfPlanets);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Distance from Earth: " + distanceFromEarth + " light-years");
        System.out.println();
    }
}