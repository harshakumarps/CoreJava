package GoldPackage;

public class GoldRunner {
    public static void main(String[] args) {
        Gold gold = new Gold();
        String name = "Diamond Ring";
        Jewllery jewellery = new Jewllery(name, gold);
        jewellery.JewlleryShop();
    }
}
