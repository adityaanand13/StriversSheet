import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    System.out.println("enter number 1");
    int num1 = scanner.nextInt();
    System.out.println("enter number 2");
    int num2 = scanner.nextInt();

    int low = min(num1, num2);
    int high = max(num1, num2);
    int gcd = gcd(low, high);

    System.out.println("GCD = " + gcd);
}

private static int gcd(int a, int b) {
    if (a == 0)
        return b;
    return gcd(b % a, a);
}