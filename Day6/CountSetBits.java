import java.util.*;
public class CountSetBits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = findSetBits(n);
		System.out.print(result);

	}

	public static int findSetBits(int n) {
		int count = 0;
		for(int i=0; i<=n; i++) {
			count += Integer.bitCount(i);
		}

		return count;
	}
}
