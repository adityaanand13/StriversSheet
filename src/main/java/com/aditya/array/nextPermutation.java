package com.aditya.array;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 4, 3, 0, 0};

        int pivotIndex = pivotIndex(array);
        findNextGreatestAndSwap(array, pivotIndex);
        reverse(array, pivotIndex + 1, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private static void findNextGreatestAndSwap(int[] array, int pivotIndex) {
        int swapIndex = pivotIndex + 1;
        for (int i = pivotIndex + 1; i < array.length; i++) {
            if (array[i] < array[swapIndex] && array[i] > array[pivotIndex]) {
                swapIndex = i;
            }
        }
        int temp = array[swapIndex];
        array[swapIndex] = array[pivotIndex];
        array[pivotIndex] = temp;
    }

    private static int pivotIndex(int[] array) {
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    private static void reverse(int[] array, int i, int j) {
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
