package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testInitialPoints() {
        Customer c = new Customer("Test");
        assertEquals(0, c.getPoints());
    }

    @Test
    void testAddPoints() {
        Customer c = new Customer("Test");
        c.addPoints();
        assertEquals(10, c.getPoints());
    }

    @Test
    void testRedeemSuccess() {
        Customer c = new Customer("Test");
        for (int i = 0; i < 5; i++) {
            c.addPoints();
        }
        c.redeemPoints();
        assertEquals(0, c.getPoints());
    }

    @Test
    void testRedeemFailure() {
        Customer c = new Customer("Test");
        c.redeemPoints();
        assertEquals(0, c.getPoints());
    }
}