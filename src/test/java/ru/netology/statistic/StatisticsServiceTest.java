package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculatesum(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAverageSum() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averagesum(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMaximumMonth() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maximummonth(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMinimumMonth() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minimummonth(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMinMonthCnt() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.minmonthcnt(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMaxMonthCnt() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.maxmonthcnt(purchases);

        assertEquals(expected, actual);

    }

}
