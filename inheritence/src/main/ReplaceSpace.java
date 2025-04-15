package main;

public class ReplaceSpace {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String replaced = sentence.replace(' ', '%');
        System.out.println("After replacing space: " + replaced);
    }
}

