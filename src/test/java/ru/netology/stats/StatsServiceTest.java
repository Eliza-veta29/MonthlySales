package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        StatsService service = new StatsService();
        long actual = service.sumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumOfAllSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        StatsService service = new StatsService();
        long actual = service.averageSumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        StatsService service = new StatsService();
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        StatsService service = new StatsService();
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWithBelowAverageSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.numberOfMonthsWithBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWithAboveAverageSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.numberOfMonthsWithAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}