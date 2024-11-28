import java.util.*;
public class SumOfDivisors
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = sumOfDivisors(n);
		System.out.print(result);
	}

	public static int sumOfDivisors(int n) {
		if(n<=0) {
			return 0;
		}

		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum += i;
			}
		}

		return sum;
	}
}
