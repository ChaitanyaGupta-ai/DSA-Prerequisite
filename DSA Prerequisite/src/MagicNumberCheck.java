import java.util.Scanner;

public class MagicNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input from user
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (isMagicNumber(num)) {
			System.out.println(num + " is a Magic Number ✨");
		} else {
			System.out.println(num + " is NOT a Magic Number ❌");
		}

		sc.close();
	}

	// Method to check if a number is magic
	public static boolean isMagicNumber(int num) {
		int sum = num;

		// Keep reducing the number until it becomes a single digit
		while (sum > 9) {
			sum = sumOfDigits(sum);
		}

		// If the single digit is 1, it's a magic number
		return sum == 1;
	}

	// Helper method to calculate sum of digits
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}