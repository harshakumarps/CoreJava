public class ElectronicsRunner {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", "Dell", "Computer", 65.0, 100000.0, true, 3, "WiFi & Bluetooth", "5000mAh", 2023);
        Electronics smartphone = new Electronics("Smartphone", "Samsung");

        System.out.println("Electronics Information ");
        laptop.displayInfo();
        System.out.println();
        smartphone.displayInfo();
    }
}