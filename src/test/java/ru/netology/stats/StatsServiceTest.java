package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void testSum() {
        StatsService statsService = new StatsService();

        long[] testData = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = statsService.calculateSum(testData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAverage() {
        StatsService statsService = new StatsService();

        long[] testData = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = statsService.calculateAverage(testData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMin() {
        StatsService statsService = new StatsService();

        long[] testData = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = statsService.minSales(testData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMax() {
        StatsService statsService = new StatsService();

        long[] testData = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = statsService.maxSales(testData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMoreThanAverage() {
        StatsService statsService = new StatsService();

        long[] testData = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = statsService.moreThanAverage(testData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testLessThanAverage() {
        StatsService statsService = new StatsService();

        long[] testData = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = statsService.lessThanAverage(testData);
        Assertions.assertEquals(expected, actual);
    }


}
