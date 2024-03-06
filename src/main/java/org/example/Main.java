package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LoggingSystem ls=LoggingSystem.getInstance();
        ls.getLogger("file").log("This is an info message", "info");
        ls.getLogger("file").log("This is a debug message", "debug");
        ls.getLogger("file").addLevel("Warning");
        ls.getLogger("file").log("This is a warning message", "warning");
        ls.addLogger(new DatabaseLogger());
        ls.getLogger("database").log("Hi","debug" );
    }
}