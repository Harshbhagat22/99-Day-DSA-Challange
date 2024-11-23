import java.util.*;

public class FactorialNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = factorial(n);
		System.out.print(res);

	}

	public static int factorial(int n) {
		if(n<2) {
			return 1;
		}

		return n * factorial(n-1);
	}


}
