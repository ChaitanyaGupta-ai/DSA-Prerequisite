import java.util.Scanner;

public class SpyNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSpyNumber(num)) {
            System.out.println(num + " is a Spy Number 🕵️‍♂️");
        } else {
            System.out.println(num + " is NOT a Spy Number ❌");
        }

        sc.close();
    }

    // Method to check Spy Number
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }
}