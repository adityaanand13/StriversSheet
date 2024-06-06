package com.aditya.math;

import java.util.Scanner;

public class ReverseDigitNumber {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number to do reverse");

        int n = scanner.nextInt();
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("reverse = " + reverse);
    }
}
