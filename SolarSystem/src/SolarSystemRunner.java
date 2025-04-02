public class SolarSystemRunner {
    public static void main(String[] args) {
        SolarSystem solar = new SolarSystem("Solar System", 8, "Sun", 4.6, 200, true, "Milky Way", 5, "Jupiter", 0.0);
        SolarSystem andromeda = new SolarSystem("Andromeda Alpha");

        System.out.println("Solar System Information ");


        solar.displayInfo();
    }
}