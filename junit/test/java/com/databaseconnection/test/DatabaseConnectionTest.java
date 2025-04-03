package com.databaseconnection.test;
// DatabaseConnectionTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.databaseconnection.DatabaseConnection;
import org.junit.jupiter.api.*;

class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    // This method runs before each test
    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    // Test to check if the connection is established
    @Test
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    // This method runs after each test
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }
}
