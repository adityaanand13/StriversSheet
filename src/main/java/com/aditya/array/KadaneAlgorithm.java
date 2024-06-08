package com.aditya.array;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_sum = 0;
        int curr_sum = 0;

        for (int j : array) {
            curr_sum += j;
            if (curr_sum > max_sum)
                max_sum = curr_sum;
            if (curr_sum < 0)
                curr_sum = 0;

        }
        System.out.println(max_sum);
    }
}
