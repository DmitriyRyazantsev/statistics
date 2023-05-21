package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test

    public void testsum_all_sale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sum(sales);
        int expected = 180;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void testaverage_sales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average_sales(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void testmaxSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSaleMonth(sales);
        long expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void testminSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSaleMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testbelow_average() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.below_average(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testabove_average() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.below_average(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}