package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];//Массив
        int[] array2 = new int[]{
                1, 2, 3, 4, 5, 6, 7
        };
        // [20],[30],[0],[0],[0],[0],[0],[0],[0],[0]
        //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        array[0] = 20; //запись по индексу - 0
        array[1] = 30; //запись по индексу - 1
        array[2] = 10;
        array[3] = 25;
        array[4] = 50;
        StatsService statsService = new StatsService();
        System.out.println(statsService.maxSales(array));


        System.out.println(array[0]); //чтение по индексу - 0
        System.out.println(array[1]); //чтение по индексу - 1


    }
}
