package GoldPackage;

public class Jewllery {
    Gold gold;
    String name;

    public Jewllery(String name, Gold gold) {
        this.gold = gold;
        this.name = name;
    }

    public void JewlleryShop() {
        if (gold != null) {
            System.out.println("Jewellery Name: " + name);
            gold.carot();
        } else {
            System.err.println("The gold instance is null ");
        }
    }
}
