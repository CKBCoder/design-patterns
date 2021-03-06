package com.braindevoiler.designpattern.creational.singleton;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // Double checked locking (Works in Java 5 or above)
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
