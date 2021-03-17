package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemainBelowBoundary() {
        int purchase = 800;
        assertEquals(service.remain(purchase), 200);
    }

    @org.testng.annotations.Test
    public void shouldNotRemainEqualBoundary() {
         int purchase = 1000;
        assertEquals(service.remain(purchase), 0);
    }

    @org.testng.annotations.Test
    public void shouldRemainAboveBoundary() {
        int purchase = 1500;
        assertEquals(service.remain(purchase), 500);
    }

    @org.testng.annotations.Test
    public void shouldRemainBoundaryIfZeroPurchase() {
        int purchase = 0;
        assertEquals(service.remain(purchase), 1000);
    }
}