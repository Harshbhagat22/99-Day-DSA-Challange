import java.util.*;

public class MedianOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		float result = medianOfArray(arr);
		System.out.println(result);
	}

	public static float medianOfArray(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		if (n % 2 == 0) {
			return (arr[n / 2] + arr[(n / 2) - 1]) / 2.0f;
		} else {
			return arr[n / 2];
		}
	}
}
