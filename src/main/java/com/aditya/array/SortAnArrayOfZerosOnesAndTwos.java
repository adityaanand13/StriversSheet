package com.aditya.array;

import java.util.Arrays;

public class SortAnArrayOfZerosOnesAndTwos {
    //Dutch National Flag Algorithm
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        sortArray(array);
        System.out.println("Sorted Array = " + Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        int low = 0, mid = 0, high = array.length - 1;

        while (mid <= high) {
            switch (array[mid]) {
                case 0:
                    swap(array, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(array, mid, high--);
                    break;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
