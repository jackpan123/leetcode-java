package com.jackpan.algorithms.sort;

public class SortUtils {

    public static void selectSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int min = numbers[i];
            for (int j=i+1; j < n; j++) {
                if (numbers[j] < numbers[i]) {
                    numbers[i] = numbers[j];
                    numbers[j] = min;
                    min = numbers[i];
                }
            }
        }
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number);
            System.out.print(", ");
        }
    }

    public static void selectSortTest() {
        int[] numbers = new int[]{0,8,9,7,4,6,65,43};
        selectSort(numbers);
        printArray(numbers);
    }

    public static void main(String[] args) {
        selectSortTest();
    }


}
