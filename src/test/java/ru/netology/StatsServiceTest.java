package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    public int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void shouldSum() {
        int expected = 180;
        int actual = service.findSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        int expected = 15;
        int actual = service.findAverage(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldGetMaxMonth() {
        int expected = 8;
        int actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinMonth() {
        int expected = 9;
        int actual = service.findMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldUnderAverage() {
        int expected = 5;
        int actual = service.findUnderAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldOverAverage() {
        int expected = 5;
        int actual = service.findOverAverage(purchases);
        assertEquals(expected, actual);
    }

}