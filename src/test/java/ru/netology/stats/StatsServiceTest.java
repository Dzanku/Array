package ru.netology.stats;

//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {
    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15.0;
        double actual = service.calculateAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSumMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.sumMaxMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSumMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.sumMinMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMonthUnderAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthUnderAvg(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldamountMonthOverAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthOverAvg(sales);

        assertEquals(expected, actual);
    }
}
