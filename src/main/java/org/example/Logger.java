package org.example;

import java.util.ArrayList;

public abstract class Logger {

    protected final ArrayList<String> levels;

    public Logger() {
        levels = new ArrayList<String>();
        levels.add("info");
        levels.add("debug");
        levels.add("warning");
    }

    public void addLevel(String level) {
        if (!levels.contains(level)) {
            levels.add(level);
        }
    }


    public  abstract void log(String message, String level) throws IllegalArgumentException ;

    public abstract String getType();
}
