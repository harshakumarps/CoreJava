public class AirplaneRunner {
    public static void main(String[] args) {
        Airplane indigo = new Airplane("IndiGo", "India", 180, 100, "Gurugram", 3.5, 23000, "None", 2006, "6E");
        Airplane spiceJet = new Airplane("SpiceJet");

        System.out.println("Airplane Information ");
        indigo.displayInfo();
        spiceJet.displayInfo();
    }
}
