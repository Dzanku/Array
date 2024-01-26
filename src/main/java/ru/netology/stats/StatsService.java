package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;


    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int sumMaxMonth(int[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[max] <= sales[i]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int sumMinMonth(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[min] >= sales[i]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int amountMonthUnderAvg(int[] sales) {
        double average = calculateAvg(sales);
        int count = 0;
        for (int month : sales) {
            if (month > average) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthOverAvg(int[] sales) {
        double average = calculateAvg(sales);
        int count = 0;
        for (int x : sales) {
            if (x < average) {
                count++;
            }
        }
        return count;
    }
}






