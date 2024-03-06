package org.example;

public class ErrorLogger extends Logger {
    private final String type = "error";
    public ErrorLogger() {
        super();
    }

    public void log(String message, String level) {
        if (levels.contains(level)) {
            System.out.println("[ ERROR Logger] " + level.toUpperCase() + ": " + message);
        } else {
            throw new IllegalArgumentException("Invalid log level");
        }
    }

    public String getType() {
        return type;
    }
}
