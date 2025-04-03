package ColorPackage;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        BlackAndWhite bw = new BlackAndWhite("Monochrome", "High Contrast");
        Photography photo = new Photography("Ansel Adams", bw);
        photo.displayPhotoDetails();
    }
}
