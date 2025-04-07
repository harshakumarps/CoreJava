package ticketsPackage;
`
public class VillageRunner {
    public static void main(String[] args) {
        Village[] villages = {
                new Village(301, "Halebeedu", "Hassan", 3500),
                new Village(302, "Belavadi", "Chikkamagaluru", 2200),
                new Village(303, "Kadur", "Chikkamagaluru", 1800),
                new Village(304, "Hiremagalur", "Chikkamagaluru", 4100)
        };

        System.out.println("Village Details:");
        System.out.println("====================");
        for (Village village : villages) {
            village.showVillage();
            System.out.println("--------------------");
        }
    }
}
