package main;

public class CharCount {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Number of characters: " + count);
    }
}
