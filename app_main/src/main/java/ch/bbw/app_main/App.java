package ch.bbw.app_main;

import ch.bbw.greeter.Greeter;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting App...");
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("User"));
    }
}

