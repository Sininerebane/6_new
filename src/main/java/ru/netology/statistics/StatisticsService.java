package ru.netology.statistics;

import java.util.Arrays;

public class StatisticsService {
    public int calculatesum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            //    sum = sum + purchase;
            sum += purchase;

        }
        return sum;
    }

    public int averagesum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            //    sum = sum + purchase;
            sum += purchase;

        }
        return sum / purchases.length;
    }

    public int maximummonth(int[] purchases) {
        int max = 0;
        int month = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (max <= purchases[i]) {
                max = purchases[i];
                month = i + 1;
            }
        }

        return month;
    }

    public int minimummonth(int[] purchases) {
        int min = Arrays.stream(purchases).max().getAsInt();
        int month = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (min >= purchases[i]) {
                min = purchases[i];
                month = i + 1;
            }
        }

        return month;
    }

    public int minmonthcnt(int[] purchases) {
        double avg = Arrays.stream(purchases).average().getAsDouble();
        int month = 0;
        for (int purchase : purchases) {
            if (purchase < avg) {
                //month = month+1
                month++;
            }

        }

        return month;
    }

    public int maxmonthcnt(int[] purchases) {
        double avg = Arrays.stream(purchases).average().getAsDouble();
        int month = 0;
        for (int purchase : purchases) {
            if (purchase > avg) {
                //month = month+1
                month++;
            }

        }

        return month;
    }

}