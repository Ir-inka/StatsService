package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void sumOfAllSales() {
        int allSales = 180;
        int actual = service.allSalesAmount(sales);
        Assertions.assertEquals(allSales, actual);
    }


    @Test
    public void averageSalesPerMonth() {
        int averageSales = 15;
        int actual = service.averageAmount(sales);
        Assertions.assertEquals(averageSales, actual);
    }

    @Test
    public void peakSalesMonth() {
        int peakSales = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(peakSales, actual);
    }

    @Test
    public void monthMinSales() {
        int minSales = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(minSales, actual);
    }

    @Test
    public void belowAverageSales() {
        int averageSales = 5;
        int actual = service.belowSales(sales);
        Assertions.assertEquals(averageSales, actual);
    }

    @Test
    public void aboveAverageSales() {
        int aboveAverage = 5;
        int actual = service.aboveSales(sales);
        Assertions.assertEquals(aboveAverage, actual);


    }
}





