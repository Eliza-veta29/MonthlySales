package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {

    public long sumOfAllSales(long @NotNull [] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSumOfAllSales(long[] sales) {
        long[] sumOfAllSales;
        return (sumOfAllSales(sales) / sales.length);

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numberOfMonthsWithBelowAverageSales(long[] sales) {
        int month = 0;
        long averageSum = averageSumOfAllSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (averageSum > sales[i]) {
                month = month + 1;
            }
        }
        return month;
    }

    public int numberOfMonthsWithAboveAverageSales(long[] sales) {
        int month = 0;
        long averageSum = averageSumOfAllSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (averageSum < sales[i]) {
                month = month + 1;
            }
        }
        return month;
    }

}
