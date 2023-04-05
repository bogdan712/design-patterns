package com.kreitek.pets.patrones;

public class Logger {
    private static int counter = 0;

    public void debug(String message) {
        System.out.println("[debug][" + counter++ + "] - " + message);
    }
}
