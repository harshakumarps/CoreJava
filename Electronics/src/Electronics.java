public class Electronics {
    String deviceName;
    String brand;
    String category;
    double powerConsumption;
    double price;
    boolean isSmartDevice;
    int warrantyYears;
    String connectivityType;
    String batteryCapacity;
    int releaseYear;

    public Electronics() {
        this("Unknown Device", "Unknown Brand", "General", 50.0, 70000.0, false, 1, "Wired", "N/A", 2000);
    }

    public Electronics(String deviceName) {
        this(deviceName, "Unknown Brand", "General", 50.0, 70000.0, false, 1, "Wired", "N/A", 2000);
    }

    public Electronics(String deviceName, String brand) {
        this(deviceName, brand, "General", 50.0, 70000.0, false, 1, "Wired", "N/A", 2000);
    }

    public Electronics(String deviceName, String brand, String category) {
        this(deviceName, brand, category, 50.0, 70000.0, false, 1, "Wired", "N/A", 2000);
    }

    public Electronics(String deviceName, String brand, String category, double powerConsumption, double price,
                       boolean isSmartDevice, int warrantyYears, String connectivityType, String batteryCapacity,
                       int releaseYear) {
        this.deviceName = deviceName;
        this.brand = brand;
        this.category = category;
        this.powerConsumption = powerConsumption;
        this.price = price;
        this.isSmartDevice = isSmartDevice;
        this.warrantyYears = warrantyYears;
        this.connectivityType = connectivityType;
        this.batteryCapacity = batteryCapacity;
        this.releaseYear = releaseYear;
    }

    public void displayInfo() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + category);
        System.out.println("Power Consumption: " + powerConsumption + " watts");
        System.out.println("Price: rs-" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Connectivity: " + connectivityType);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Release Year: " + releaseYear);
        System.out.println();
    }
}


