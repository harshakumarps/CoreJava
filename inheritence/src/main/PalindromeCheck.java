package main;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";
        System.out.println("hii");


        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }
    }
}
