package ColorPackage;

public class Photography {
    BlackAndWhite blackAndWhite;
    String photographer;

    public Photography(String photographer, BlackAndWhite blackAndWhite) {
        this.blackAndWhite = blackAndWhite;
        this.photographer = photographer;
    }

    public void displayPhotoDetails() {
        if (blackAndWhite != null) {
            blackAndWhite.showDetails();
        } else {
            System.err.println("BlackAndWhite instance is null");
        }
        System.out.println("Photographer Name: " + this.photographer);
    }
}
