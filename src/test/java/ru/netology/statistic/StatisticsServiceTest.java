package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals (expected, actual);

    }

    @Test
    void averageSum () {
        StatisticsService service = new StatisticsService();

        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSum (purchases);

        assertEquals (expected, actual);

    }
    @Test
    void maximumMonth () {
        StatisticsService service = new StatisticsService();

        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maximumMonth (purchases);

        assertEquals (expected, actual);

    }

    @Test
    void minimumMonth () {
        StatisticsService service = new StatisticsService();

        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minimumMonth (purchases);

        assertEquals (expected, actual);

    }
    @Test
    void minMonthCnt () {
        StatisticsService service = new StatisticsService();

        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.minMonthCnt (purchases);

        assertEquals (expected, actual);

    }

    @Test
    void maxMonthCnt () {
        StatisticsService service = new StatisticsService();

        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.maxMonthCnt (purchases);

        assertEquals (expected, actual);

    }

}
