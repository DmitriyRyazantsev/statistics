package ru.netology.stats;

public class StatsService {
    public int sum(long[] sales) {
        int sum_all_sale = 0;
        for (int i = 0; i < sales.length; i++) {
            sum_all_sale += sales[i];

        }

        return sum_all_sale;
    }

    public long average_sales(long[] sales) {
        int sum_all_sale = 0;
        for (int i = 0; i < sales.length; i++) {
            sum_all_sale += sales[i];
        }
        long average_sales = sum_all_sale / 12;

        return average_sales;
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

    public int below_average(long[] sales) {
        int b_medium = 0;

        for (long sale : sales) {
            if (sale < average_sales(sales)) {
                b_medium++;
            }


        }

        return b_medium;
    }

    public int above_average(long[] sales) {
        int a_medium = 0;

        for (long sale : sales) {
            if (sale > average_sales(sales)) {
                a_medium++;
            }

        }
        return a_medium;
    }
}