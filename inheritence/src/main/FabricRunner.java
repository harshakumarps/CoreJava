package main;

import com.xworkz.fabric.Thread;

public class FabricRunner {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.property();
        thread.use();
        thread.function();
    }
}
