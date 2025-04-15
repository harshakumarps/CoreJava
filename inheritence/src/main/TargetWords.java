package main;

public class TargetWords {
    public static void main(String[] args) {
        String sentence = "Java is fun and powerful";
        String target = "fun";
        boolean found = false;
        String[] words = sentence.split(" ");
        System.out.println("hii");

        for (String word : words) {
            if (word.equals(target)) {
                System.out.println("Is target word present? " + found);
            }
        }

    }
}
