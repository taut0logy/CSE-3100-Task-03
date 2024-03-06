package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {



    @Test
    public void testFileLogger() {
        Logger fileLogger = new FileLogger();
        fileLogger.addLevel("error");
        assertEquals(4, fileLogger.levels.size());
    }
}