import java.util.*;

public class UnionOfTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int arr1[] = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		unionOfArrays(arr, arr1, n, m);
	}

	public static void unionOfArrays(int arr[], int arr1[], int n, int m) {
		int i = 0;
		int j = 0;

		while (i < n && j < m) {
			if (arr[i] < arr1[j]) {
				System.out.print(arr[i++] + " ");
			} else if (arr1[j] < arr[i]) {
				System.out.print(arr1[j++] + " ");
			} else {
				System.out.print(arr[i] + " ");
				i++;
				j++;
			}
		}

		while (i < n) {
			System.out.print(arr[i++] + " ");
		}

		while (j < m) {
			System.out.print(arr1[j++] + " ");
		}
	}
}
