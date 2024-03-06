package org.example;

public class FileLogger extends Logger{
    private final String type = "file";
    public FileLogger() {
        super();
    }

    public void log(String message, String level) {
        if (levels.contains(level)) {
            System.out.println("[ FILE Logger] " + level.toUpperCase() + ": " + message);
        } else {
            throw new IllegalArgumentException("Invalid log level");
        }
    }

    public String getType() {
        return type;
    }
}
