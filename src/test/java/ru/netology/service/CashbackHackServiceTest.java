package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemainBelowBoundary() {
        int purchase = 800;
        org.junit.Assert.assertEquals(200, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldNotRemainEqualBoundary() {
        int purchase = 1000;
        org.junit.Assert.assertEquals(0, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldRemainAboveBoundary() {
        int purchase = 1500;
        org.junit.Assert.assertEquals(500, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldRemainBoundaryIfZeroPurchase() {
        int purchase = 0;
        org.junit.Assert.assertEquals(1000, service.remain(purchase));
    }

    @Test
    public void shouldRemainBelowBoundary5() {
        int purchase = 800;
        assertEquals(200, service.remain(purchase));
    }

    @Test
    public void shouldNotRemainEqualBoundary5() {
        int purchase = 1000;
        assertEquals(0, service.remain(purchase));
    }

    @Test
    public void shouldRemainAboveBoundary5() {
        int purchase = 1500;
        assertEquals(500, service.remain(purchase));
    }

    @Test
    public void shouldRemainBoundaryIfZeroPurchase5() {
        int purchase = 0;
        assertEquals(1000, service.remain(purchase));
    }
}