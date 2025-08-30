import java.util.Scanner;

public class StrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number 💪");
        } else {
            System.out.println(num + " is NOT a Strong Number ❌");
        }

        sc.close();
    }

    // Method to check Strong Number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}