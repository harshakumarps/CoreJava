package main;

public class Count {
    public static void main(String[] args) {
        String sentence = "hello my name is harsha";

        // Split based on one or more spaces
        String[] words = sentence.trim().split(" ");

        System.out.println("Number of words: " + words.length);
    }
}
