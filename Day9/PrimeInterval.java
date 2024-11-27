import java.util.*;

public class PrimeInterval
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PrimeInterval(n,m);
	}

	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}

		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}

		return true;
	}

	public static void PrimeInterval(int n,int m) {
		for(int i=n; i<=m; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}