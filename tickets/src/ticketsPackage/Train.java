package ticketsPackage;

public class Train {
    int trainNo;
    String trainName;
    String source;
    String destination;

    public Train(int trainNo, String trainName, String source, String destination) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
    }

    public void showTrain() {
        System.out.println("Train No      : " + trainNo);
        System.out.println("Train Name    : " + trainName);
        System.out.println("Source        : " + source);
        System.out.println("Destination   : " + destination);
    }
}
