package com.aditya.math;

import java.util.Arrays;
import java.util.Scanner;

public class DigitCount {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a number to count digit");
        int input = scanner.nextInt();
        scanner.close();

        int digitCount = 1;
        int n = input;
        while(n/10 != 0){
            n = n/10;
            digitCount++;
        }
        System.out.println("digitCount = " + digitCount);

    }
}
