import java.util.Scanner;

public class PerfectNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input from user
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (isPerfect(number)) {
			System.out.println(number + " is a Perfect Number ✅");
		} else {
			System.out.println(number + " is NOT a Perfect Number ❌");
		}

		sc.close();
	}

	// Method to check if a number is perfect
	public static boolean isPerfect(int num) {
		if (num <= 1) {
			return false;
		}

		int sum = 0;

		// Loop through possible divisors
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		return sum == num;
	}
}
