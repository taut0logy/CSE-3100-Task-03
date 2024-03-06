package org.example;

public class InfoLogger extends Logger {
    private final String type = "info";
    public InfoLogger() {
        super();
    }

    public void log(String message, String level) {
        if (levels.contains(level)) {
            System.out.println("[ INFO Logger] " + level.toUpperCase() + ": " + message);
        } else {
            throw new IllegalArgumentException("Invalid log level");
        }
    }

    public String getType() {
        return type;
    }

}
