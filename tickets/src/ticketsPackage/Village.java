package ticketsPackage;


public class Village {
    int villageCode;
    String villageName;
    String district;
    int population;

    public Village(int villageCode, String villageName, String district, int population) {
        this.villageCode = villageCode;
        this.villageName = villageName;
        this.district = district;
        this.population = population;
    }

    public void showVillage() {
        System.out.println("Village Code   : " + villageCode);
        System.out.println("Village Name   : " + villageName);
        System.out.println("District       : " + district);
        System.out.println("Population     : " + population);
    }
}

