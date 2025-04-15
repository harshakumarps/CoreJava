package main;

public class ClassString {
    public static void main(String[] args) {
        String name="harsha";
        String u_name=name.concat(" Kumar");
        System.out.println("name :"+name);
        System.out.println("u_name :"+u_name);
        String u_1name="harsha";
        if(name==u_1name){
            System.out.println("matching");

        }else {
            System.out.println("not matching");
        }
    }
}
