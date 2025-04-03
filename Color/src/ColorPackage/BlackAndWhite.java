package ColorPackage;

public class BlackAndWhite {
    String shade;
    String contrastLevel;

    public BlackAndWhite(String shade, String contrastLevel) {
        this.shade = shade;
        this.contrastLevel = contrastLevel;
        System.out.println("BLACK & WHITE DETAILS");
        System.out.println("----------------------");
    }

    public void showDetails() {
        System.out.println("Shade Type: " + this.shade);
        System.out.println("Contrast Level: " + this.contrastLevel);
    }
}
