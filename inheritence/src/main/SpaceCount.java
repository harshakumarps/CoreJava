package main;

public class SpaceCount {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        int count = 0;

        // Loop through each character
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of spaces: " + count);
    }
}
