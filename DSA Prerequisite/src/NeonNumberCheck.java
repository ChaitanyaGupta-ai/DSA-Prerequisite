import java.util.Scanner;

public class NeonNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isNeonNumber(num)) {
            System.out.println(num + " is a Neon Number ✨");
        } else {
            System.out.println(num + " is NOT a Neon Number ❌");
        }

        sc.close();
    }

    // Method to check Neon Number
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sumOfDigits = 0;

        // Sum the digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == num;
    }
}
