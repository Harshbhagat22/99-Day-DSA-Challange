import java.util.*;

public class HarshadNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = isHarshadNumber(n);
		System.out.print(flag);

	}

	public static boolean isHarshadNumber(int n) {
		int temp = n;
		int sum = 0;
		while(n !=0) {
			int  digit = n%10;
			sum += digit;
			n = n/10;
		}

		return (temp % sum == 0);
	}
}