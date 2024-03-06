package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoggingSystem {
        private static LoggingSystem instance;
        private final HashMap<String, Logger> loggers;


        private LoggingSystem() {
            loggers = new HashMap<>();
            loggers.put("file", new FileLogger());
            loggers.put("error", new ErrorLogger());
            loggers.put("console", new InfoLogger());
        }

        public static LoggingSystem getInstance() {
            if (instance == null) {
                instance = new LoggingSystem();
            }
            return instance;
        }

        protected void addLogger(Logger logger) throws IllegalArgumentException {
            if(loggers.containsKey(logger.getType())) {
                throw new IllegalArgumentException("Logger already exists");
            } else {
                loggers.put(logger.getType(), logger);
            }
        }

        public Logger getLogger(String type) throws IllegalArgumentException {
            if (loggers.containsKey(type)) {
                return loggers.get(type);
            } else {
                throw new IllegalArgumentException("Logger does not exist");
            }
        }


}
