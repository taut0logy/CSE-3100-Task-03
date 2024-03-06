package org.example;

public class DatabaseLogger extends Logger{
    @Override
    public String getType() {
        return "database";
    }

    @Override
    public void log(String message, String level) throws IllegalArgumentException {
        System.out.println("[ DATABASE Logger] " + level.toUpperCase() + ": " + message);
    }
}
