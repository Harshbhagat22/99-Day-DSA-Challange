import java.util.*;
public class EvenOrOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n + " Is Even :\n");
		System.out.print(isEven(n)+"\n");
		System.out.print(n + " Is odd :\n");
		System.out.print(isOdd(n));

	}

	public static boolean isEven(int n) {
		return (n&1) == 0;
	}

	public static boolean isOdd(int n) {
		return (n&1) == 1;
	}

}
