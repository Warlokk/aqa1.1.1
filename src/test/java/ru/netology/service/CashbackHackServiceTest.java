package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemainBelowBoundary() {
        int purchase = 800;
        assertEquals(200, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldNotRemainEqualBoundary() {
        int purchase = 1000;
        assertEquals(0, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldRemainAboveBoundary() {
        int purchase = 1500;
        assertEquals(500, service.remain(purchase));
    }

    @org.junit.Test
    public void shouldRemainBoundaryIfZeroPurchase() {
        int purchase = 0;
        assertEquals(1000, service.remain(purchase));
    }
}