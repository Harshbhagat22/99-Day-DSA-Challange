import java.util.*;
public class IsSumOfSubarrayIsZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(isSubarraySumZero(arr));
	}

	public static boolean isSubarraySumZero(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0 || set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}

		return false;
	}
}
