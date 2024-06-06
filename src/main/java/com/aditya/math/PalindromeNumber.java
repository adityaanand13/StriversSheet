import java.util.Scanner;//language level 21

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    System.out.println("enter to a number to check a palindrome");
    int number = scanner.nextInt();

    int temp = number;
    int reverseNumber = 0;
    while (temp != 0) {
        int digit = temp % 10;
        reverseNumber = reverseNumber * 10 + digit;
        temp = temp / 10;
    }

    if (number == reverseNumber) {
        System.out.println("yes");
    }
}