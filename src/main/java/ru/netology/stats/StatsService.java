package ru.netology.stats;

public class StatsService {
    public int sum(long[] sales) {
        int sumAllSale = 0;
        for (long sale : sales) {
            sumAllSale += sale;

        }

        return sumAllSale;
    }

    public long averageSales(long[] sales) {
        int sumAllSale = 0;
        for (long sale : sales) {
            sumAllSale += sale;
        }

        return sumAllSale / 12;
    }

    public int maxSaleMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;

    }

    public int minSaleMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int bMedium = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                bMedium++;
            }


        }

        return bMedium;
    }

    public int aboveAverage(long[] sales) {
        int aMedium = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                aMedium++;
            }

        }
        return aMedium;
    }
}