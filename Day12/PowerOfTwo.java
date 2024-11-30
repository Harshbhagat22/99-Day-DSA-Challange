import java.util.Scanner;

public class PowerOfTwo {

	public static boolean isPowerOfTwo(int num) {
		return num > 0 && (num & (num - 1)) == 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		if (isPowerOfTwo(num)) {
			System.out.println(num + " is a power of 2.");
		} else {
			System.out.println(num + " is not a power of 2.");
		}

		scanner.close();
	}
}
