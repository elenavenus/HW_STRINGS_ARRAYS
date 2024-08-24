package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int moreThanAverage(int[] sales) {
        int average = calculateAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }

    public int lessThanAverage(int[] sales) {
        int average = calculateAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

}
