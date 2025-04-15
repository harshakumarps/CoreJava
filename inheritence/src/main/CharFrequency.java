package main;

public class CharFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        System.out.println("hii");


        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c != ' ') {
                int count = 0;
                for (int j = 0; j < sentence.length(); j++) {
                    if (c == sentence.charAt(j)) {
                        count++;
                    }
                }

                System.out.println(c + ": " + count);
                sentence = sentence.replace(c, ' ');
            }
        }
    }
}
