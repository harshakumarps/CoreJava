package main;

import com.xworkz.safety.Lock;

public class SecurityRunner {
    public static void main(String[] args) {
        Lock lock = new Lock();
        lock.purpose();
        lock.type();
    }
}
