package ru.netology.stats;

public class StatsService {
    public int allSalesAmount(long[] sales) {
        int allAmount = 0;     // allAmount - общая сумма продаж;
        for (long all : sales) {
            allAmount += all;

        }
        return allAmount;
    }

    public int averageAmount(long[] sales) {
        int average = 0;
        for (long sale : sales) {
            average = allSalesAmount(sales) / sales.length;      //average - средняя величина продаж;

        }
        return average;


    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;                 // maxMonth - максимальный месяц продаж; month - месяц;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;


    }

    public int minSales(long[] sales) {
        int minMonth = 0;                  // minMonth - минимальный месяц продаж;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowSales(long[] sales) {           // Количество месяцев ниже среднего значения;
        int mount = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                mount = mount + 1;
            }
        }
        return mount;

    }

    public int aboveSales(long[] sales) {            // Количество месяцев выше среднего значения.
        int mount = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                mount = mount + 1;
            }
        }
        return mount;
    }
}
























