package ticketsPackage;
public class TrainRunner {
    public static void main(String[] args) {
        Train[] trains = {
                new Train(201, "Jan Shatabdi", "Bengaluru", "Mysuru"),
                new Train(202, "Kaveri Express", "Chennai", "Mysuru"),
                new Train(203, "Mysuru Express", "Hyderabad", "Mysuru"),
                new Train(204, "Malnad Express", "Chikkamagaluru", "Bengaluru")
        };

        System.out.println("Train Details:");
        System.out.println("====================");
        for (Train train : trains) {
            train.showTrain();
            System.out.println("--------------------");
        }
    }
}

