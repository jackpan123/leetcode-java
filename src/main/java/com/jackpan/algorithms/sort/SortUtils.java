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

    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int i1 = i; i1 > 0 && numbers[i1] < numbers[i1 - 1]; i1--) {
                int temp = numbers[i1];
                numbers[i1] = numbers[i1 - 1];
                numbers[i1] = temp;
            }
        }
    }

    public static void insertionSortOptimization(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int i1 = i; i1 > 0 ; i1--) {
                if (numbers[i1] < numbers[i1 - 1]) {
                    int temp = numbers[i1];
                    numbers[i1] = numbers[i1 - 1];
                    numbers[i1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number);
            System.out.print(", ");
        }
        System.out.println();
    }


    public static void selectSortTest(int[] numbers) {
        selectSort(numbers);
        printArray(numbers);

    }

    public static void insertionSortTest(int[] numbers) {
        insertionSort(numbers);
        printArray(numbers);
    }

    public static void insertionSortOptimizationTest(int[] numbers) {
        insertionSortOptimization(numbers);
        printArray(numbers);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{11,8,9,7,4,6,65,43};
        selectSortTest(numbers);
        insertionSortTest(numbers);
        insertionSortOptimizationTest(numbers);
    }


}
