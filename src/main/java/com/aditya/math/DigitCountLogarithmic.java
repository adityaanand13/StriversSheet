package com.aditya.math;

import java.util.Scanner;

public class DigitCountLogarithmic {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter digit to find count");
        int digit = scanner.nextInt();

        double digitCount = Math.log10(digit);

        System.out.println("digitCount = " + ((int) digitCount + 1));
    }
}
