import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number ✅");
        } else {
            System.out.println(number + " is NOT an Armstrong Number ❌");
        }

        sc.close();
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        // Count digits
        int digits = String.valueOf(num).length();

        // Calculate sum of powers of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
