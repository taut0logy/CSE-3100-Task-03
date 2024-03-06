package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggingSystemTest {

    @Test
    public void  instanceTest() {
        LoggingSystem instance1 = LoggingSystem.getInstance();
        LoggingSystem instance2 = LoggingSystem.getInstance();
        assertEquals(instance1.hashCode(), instance2.hashCode());
    }

}